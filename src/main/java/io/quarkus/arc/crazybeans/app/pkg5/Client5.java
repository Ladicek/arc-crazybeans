package io.quarkus.arc.crazybeans.app.pkg5;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client5 {
    @Inject AppBean100 appbean100;
    @Inject AppBean101 appbean101;
    @Inject AppBean102 appbean102;
    @Inject AppBean103 appbean103;
    @Inject AppBean104 appbean104;
    @Inject AppBean105 appbean105;
    @Inject AppBean106 appbean106;
    @Inject AppBean107 appbean107;
    @Inject AppBean108 appbean108;
    @Inject AppBean109 appbean109;
    @Inject AppBean110 appbean110;
    @Inject AppBean111 appbean111;
    @Inject AppBean112 appbean112;
    @Inject AppBean113 appbean113;
    @Inject AppBean114 appbean114;
    @Inject AppBean115 appbean115;
    @Inject AppBean116 appbean116;
    @Inject AppBean117 appbean117;
    @Inject AppBean118 appbean118;
    @Inject AppBean119 appbean119;


    public void trigger(@Observes @Priority(1_000_000 + 5) StartupEvent ignored) {
        System.out.println(appbean100.getClass().getName() + " | " + appbean100.toString());
        System.out.println(appbean101.getClass().getName() + " | " + appbean101.toString());
        System.out.println(appbean102.getClass().getName() + " | " + appbean102.toString());
        System.out.println(appbean103.getClass().getName() + " | " + appbean103.toString());
        System.out.println(appbean104.getClass().getName() + " | " + appbean104.toString());
        System.out.println(appbean105.getClass().getName() + " | " + appbean105.toString());
        System.out.println(appbean106.getClass().getName() + " | " + appbean106.toString());
        System.out.println(appbean107.getClass().getName() + " | " + appbean107.toString());
        System.out.println(appbean108.getClass().getName() + " | " + appbean108.toString());
        System.out.println(appbean109.getClass().getName() + " | " + appbean109.toString());
        System.out.println(appbean110.getClass().getName() + " | " + appbean110.toString());
        System.out.println(appbean111.getClass().getName() + " | " + appbean111.toString());
        System.out.println(appbean112.getClass().getName() + " | " + appbean112.toString());
        System.out.println(appbean113.getClass().getName() + " | " + appbean113.toString());
        System.out.println(appbean114.getClass().getName() + " | " + appbean114.toString());
        System.out.println(appbean115.getClass().getName() + " | " + appbean115.toString());
        System.out.println(appbean116.getClass().getName() + " | " + appbean116.toString());
        System.out.println(appbean117.getClass().getName() + " | " + appbean117.toString());
        System.out.println(appbean118.getClass().getName() + " | " + appbean118.toString());
        System.out.println(appbean119.getClass().getName() + " | " + appbean119.toString());

    }
}
