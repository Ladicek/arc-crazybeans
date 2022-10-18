package io.quarkus.arc.crazybeans.test;

import java.io.IOException;
import java.io.UncheckedIOException;

public class JvmRssMeasurement {
    public static void main(String[] args) throws IOException, InterruptedException {
        new Measurement(JvmRssMeasurement::startMeasuredProcess).run();
    }

    private static Process startMeasuredProcess() {
        try {
            return new ProcessBuilder("java", "-jar", "target/quarkus-app/quarkus-run.jar").start();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
