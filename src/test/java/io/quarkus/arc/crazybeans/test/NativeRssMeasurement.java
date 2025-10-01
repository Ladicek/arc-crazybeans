package io.quarkus.arc.crazybeans.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UncheckedIOException;

public class NativeRssMeasurement extends RssMeasurement {
    @Test
    public void test() throws Exception {
        Statistics stats = new NativeRssMeasurement().run();
        System.out.println("RSS: " + stats.format("kB"));
    }

    public NativeRssMeasurement() {
        super(NativeRssMeasurement::startMeasuredProcess);
    }

    private static Process startMeasuredProcess() {
        try {
            return new ProcessBuilder("target/arc-crazybeans-1.0-runner")
                    .redirectOutput(ProcessBuilder.Redirect.DISCARD)
                    .redirectError(ProcessBuilder.Redirect.DISCARD)
                    .start();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
