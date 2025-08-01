package io.quarkus.arc.crazybeans.test;

public abstract class Measurement {
    public Statistics run() throws Exception {
        int count = Integer.getInteger("measurements", 100);
        StatisticsBuffer statsBuffer = new StatisticsBuffer(count);
        for (int i = 0; i < count; i++) {
            statsBuffer.add(measure());
        }
        return statsBuffer.complete();
    }

    protected abstract int measure() throws Exception;
}
