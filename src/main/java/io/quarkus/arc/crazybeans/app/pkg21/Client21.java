package io.quarkus.arc.crazybeans.app.pkg21;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client21 {
    @Inject AppBean420 appbean420;
    @Inject AppBean421 appbean421;
    @Inject AppBean422 appbean422;
    @Inject AppBean423 appbean423;
    @Inject AppBean424 appbean424;
    @Inject AppBean425 appbean425;
    @Inject AppBean426 appbean426;
    @Inject AppBean427 appbean427;
    @Inject AppBean428 appbean428;
    @Inject AppBean429 appbean429;
    @Inject AppBean430 appbean430;
    @Inject AppBean431 appbean431;
    @Inject AppBean432 appbean432;
    @Inject AppBean433 appbean433;
    @Inject AppBean434 appbean434;
    @Inject AppBean435 appbean435;
    @Inject AppBean436 appbean436;
    @Inject AppBean437 appbean437;
    @Inject AppBean438 appbean438;
    @Inject AppBean439 appbean439;


    public void trigger(@Observes @Priority(1_000_000 + 21) StartupEvent ignored) {
        System.out.println(appbean420.getClass().getName() + " | " + appbean420.toString());
        System.out.println(appbean421.getClass().getName() + " | " + appbean421.toString());
        System.out.println(appbean422.getClass().getName() + " | " + appbean422.toString());
        System.out.println(appbean423.getClass().getName() + " | " + appbean423.toString());
        System.out.println(appbean424.getClass().getName() + " | " + appbean424.toString());
        System.out.println(appbean425.getClass().getName() + " | " + appbean425.toString());
        System.out.println(appbean426.getClass().getName() + " | " + appbean426.toString());
        System.out.println(appbean427.getClass().getName() + " | " + appbean427.toString());
        System.out.println(appbean428.getClass().getName() + " | " + appbean428.toString());
        System.out.println(appbean429.getClass().getName() + " | " + appbean429.toString());
        System.out.println(appbean430.getClass().getName() + " | " + appbean430.toString());
        System.out.println(appbean431.getClass().getName() + " | " + appbean431.toString());
        System.out.println(appbean432.getClass().getName() + " | " + appbean432.toString());
        System.out.println(appbean433.getClass().getName() + " | " + appbean433.toString());
        System.out.println(appbean434.getClass().getName() + " | " + appbean434.toString());
        System.out.println(appbean435.getClass().getName() + " | " + appbean435.toString());
        System.out.println(appbean436.getClass().getName() + " | " + appbean436.toString());
        System.out.println(appbean437.getClass().getName() + " | " + appbean437.toString());
        System.out.println(appbean438.getClass().getName() + " | " + appbean438.toString());
        System.out.println(appbean439.getClass().getName() + " | " + appbean439.toString());

    }
}
