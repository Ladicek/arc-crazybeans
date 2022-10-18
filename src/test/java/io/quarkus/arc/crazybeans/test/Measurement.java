package io.quarkus.arc.crazybeans.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Supplier;

public class Measurement {
    private final Supplier<Process> processBuilder;

    public Measurement(Supplier<Process> processBuilder) {
        this.processBuilder = processBuilder;
    }

    public void run() throws IOException, InterruptedException {
        int count = Integer.getInteger("measurements", 100);
        StatisticsBuffer statsBuffer = new StatisticsBuffer(count);
        for (int i = 0; i < count; i++) {
            statsBuffer.add(measure());
        }
        Statistics stats = statsBuffer.complete();
        System.out.printf("RSS: %.3f ± %.3f kB (median %d kB, p99 %d kB)%n",
                stats.mean(), stats.stddev(), stats.median(), stats.p99());
    }

    private int measure() throws InterruptedException, IOException {
        long start = System.currentTimeMillis();

        MeasurementBuffer buffer = new MeasurementBuffer(10);
        Process process = processBuilder.get();
        while (!buffer.isStable()) {
            int rss = Files.readAllLines(Paths.get("/proc/" + process.pid() + "/smaps_rollup"))
                    .stream()
                    .filter(it -> it.startsWith("Rss:"))
                    .map(it -> it.replace("Rss:", "").replace("kB", "").trim())
                    .mapToInt(Integer::parseInt)
                    .findFirst()
                    .orElseThrow();
            buffer.add(rss);
            Thread.sleep(100);
        }

        long end = System.currentTimeMillis();

        int result = buffer.getStableValue();
        System.out.println(result + " kB (in " + (end - start) + " millis)");

        process.destroy();
        process.waitFor();

        return result;
    }
}
