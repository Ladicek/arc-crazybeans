package io.quarkus.arc.crazybeans.app.pkg4;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client4 {
    @Inject AppBean80 appbean80;
    @Inject AppBean81 appbean81;
    @Inject AppBean82 appbean82;
    @Inject AppBean83 appbean83;
    @Inject AppBean84 appbean84;
    @Inject AppBean85 appbean85;
    @Inject AppBean86 appbean86;
    @Inject AppBean87 appbean87;
    @Inject AppBean88 appbean88;
    @Inject AppBean89 appbean89;
    @Inject AppBean90 appbean90;
    @Inject AppBean91 appbean91;
    @Inject AppBean92 appbean92;
    @Inject AppBean93 appbean93;
    @Inject AppBean94 appbean94;
    @Inject AppBean95 appbean95;
    @Inject AppBean96 appbean96;
    @Inject AppBean97 appbean97;
    @Inject AppBean98 appbean98;
    @Inject AppBean99 appbean99;


    public void trigger(@Observes @Priority(1_000_000 + 4) StartupEvent ignored) {
        System.out.println(appbean80.getClass().getName() + " | " + appbean80.toString());
        System.out.println(appbean81.getClass().getName() + " | " + appbean81.toString());
        System.out.println(appbean82.getClass().getName() + " | " + appbean82.toString());
        System.out.println(appbean83.getClass().getName() + " | " + appbean83.toString());
        System.out.println(appbean84.getClass().getName() + " | " + appbean84.toString());
        System.out.println(appbean85.getClass().getName() + " | " + appbean85.toString());
        System.out.println(appbean86.getClass().getName() + " | " + appbean86.toString());
        System.out.println(appbean87.getClass().getName() + " | " + appbean87.toString());
        System.out.println(appbean88.getClass().getName() + " | " + appbean88.toString());
        System.out.println(appbean89.getClass().getName() + " | " + appbean89.toString());
        System.out.println(appbean90.getClass().getName() + " | " + appbean90.toString());
        System.out.println(appbean91.getClass().getName() + " | " + appbean91.toString());
        System.out.println(appbean92.getClass().getName() + " | " + appbean92.toString());
        System.out.println(appbean93.getClass().getName() + " | " + appbean93.toString());
        System.out.println(appbean94.getClass().getName() + " | " + appbean94.toString());
        System.out.println(appbean95.getClass().getName() + " | " + appbean95.toString());
        System.out.println(appbean96.getClass().getName() + " | " + appbean96.toString());
        System.out.println(appbean97.getClass().getName() + " | " + appbean97.toString());
        System.out.println(appbean98.getClass().getName() + " | " + appbean98.toString());
        System.out.println(appbean99.getClass().getName() + " | " + appbean99.toString());

    }
}
