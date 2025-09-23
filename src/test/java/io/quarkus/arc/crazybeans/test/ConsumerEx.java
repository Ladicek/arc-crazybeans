package io.quarkus.arc.crazybeans.test;

@FunctionalInterface
public interface ConsumerEx<T> {
    void accept(T value) throws Exception;
}
