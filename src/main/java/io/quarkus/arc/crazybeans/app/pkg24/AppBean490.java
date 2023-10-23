package io.quarkus.arc.crazybeans.app.pkg24;

import io.quarkus.arc.Unremovable;
import io.quarkus.arc.crazybeans.MyInterceptorBinding;
import io.quarkus.arc.crazybeans.MySimpleAnnotation;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class AppBean490 {
    public void init(@Observes StartupEvent ignored) {
        this.ping();
        this.pong();
        this.hello();
        this.bye();
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
}
