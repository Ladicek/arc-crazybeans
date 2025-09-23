package io.quarkus.arc.crazybeans.test;

@FunctionalInterface
public interface IntToIntFunction {
    int apply(int value);

    static IntToIntFunction identity() {
        return value -> value;
    }
}
