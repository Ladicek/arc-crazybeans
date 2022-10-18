package io.quarkus.arc.crazybeans.test;

public class MeasurementBuffer {
    private final int[] measurements;
    private int index;

    public MeasurementBuffer(int size) {
        measurements = new int[size];
        index = 0;
    }

    public void add(int measurement) {
        measurements[index] = measurement;
        index = (index + 1) % measurements.length;
    }

    public boolean isStable() {
        int first = measurements[0];
        if (first == 0) {
            return false;
        }

        for (int i = 1; i < measurements.length; i++) {
            if (measurements[i] != first) {
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
