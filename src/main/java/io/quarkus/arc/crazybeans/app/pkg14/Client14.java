package io.quarkus.arc.crazybeans.app.pkg14;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client14 {
    @Inject AppBean280 appbean280;
    @Inject AppBean281 appbean281;
    @Inject AppBean282 appbean282;
    @Inject AppBean283 appbean283;
    @Inject AppBean284 appbean284;
    @Inject AppBean285 appbean285;
    @Inject AppBean286 appbean286;
    @Inject AppBean287 appbean287;
    @Inject AppBean288 appbean288;
    @Inject AppBean289 appbean289;
    @Inject AppBean290 appbean290;
    @Inject AppBean291 appbean291;
    @Inject AppBean292 appbean292;
    @Inject AppBean293 appbean293;
    @Inject AppBean294 appbean294;
    @Inject AppBean295 appbean295;
    @Inject AppBean296 appbean296;
    @Inject AppBean297 appbean297;
    @Inject AppBean298 appbean298;
    @Inject AppBean299 appbean299;


    public void trigger(@Observes @Priority(1_000_000 + 14) StartupEvent ignored) {
        System.out.println(appbean280.getClass().getName() + " | " + appbean280.toString());
        System.out.println(appbean281.getClass().getName() + " | " + appbean281.toString());
        System.out.println(appbean282.getClass().getName() + " | " + appbean282.toString());
        System.out.println(appbean283.getClass().getName() + " | " + appbean283.toString());
        System.out.println(appbean284.getClass().getName() + " | " + appbean284.toString());
        System.out.println(appbean285.getClass().getName() + " | " + appbean285.toString());
        System.out.println(appbean286.getClass().getName() + " | " + appbean286.toString());
        System.out.println(appbean287.getClass().getName() + " | " + appbean287.toString());
        System.out.println(appbean288.getClass().getName() + " | " + appbean288.toString());
        System.out.println(appbean289.getClass().getName() + " | " + appbean289.toString());
        System.out.println(appbean290.getClass().getName() + " | " + appbean290.toString());
        System.out.println(appbean291.getClass().getName() + " | " + appbean291.toString());
        System.out.println(appbean292.getClass().getName() + " | " + appbean292.toString());
        System.out.println(appbean293.getClass().getName() + " | " + appbean293.toString());
        System.out.println(appbean294.getClass().getName() + " | " + appbean294.toString());
        System.out.println(appbean295.getClass().getName() + " | " + appbean295.toString());
        System.out.println(appbean296.getClass().getName() + " | " + appbean296.toString());
        System.out.println(appbean297.getClass().getName() + " | " + appbean297.toString());
        System.out.println(appbean298.getClass().getName() + " | " + appbean298.toString());
        System.out.println(appbean299.getClass().getName() + " | " + appbean299.toString());

    }
}
