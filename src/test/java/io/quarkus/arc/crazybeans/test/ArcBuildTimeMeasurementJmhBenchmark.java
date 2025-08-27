package io.quarkus.arc.crazybeans.test;

import io.quarkus.arc.processor.BeanArchives;
import io.quarkus.arc.processor.BeanProcessor;
import io.quarkus.arc.processor.bcextensions.ExtensionsEntryPoint;
import org.jboss.jandex.Index;
import org.jboss.jandex.IndexView;
import org.jboss.jandex.Indexer;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ArcBuildTimeMeasurementJmhBenchmark {

    @State(Scope.Benchmark) // one instance shared across all threads for the whole benchmark
    public static class ApplicationIndexState {
        Index applicationIndex;

        @Setup(Level.Trial)
        public void setUp() throws IOException {
            Indexer indexer = new Indexer();
            try (Stream<Path> appClasses = Files.walk(Path.of("target/classes"))) {
                List<Path> classFiles = appClasses
                        .filter(it -> it.toString().endsWith(".class") && !it.toString().endsWith("/Generator.class"))
                        .toList();
                for (Path classFile : classFiles) {
                    try (InputStream in = Files.newInputStream(classFile)) {
                        indexer.index(in);
                    }
                }
            }
            applicationIndex = indexer.complete();
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Fork(value = 1)
    @Threads(1)
    @Warmup(iterations = 10)
    @Measurement(iterations = 10)
    public void benchmarkArCInitialization(ApplicationIndexState applicationIndexState, Blackhole bh) throws SecurityException, IOException, ExecutionException, InterruptedException {
        Index applicationIndex = applicationIndexState.applicationIndex;
        IndexView beanArchiveIndex = BeanArchives.buildImmutableBeanArchiveIndex(applicationIndex);
        BeanProcessor beanProcessor = BeanProcessor.builder()
                .setName("crazybeans")
                .setImmutableBeanArchiveIndex(beanArchiveIndex)
                .setComputingBeanArchiveIndex(BeanArchives.buildComputingBeanArchiveIndex(
                        Thread.currentThread().getContextClassLoader(), new ConcurrentHashMap<>(),
                        beanArchiveIndex))
                .setApplicationIndex(applicationIndex)
                .setRemoveUnusedBeans(false)
                .setBuildCompatibleExtensions(new ExtensionsEntryPoint())
                .setOutput(resource -> {
                    switch (resource.getType()) {
                        case JAVA_CLASS:
                        case SERVICE_PROVIDER:
                            bh.consume(resource.getData());
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown resource type " + resource.getType());
                    }
                })
                .build();
        bh.consume(beanProcessor.process());
    }

    @Test
    public void runBenchmarks() throws RunnerException {
        ChainedOptionsBuilder opt = new OptionsBuilder()
                .include(this.getClass().getSimpleName() + ".*");

        Options options = opt.build();
        new Runner(options).run();
    }
}
