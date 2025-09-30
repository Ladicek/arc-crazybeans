package io.quarkus.arc.crazybeans.app.pkg20;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client20 {
    @Inject AppBean400 appbean400;
    @Inject AppBean401 appbean401;
    @Inject AppBean402 appbean402;
    @Inject AppBean403 appbean403;
    @Inject AppBean404 appbean404;
    @Inject AppBean405 appbean405;
    @Inject AppBean406 appbean406;
    @Inject AppBean407 appbean407;
    @Inject AppBean408 appbean408;
    @Inject AppBean409 appbean409;
    @Inject AppBean410 appbean410;
    @Inject AppBean411 appbean411;
    @Inject AppBean412 appbean412;
    @Inject AppBean413 appbean413;
    @Inject AppBean414 appbean414;
    @Inject AppBean415 appbean415;
    @Inject AppBean416 appbean416;
    @Inject AppBean417 appbean417;
    @Inject AppBean418 appbean418;
    @Inject AppBean419 appbean419;


    public void trigger(@Observes @Priority(1_000_000 + 20) StartupEvent ignored) {
        System.out.println(appbean400.getClass().getName() + " | " + appbean400.toString());
        System.out.println(appbean401.getClass().getName() + " | " + appbean401.toString());
        System.out.println(appbean402.getClass().getName() + " | " + appbean402.toString());
        System.out.println(appbean403.getClass().getName() + " | " + appbean403.toString());
        System.out.println(appbean404.getClass().getName() + " | " + appbean404.toString());
        System.out.println(appbean405.getClass().getName() + " | " + appbean405.toString());
        System.out.println(appbean406.getClass().getName() + " | " + appbean406.toString());
        System.out.println(appbean407.getClass().getName() + " | " + appbean407.toString());
        System.out.println(appbean408.getClass().getName() + " | " + appbean408.toString());
        System.out.println(appbean409.getClass().getName() + " | " + appbean409.toString());
        System.out.println(appbean410.getClass().getName() + " | " + appbean410.toString());
        System.out.println(appbean411.getClass().getName() + " | " + appbean411.toString());
        System.out.println(appbean412.getClass().getName() + " | " + appbean412.toString());
        System.out.println(appbean413.getClass().getName() + " | " + appbean413.toString());
        System.out.println(appbean414.getClass().getName() + " | " + appbean414.toString());
        System.out.println(appbean415.getClass().getName() + " | " + appbean415.toString());
        System.out.println(appbean416.getClass().getName() + " | " + appbean416.toString());
        System.out.println(appbean417.getClass().getName() + " | " + appbean417.toString());
        System.out.println(appbean418.getClass().getName() + " | " + appbean418.toString());
        System.out.println(appbean419.getClass().getName() + " | " + appbean419.toString());

    }
}
