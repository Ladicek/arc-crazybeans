package io.quarkus.arc.crazybeans.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;

public class JvmHeapMeasurement extends HeapMeasurement {
    @Test
    public void test() throws Exception {
        Statistics[] stats = new JvmHeapMeasurement().run();
        System.out.println("Heap: " + stats[0].format("kB"));
        System.out.println("NonHeap: " + stats[1].format("kB"));
    }

    public JvmHeapMeasurement() {
        super(JvmHeapMeasurement::startMeasuredProcess);
    }

    private static Process startMeasuredProcess() {
        try {
            return new ProcessBuilder("java",
                    "-Xint",
                    "-XX:+UnlockExperimentalVMOptions",
                    "-XX:+UseEpsilonGC",
                    "-XX:-ClassUnloading",
                    "-Xmx100m",
                    "-jar",
                    "target/quarkus-app/quarkus-run.jar")
                    .redirectOutput(ProcessBuilder.Redirect.DISCARD)
                    .redirectError(ProcessBuilder.Redirect.DISCARD)
                    .start();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
