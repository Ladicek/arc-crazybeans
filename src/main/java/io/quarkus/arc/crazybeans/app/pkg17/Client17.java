package io.quarkus.arc.crazybeans.app.pkg17;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client17 {
    @Inject AppBean340 appbean340;
    @Inject AppBean341 appbean341;
    @Inject AppBean342 appbean342;
    @Inject AppBean343 appbean343;
    @Inject AppBean344 appbean344;
    @Inject AppBean345 appbean345;
    @Inject AppBean346 appbean346;
    @Inject AppBean347 appbean347;
    @Inject AppBean348 appbean348;
    @Inject AppBean349 appbean349;
    @Inject AppBean350 appbean350;
    @Inject AppBean351 appbean351;
    @Inject AppBean352 appbean352;
    @Inject AppBean353 appbean353;
    @Inject AppBean354 appbean354;
    @Inject AppBean355 appbean355;
    @Inject AppBean356 appbean356;
    @Inject AppBean357 appbean357;
    @Inject AppBean358 appbean358;
    @Inject AppBean359 appbean359;


    public void trigger(@Observes @Priority(1_000_000 + 17) StartupEvent ignored) {
        System.out.println(appbean340.getClass().getName() + " | " + appbean340.toString());
        System.out.println(appbean341.getClass().getName() + " | " + appbean341.toString());
        System.out.println(appbean342.getClass().getName() + " | " + appbean342.toString());
        System.out.println(appbean343.getClass().getName() + " | " + appbean343.toString());
        System.out.println(appbean344.getClass().getName() + " | " + appbean344.toString());
        System.out.println(appbean345.getClass().getName() + " | " + appbean345.toString());
        System.out.println(appbean346.getClass().getName() + " | " + appbean346.toString());
        System.out.println(appbean347.getClass().getName() + " | " + appbean347.toString());
        System.out.println(appbean348.getClass().getName() + " | " + appbean348.toString());
        System.out.println(appbean349.getClass().getName() + " | " + appbean349.toString());
        System.out.println(appbean350.getClass().getName() + " | " + appbean350.toString());
        System.out.println(appbean351.getClass().getName() + " | " + appbean351.toString());
        System.out.println(appbean352.getClass().getName() + " | " + appbean352.toString());
        System.out.println(appbean353.getClass().getName() + " | " + appbean353.toString());
        System.out.println(appbean354.getClass().getName() + " | " + appbean354.toString());
        System.out.println(appbean355.getClass().getName() + " | " + appbean355.toString());
        System.out.println(appbean356.getClass().getName() + " | " + appbean356.toString());
        System.out.println(appbean357.getClass().getName() + " | " + appbean357.toString());
        System.out.println(appbean358.getClass().getName() + " | " + appbean358.toString());
        System.out.println(appbean359.getClass().getName() + " | " + appbean359.toString());

    }
}
