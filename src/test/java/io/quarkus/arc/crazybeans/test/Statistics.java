package io.quarkus.arc.crazybeans.test;

public class Statistics {
    private final double mean;
    private final double stddev;

    private final int median;
    private final int p90;
    private final int p95;
    private final int p99;
    private final int max;

    Statistics(double mean, double stddev, int median, int p90, int p95, int p99, int max) {
        this.mean = mean;
        this.stddev = stddev;
        this.median = median;
        this.p90 = p90;
        this.p95 = p95;
        this.p99 = p99;
        this.max = max;
    }

    public String format(String unit) {
        return String.format("%.3f ± %.3f %s (median %d %s, p90 %d %s, p95 %d %s, p99 %d %s, max %d %s)",
                mean, stddev, unit, median, unit, p90, unit, p95, unit, p99, unit, max, unit);
    }
}
