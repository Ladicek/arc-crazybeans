package io.quarkus.arc.crazybeans.app.pkg0;

import io.quarkus.arc.Unremovable;
import io.quarkus.arc.crazybeans.MyDependency;
import io.quarkus.arc.crazybeans.MyInterceptorBinding;
import io.quarkus.arc.crazybeans.MySimpleAnnotation;
import io.quarkus.runtime.StartupEvent;
import io.smallrye.common.annotation.Identifier;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class AppBean12 {
    public void init(@Observes @Priority(12) StartupEvent ignored) {
        this.ping();
        this.pong();
        this.hello();
        this.bye();
    }

    @Produces
    @Dependent
    @Identifier("dep12")
    public MyDependency produce() {
        return new MyDependency();
    }

    @MyInterceptorBinding
    @MySimpleAnnotation("foo")
    public void ping() {
    }

    @MyInterceptorBinding
    @MySimpleAnnotation("bar")
    public void pong() {
    }

    @MyInterceptorBinding
    @MySimpleAnnotation("baz")
    public void hello() {
    }

    @MyInterceptorBinding
    @MySimpleAnnotation("quux")
    public void bye() {
    }

    public String toString() {
        return this.getClass().getName();
    }
}
