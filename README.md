# ArC CrazyBeans

Attempt to measure ArC memory footprint with a significant number of beans.
   
To measure average RSS usage, these steps are followed repeatedly:

1. Start the Quarkus application
2. Measure its RSS by reading `/proc/$PID/smaps_rollup`
3. Sleep 100 millis
4. Go back to step 2, until 10 subsequent measurements are identical
5. Kill the Quarkus application
6. Report the last measured value

By default, these steps are repeated 100 times.
After that, the mean and standard deviation are reported.

To change the number of repetitions, set the system property `measurements`.
For example: `-Dmeasurements=5` to only repeat the steps above 5 times.

## JVM
         
```bash
mvn clean package

java -cp target/test-classes/ io.quarkus.arc.crazybeans.test.JvmRssMeasurement
```

## Native

```bash
mvn clean package -Dnative

java -cp target/test-classes/ io.quarkus.arc.crazybeans.test.NativeRssMeasurement
```
