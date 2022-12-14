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

    public double mean() {
        return mean;
    }

    public double stddev() {
        return stddev;
    }

    public int median() {
        return median;
    }

    public int p99() {
        return p99;
    }
}
