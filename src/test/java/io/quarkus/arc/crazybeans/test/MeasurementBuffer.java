package io.quarkus.arc.crazybeans.test;

import java.util.Objects;

public class MeasurementBuffer {
    private final IntToIntFunction stabilityRounding;
    private final int[] measurements;
    private int index;

    public MeasurementBuffer(int size) {
        stabilityRounding = IntToIntFunction.identity();
        measurements = new int[size];
        index = 0;
    }

    public MeasurementBuffer(int size, IntToIntFunction stabilityRounding) {
        this.stabilityRounding = Objects.requireNonNull(stabilityRounding);
        measurements = new int[size];
        index = 0;
    }

    public void add(int measurement) {
        measurements[index] = measurement;
        index = (index + 1) % measurements.length;
    }

    public boolean isStable() {
        int first = stabilityRounding.apply(measurements[0]);
        if (first == 0) {
            return false;
        }

        for (int i = 1; i < measurements.length; i++) {
            if (stabilityRounding.apply(measurements[i]) != first) {
                return false;
            }
        }
        return true;
    }

    public int getStableValue() {
        if (!isStable()) {
            throw new IllegalStateException("Measurement buffer not stable");
        }
        return measurements[0];
    }
}
