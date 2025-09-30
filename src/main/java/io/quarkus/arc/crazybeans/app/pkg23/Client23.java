package io.quarkus.arc.crazybeans.app.pkg23;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client23 {
    @Inject AppBean460 appbean460;
    @Inject AppBean461 appbean461;
    @Inject AppBean462 appbean462;
    @Inject AppBean463 appbean463;
    @Inject AppBean464 appbean464;
    @Inject AppBean465 appbean465;
    @Inject AppBean466 appbean466;
    @Inject AppBean467 appbean467;
    @Inject AppBean468 appbean468;
    @Inject AppBean469 appbean469;
    @Inject AppBean470 appbean470;
    @Inject AppBean471 appbean471;
    @Inject AppBean472 appbean472;
    @Inject AppBean473 appbean473;
    @Inject AppBean474 appbean474;
    @Inject AppBean475 appbean475;
    @Inject AppBean476 appbean476;
    @Inject AppBean477 appbean477;
    @Inject AppBean478 appbean478;
    @Inject AppBean479 appbean479;


    public void trigger(@Observes @Priority(1_000_000 + 23) StartupEvent ignored) {
        System.out.println(appbean460.getClass().getName() + " | " + appbean460.toString());
        System.out.println(appbean461.getClass().getName() + " | " + appbean461.toString());
        System.out.println(appbean462.getClass().getName() + " | " + appbean462.toString());
        System.out.println(appbean463.getClass().getName() + " | " + appbean463.toString());
        System.out.println(appbean464.getClass().getName() + " | " + appbean464.toString());
        System.out.println(appbean465.getClass().getName() + " | " + appbean465.toString());
        System.out.println(appbean466.getClass().getName() + " | " + appbean466.toString());
        System.out.println(appbean467.getClass().getName() + " | " + appbean467.toString());
        System.out.println(appbean468.getClass().getName() + " | " + appbean468.toString());
        System.out.println(appbean469.getClass().getName() + " | " + appbean469.toString());
        System.out.println(appbean470.getClass().getName() + " | " + appbean470.toString());
        System.out.println(appbean471.getClass().getName() + " | " + appbean471.toString());
        System.out.println(appbean472.getClass().getName() + " | " + appbean472.toString());
        System.out.println(appbean473.getClass().getName() + " | " + appbean473.toString());
        System.out.println(appbean474.getClass().getName() + " | " + appbean474.toString());
        System.out.println(appbean475.getClass().getName() + " | " + appbean475.toString());
        System.out.println(appbean476.getClass().getName() + " | " + appbean476.toString());
        System.out.println(appbean477.getClass().getName() + " | " + appbean477.toString());
        System.out.println(appbean478.getClass().getName() + " | " + appbean478.toString());
        System.out.println(appbean479.getClass().getName() + " | " + appbean479.toString());

    }
}
