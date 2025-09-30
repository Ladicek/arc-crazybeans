package io.quarkus.arc.crazybeans.app.pkg18;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client18 {
    @Inject AppBean360 appbean360;
    @Inject AppBean361 appbean361;
    @Inject AppBean362 appbean362;
    @Inject AppBean363 appbean363;
    @Inject AppBean364 appbean364;
    @Inject AppBean365 appbean365;
    @Inject AppBean366 appbean366;
    @Inject AppBean367 appbean367;
    @Inject AppBean368 appbean368;
    @Inject AppBean369 appbean369;
    @Inject AppBean370 appbean370;
    @Inject AppBean371 appbean371;
    @Inject AppBean372 appbean372;
    @Inject AppBean373 appbean373;
    @Inject AppBean374 appbean374;
    @Inject AppBean375 appbean375;
    @Inject AppBean376 appbean376;
    @Inject AppBean377 appbean377;
    @Inject AppBean378 appbean378;
    @Inject AppBean379 appbean379;


    public void trigger(@Observes @Priority(1_000_000 + 18) StartupEvent ignored) {
        System.out.println(appbean360.getClass().getName() + " | " + appbean360.toString());
        System.out.println(appbean361.getClass().getName() + " | " + appbean361.toString());
        System.out.println(appbean362.getClass().getName() + " | " + appbean362.toString());
        System.out.println(appbean363.getClass().getName() + " | " + appbean363.toString());
        System.out.println(appbean364.getClass().getName() + " | " + appbean364.toString());
        System.out.println(appbean365.getClass().getName() + " | " + appbean365.toString());
        System.out.println(appbean366.getClass().getName() + " | " + appbean366.toString());
        System.out.println(appbean367.getClass().getName() + " | " + appbean367.toString());
        System.out.println(appbean368.getClass().getName() + " | " + appbean368.toString());
        System.out.println(appbean369.getClass().getName() + " | " + appbean369.toString());
        System.out.println(appbean370.getClass().getName() + " | " + appbean370.toString());
        System.out.println(appbean371.getClass().getName() + " | " + appbean371.toString());
        System.out.println(appbean372.getClass().getName() + " | " + appbean372.toString());
        System.out.println(appbean373.getClass().getName() + " | " + appbean373.toString());
        System.out.println(appbean374.getClass().getName() + " | " + appbean374.toString());
        System.out.println(appbean375.getClass().getName() + " | " + appbean375.toString());
        System.out.println(appbean376.getClass().getName() + " | " + appbean376.toString());
        System.out.println(appbean377.getClass().getName() + " | " + appbean377.toString());
        System.out.println(appbean378.getClass().getName() + " | " + appbean378.toString());
        System.out.println(appbean379.getClass().getName() + " | " + appbean379.toString());

    }
}
