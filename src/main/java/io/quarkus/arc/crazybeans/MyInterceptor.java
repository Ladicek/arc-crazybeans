package io.quarkus.arc.crazybeans;

import io.quarkus.arc.ArcInvocationContext;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;

@MyInterceptorBinding
@Interceptor
@Priority(1)
public class MyInterceptor {
    @AroundInvoke
    public Object intercept(ArcInvocationContext ctx) throws Exception {
        System.out.println(ctx.getMethod());
        return ctx.proceed();
    }
}
