# ArC CrazyBeans

Attempt to measure certain ArC performance characteristics with a significant number of beans.

By default, each measurement is repeated 100 times.
After that, the mean, standard deviation, median, 90th percentile, 95th percentile, 99th percentile and maximum are reported.

To change the number of repetitions, set the system property `measurements`.
For example: `-Dmeasurements=5` to only repeat the measurements 5 times.

## Memory Footprint

### RSS

To measure RSS usage, these steps are followed:

1. Start the Quarkus application
2. Measure its RSS by reading `/proc/$PID/smaps_rollup`
3. Sleep 100 millis
4. Go back to step 2, until 10 subsequent measurements are identical
5. Kill the Quarkus application
6. Report the last measured value

#### JVM
         
```bash
mvn clean verify -Dit.test=JvmRssMeasurement
```

#### Native

```bash
mvn clean verify -Dnative -Dit.test=NativeRssMeasurement
```

### Java heap and non-heap

To measure Java heap/non-heap usage, these steps are followed:

1. Start the Quarkus application
2. Connect to it over JMX and obtain the `MemoryMXBean` at `java.lang:type=Memory`
3. Initiate GC by calling `gc()`
4. Measure heap usage by calling `getHeapMemoryUsage().getUsed()`
5. Measure non-heap usage by calling `getNonHeapMemoryUsage().getUsed()`
6. Sleep 100 millis
7. Go back to step 3, until 10 subsequent measurements are identical (on the granularity of 1/4 MB, to not take too much time)
8. Kill the Quarkus application
9. Report the last measured value

#### JVM

```bash
mvn clean verify -Dit.test=JvmHeapMeasurement
```

## Build Time

To measure build time, these steps are followed:

1. Take current timestamp (`start`)
2. Index the application classes with Jandex
3. Run the ArC build process (crete the `BeanProcessor` and call `process()`)
4. Take current timestamp (`end`)
5. Report `end - start`

Note that the generated files are _not_ written to disk; they are only kept in memory.

```bash
mvn clean verify -Dit.test=ArcBuildTimeMeasurement
```

### Profiling

There are 3 scripts in the root directory of this project:

- `generate-alloc-profile.sh`
- `generate-cpu-profile.sh`
- `generate-wall-profile.sh`

They run the `ArcBuildTimeMeasurement` test under Async Profiler.
The `PATH_TO_ASYNC_PROFILER` environment variable must point to the Async Profiler installation directory for the scripts to work.
Async Profiler must be at least version 4.0.

### Benchmarking

There's also a JMH-based benchmark of ArC build called `ArcBuildTimeBenchmark`.
It should be used when you want to carefully compare performance between two ArC codebases (or the same ArC codebase with different dependency versions).
The code it benchmarks is almost _but not exactly_ the same as the code measured by `ArcBuildTimeMeasurement`.
The profiling scripts guarantee the same number of iterations, while the number of iterations in the benchmark is controlled by JMH.
                
```bash
mvn clean verify -Dit.test=ArcBuildTimeBenchmark
```
