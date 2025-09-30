package io.quarkus.arc.crazybeans.app.pkg24;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client24 {
    @Inject AppBean480 appbean480;
    @Inject AppBean481 appbean481;
    @Inject AppBean482 appbean482;
    @Inject AppBean483 appbean483;
    @Inject AppBean484 appbean484;
    @Inject AppBean485 appbean485;
    @Inject AppBean486 appbean486;
    @Inject AppBean487 appbean487;
    @Inject AppBean488 appbean488;
    @Inject AppBean489 appbean489;
    @Inject AppBean490 appbean490;
    @Inject AppBean491 appbean491;
    @Inject AppBean492 appbean492;
    @Inject AppBean493 appbean493;
    @Inject AppBean494 appbean494;
    @Inject AppBean495 appbean495;
    @Inject AppBean496 appbean496;
    @Inject AppBean497 appbean497;
    @Inject AppBean498 appbean498;
    @Inject AppBean499 appbean499;


    public void trigger(@Observes @Priority(1_000_000 + 24) StartupEvent ignored) {
        System.out.println(appbean480.getClass().getName() + " | " + appbean480.toString());
        System.out.println(appbean481.getClass().getName() + " | " + appbean481.toString());
        System.out.println(appbean482.getClass().getName() + " | " + appbean482.toString());
        System.out.println(appbean483.getClass().getName() + " | " + appbean483.toString());
        System.out.println(appbean484.getClass().getName() + " | " + appbean484.toString());
        System.out.println(appbean485.getClass().getName() + " | " + appbean485.toString());
        System.out.println(appbean486.getClass().getName() + " | " + appbean486.toString());
        System.out.println(appbean487.getClass().getName() + " | " + appbean487.toString());
        System.out.println(appbean488.getClass().getName() + " | " + appbean488.toString());
        System.out.println(appbean489.getClass().getName() + " | " + appbean489.toString());
        System.out.println(appbean490.getClass().getName() + " | " + appbean490.toString());
        System.out.println(appbean491.getClass().getName() + " | " + appbean491.toString());
        System.out.println(appbean492.getClass().getName() + " | " + appbean492.toString());
        System.out.println(appbean493.getClass().getName() + " | " + appbean493.toString());
        System.out.println(appbean494.getClass().getName() + " | " + appbean494.toString());
        System.out.println(appbean495.getClass().getName() + " | " + appbean495.toString());
        System.out.println(appbean496.getClass().getName() + " | " + appbean496.toString());
        System.out.println(appbean497.getClass().getName() + " | " + appbean497.toString());
        System.out.println(appbean498.getClass().getName() + " | " + appbean498.toString());
        System.out.println(appbean499.getClass().getName() + " | " + appbean499.toString());

    }
}
