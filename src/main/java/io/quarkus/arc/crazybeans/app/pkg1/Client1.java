package io.quarkus.arc.crazybeans.app.pkg1;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client1 {
    @Inject AppBean20 appbean20;
    @Inject AppBean21 appbean21;
    @Inject AppBean22 appbean22;
    @Inject AppBean23 appbean23;
    @Inject AppBean24 appbean24;
    @Inject AppBean25 appbean25;
    @Inject AppBean26 appbean26;
    @Inject AppBean27 appbean27;
    @Inject AppBean28 appbean28;
    @Inject AppBean29 appbean29;
    @Inject AppBean30 appbean30;
    @Inject AppBean31 appbean31;
    @Inject AppBean32 appbean32;
    @Inject AppBean33 appbean33;
    @Inject AppBean34 appbean34;
    @Inject AppBean35 appbean35;
    @Inject AppBean36 appbean36;
    @Inject AppBean37 appbean37;
    @Inject AppBean38 appbean38;
    @Inject AppBean39 appbean39;


    public void trigger(@Observes @Priority(1_000_000 + 1) StartupEvent ignored) {
        System.out.println(appbean20.getClass().getName() + " | " + appbean20.toString());
        System.out.println(appbean21.getClass().getName() + " | " + appbean21.toString());
        System.out.println(appbean22.getClass().getName() + " | " + appbean22.toString());
        System.out.println(appbean23.getClass().getName() + " | " + appbean23.toString());
        System.out.println(appbean24.getClass().getName() + " | " + appbean24.toString());
        System.out.println(appbean25.getClass().getName() + " | " + appbean25.toString());
        System.out.println(appbean26.getClass().getName() + " | " + appbean26.toString());
        System.out.println(appbean27.getClass().getName() + " | " + appbean27.toString());
        System.out.println(appbean28.getClass().getName() + " | " + appbean28.toString());
        System.out.println(appbean29.getClass().getName() + " | " + appbean29.toString());
        System.out.println(appbean30.getClass().getName() + " | " + appbean30.toString());
        System.out.println(appbean31.getClass().getName() + " | " + appbean31.toString());
        System.out.println(appbean32.getClass().getName() + " | " + appbean32.toString());
        System.out.println(appbean33.getClass().getName() + " | " + appbean33.toString());
        System.out.println(appbean34.getClass().getName() + " | " + appbean34.toString());
        System.out.println(appbean35.getClass().getName() + " | " + appbean35.toString());
        System.out.println(appbean36.getClass().getName() + " | " + appbean36.toString());
        System.out.println(appbean37.getClass().getName() + " | " + appbean37.toString());
        System.out.println(appbean38.getClass().getName() + " | " + appbean38.toString());
        System.out.println(appbean39.getClass().getName() + " | " + appbean39.toString());

    }
}
