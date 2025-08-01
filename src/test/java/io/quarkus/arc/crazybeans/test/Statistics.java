package io.quarkus.arc.crazybeans.test;

public class Statistics {
    private final double mean;
    private final double stddev;

    private final int median;
    private final int p99;

    Statistics(double mean, double stddev, int median, int p99) {
        this.mean = mean;
        this.stddev = stddev;
        this.median = median;
        this.p99 = p99;
    }

    public String format(String unit) {
        return String.format("%.3f ± %.3f %s (median %d %s, p99 %d %s)",
                mean, stddev, unit, median, unit, p99, unit);
    }
}
