package io.quarkus.arc.crazybeans.app.pkg2;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client2 {
    @Inject AppBean40 appbean40;
    @Inject AppBean41 appbean41;
    @Inject AppBean42 appbean42;
    @Inject AppBean43 appbean43;
    @Inject AppBean44 appbean44;
    @Inject AppBean45 appbean45;
    @Inject AppBean46 appbean46;
    @Inject AppBean47 appbean47;
    @Inject AppBean48 appbean48;
    @Inject AppBean49 appbean49;
    @Inject AppBean50 appbean50;
    @Inject AppBean51 appbean51;
    @Inject AppBean52 appbean52;
    @Inject AppBean53 appbean53;
    @Inject AppBean54 appbean54;
    @Inject AppBean55 appbean55;
    @Inject AppBean56 appbean56;
    @Inject AppBean57 appbean57;
    @Inject AppBean58 appbean58;
    @Inject AppBean59 appbean59;


    public void trigger(@Observes @Priority(1_000_000 + 2) StartupEvent ignored) {
        System.out.println(appbean40.getClass().getName() + " | " + appbean40.toString());
        System.out.println(appbean41.getClass().getName() + " | " + appbean41.toString());
        System.out.println(appbean42.getClass().getName() + " | " + appbean42.toString());
        System.out.println(appbean43.getClass().getName() + " | " + appbean43.toString());
        System.out.println(appbean44.getClass().getName() + " | " + appbean44.toString());
        System.out.println(appbean45.getClass().getName() + " | " + appbean45.toString());
        System.out.println(appbean46.getClass().getName() + " | " + appbean46.toString());
        System.out.println(appbean47.getClass().getName() + " | " + appbean47.toString());
        System.out.println(appbean48.getClass().getName() + " | " + appbean48.toString());
        System.out.println(appbean49.getClass().getName() + " | " + appbean49.toString());
        System.out.println(appbean50.getClass().getName() + " | " + appbean50.toString());
        System.out.println(appbean51.getClass().getName() + " | " + appbean51.toString());
        System.out.println(appbean52.getClass().getName() + " | " + appbean52.toString());
        System.out.println(appbean53.getClass().getName() + " | " + appbean53.toString());
        System.out.println(appbean54.getClass().getName() + " | " + appbean54.toString());
        System.out.println(appbean55.getClass().getName() + " | " + appbean55.toString());
        System.out.println(appbean56.getClass().getName() + " | " + appbean56.toString());
        System.out.println(appbean57.getClass().getName() + " | " + appbean57.toString());
        System.out.println(appbean58.getClass().getName() + " | " + appbean58.toString());
        System.out.println(appbean59.getClass().getName() + " | " + appbean59.toString());

    }
}
