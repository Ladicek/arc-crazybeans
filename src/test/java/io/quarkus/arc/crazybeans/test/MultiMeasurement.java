package io.quarkus.arc.crazybeans.test;

public abstract class MultiMeasurement {
    public Statistics[] run() throws Exception {
        int count = Integer.getInteger("measurements", 100);
        StatisticsBuffer[] statsBuffer = new StatisticsBuffer[size()];
        for (int i = 0; i < size(); i++) {
            statsBuffer[i] = new StatisticsBuffer(count);
        }
        for (int i = 0; i < count; i++) {
            int[] results = measure();
            for (int j = 0; j < size(); j++) {
                statsBuffer[j].add(results[j]);
            }
        }
        Statistics[] results = new Statistics[size()];
        for (int i = 0; i < size(); i++) {
            results[i] = statsBuffer[i].complete();
        }
        return results;
    }

    protected abstract int size();

    protected abstract int[] measure() throws Exception;
}
