package io.quarkus.arc.crazybeans.test;

import java.util.Arrays;

public class StatisticsBuffer {
    private final int count;
    private final int[] values;
    private int index;

    public StatisticsBuffer(int count) {
        if (count <= 1) {
            throw new IllegalArgumentException();
        }

        this.count = count;
        this.values = new int[count];
        this.index = 0;
    }

    public void add(int value) {
        values[index] = value;
        index++;
    }

    public Statistics complete() {
        if (index < count) {
            throw new IllegalStateException("Statistics not complete");
        }


        double mean = computeMean();
        double stddev = computeStddev(mean);

        Arrays.sort(values);
        int median = findPercentile(50);
        int p99 = findPercentile(99);

        return new Statistics(mean, stddev, median, p99);
    }

    private double computeMean() {
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }
        return sum / count;
    }

    private double computeStddev(double mean) {
        double sumOfSquaredDifferences = 0;
        for (int i = 0; i < count; i++) {
            sumOfSquaredDifferences += Math.pow(values[i] - mean, 2);
        }
        double variance = sumOfSquaredDifferences / (count - 1); // Bessel's correction
        return Math.sqrt(variance);
    }

    private int findPercentile(int percentile) {
        // nearest-rank percentile
        // - 1 because first index is 0 and last index is (count - 1)
        int index = (int) Math.ceil(count * (percentile / 100.0)) - 1;
        return values[index];
    }
}
