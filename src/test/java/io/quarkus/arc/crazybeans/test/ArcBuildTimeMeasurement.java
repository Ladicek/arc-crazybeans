package io.quarkus.arc.crazybeans.test;

import io.quarkus.arc.processor.BeanArchives;
import io.quarkus.arc.processor.BeanProcessor;
import io.quarkus.arc.processor.bcextensions.ExtensionsEntryPoint;
import org.jboss.jandex.Index;
import org.jboss.jandex.IndexView;
import org.jboss.jandex.Indexer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class ArcBuildTimeMeasurement extends Measurement {
    @Test
    public void test() throws Exception {
        Statistics stats = new ArcBuildTimeMeasurement().run();
        System.out.println("Build time: " + stats.format("ms"));
    }

    @Override
    protected int measure() throws IOException, ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        int files = deploy();
        long end = System.currentTimeMillis();

        int result = (int) (end - start);
        System.out.println("Deployed in " + result + " ms (" + files + " files)");
        return result;
    }

    private int deploy() throws IOException, ExecutionException, InterruptedException {
        Map<String, byte[]> data = new HashMap<>();

        Index applicationIndex = buildApplicationIndex();
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
                            data.put(resource.getName(), resource.getData());
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown resource type " + resource.getType());
                    }
                })
                .build();
        beanProcessor.process();

        return data.size();
    }

    private Index buildApplicationIndex() throws IOException {
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
        return indexer.complete();
    }

}
