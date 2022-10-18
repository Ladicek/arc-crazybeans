package io.quarkus.arc.crazybeans.test;

import java.io.IOException;
import java.io.UncheckedIOException;

public class NativeRssMeasurement {
    public static void main(String[] args) throws IOException, InterruptedException {
        new Measurement(NativeRssMeasurement::startMeasuredProcess).run();
    }

    private static Process startMeasuredProcess() {
        try {
            return new ProcessBuilder("target/arc-crazybeans-1.0-runner").start();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
