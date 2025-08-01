package io.quarkus.arc.crazybeans.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

public class JvmRssMeasurement extends RssMeasurement {
    @Test
    public void test() throws Exception {
        Statistics stats = new JvmRssMeasurement().run();
        System.out.println("RSS: " + stats.format("kB"));
    }

    public JvmRssMeasurement() {
        super(JvmRssMeasurement::startMeasuredProcess);
    }

    private static Process startMeasuredProcess() {
        try {
            return new ProcessBuilder("java", "-jar", "target/quarkus-app/quarkus-run.jar").start();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
