# ArC CrazyBeans

Attempt to measure certain ArC performance characteristics with a significant number of beans.

By default, each measurement is repeated 100 times.
After that, the mean, standard deviation, median and 99th percentile are reported.

To change the number of repetitions, set the system property `measurements`.
For example: `-Dmeasurements=5` to only repeat the measurements 5 times.

## Memory Footprint

To measure RSS usage, these steps are followed:

1. Start the Quarkus application
2. Measure its RSS by reading `/proc/$PID/smaps_rollup`
3. Sleep 100 millis
4. Go back to step 2, until 10 subsequent measurements are identical
5. Kill the Quarkus application
6. Report the last measured value

### JVM
         
```bash
mvn clean verify -Dit.test=JvmRssMeasurement
```

### Native

```bash
mvn clean verify -Dnative -Dit.test=NativeRssMeasurement
```
