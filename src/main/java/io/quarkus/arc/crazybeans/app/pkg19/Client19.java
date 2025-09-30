package io.quarkus.arc.crazybeans.app.pkg19;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client19 {
    @Inject AppBean380 appbean380;
    @Inject AppBean381 appbean381;
    @Inject AppBean382 appbean382;
    @Inject AppBean383 appbean383;
    @Inject AppBean384 appbean384;
    @Inject AppBean385 appbean385;
    @Inject AppBean386 appbean386;
    @Inject AppBean387 appbean387;
    @Inject AppBean388 appbean388;
    @Inject AppBean389 appbean389;
    @Inject AppBean390 appbean390;
    @Inject AppBean391 appbean391;
    @Inject AppBean392 appbean392;
    @Inject AppBean393 appbean393;
    @Inject AppBean394 appbean394;
    @Inject AppBean395 appbean395;
    @Inject AppBean396 appbean396;
    @Inject AppBean397 appbean397;
    @Inject AppBean398 appbean398;
    @Inject AppBean399 appbean399;


    public void trigger(@Observes @Priority(1_000_000 + 19) StartupEvent ignored) {
        System.out.println(appbean380.getClass().getName() + " | " + appbean380.toString());
        System.out.println(appbean381.getClass().getName() + " | " + appbean381.toString());
        System.out.println(appbean382.getClass().getName() + " | " + appbean382.toString());
        System.out.println(appbean383.getClass().getName() + " | " + appbean383.toString());
        System.out.println(appbean384.getClass().getName() + " | " + appbean384.toString());
        System.out.println(appbean385.getClass().getName() + " | " + appbean385.toString());
        System.out.println(appbean386.getClass().getName() + " | " + appbean386.toString());
        System.out.println(appbean387.getClass().getName() + " | " + appbean387.toString());
        System.out.println(appbean388.getClass().getName() + " | " + appbean388.toString());
        System.out.println(appbean389.getClass().getName() + " | " + appbean389.toString());
        System.out.println(appbean390.getClass().getName() + " | " + appbean390.toString());
        System.out.println(appbean391.getClass().getName() + " | " + appbean391.toString());
        System.out.println(appbean392.getClass().getName() + " | " + appbean392.toString());
        System.out.println(appbean393.getClass().getName() + " | " + appbean393.toString());
        System.out.println(appbean394.getClass().getName() + " | " + appbean394.toString());
        System.out.println(appbean395.getClass().getName() + " | " + appbean395.toString());
        System.out.println(appbean396.getClass().getName() + " | " + appbean396.toString());
        System.out.println(appbean397.getClass().getName() + " | " + appbean397.toString());
        System.out.println(appbean398.getClass().getName() + " | " + appbean398.toString());
        System.out.println(appbean399.getClass().getName() + " | " + appbean399.toString());

    }
}
