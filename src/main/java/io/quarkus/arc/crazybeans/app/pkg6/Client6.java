package io.quarkus.arc.crazybeans.app.pkg6;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client6 {
    @Inject AppBean120 appbean120;
    @Inject AppBean121 appbean121;
    @Inject AppBean122 appbean122;
    @Inject AppBean123 appbean123;
    @Inject AppBean124 appbean124;
    @Inject AppBean125 appbean125;
    @Inject AppBean126 appbean126;
    @Inject AppBean127 appbean127;
    @Inject AppBean128 appbean128;
    @Inject AppBean129 appbean129;
    @Inject AppBean130 appbean130;
    @Inject AppBean131 appbean131;
    @Inject AppBean132 appbean132;
    @Inject AppBean133 appbean133;
    @Inject AppBean134 appbean134;
    @Inject AppBean135 appbean135;
    @Inject AppBean136 appbean136;
    @Inject AppBean137 appbean137;
    @Inject AppBean138 appbean138;
    @Inject AppBean139 appbean139;


    public void trigger(@Observes @Priority(1_000_000 + 6) StartupEvent ignored) {
        System.out.println(appbean120.getClass().getName() + " | " + appbean120.toString());
        System.out.println(appbean121.getClass().getName() + " | " + appbean121.toString());
        System.out.println(appbean122.getClass().getName() + " | " + appbean122.toString());
        System.out.println(appbean123.getClass().getName() + " | " + appbean123.toString());
        System.out.println(appbean124.getClass().getName() + " | " + appbean124.toString());
        System.out.println(appbean125.getClass().getName() + " | " + appbean125.toString());
        System.out.println(appbean126.getClass().getName() + " | " + appbean126.toString());
        System.out.println(appbean127.getClass().getName() + " | " + appbean127.toString());
        System.out.println(appbean128.getClass().getName() + " | " + appbean128.toString());
        System.out.println(appbean129.getClass().getName() + " | " + appbean129.toString());
        System.out.println(appbean130.getClass().getName() + " | " + appbean130.toString());
        System.out.println(appbean131.getClass().getName() + " | " + appbean131.toString());
        System.out.println(appbean132.getClass().getName() + " | " + appbean132.toString());
        System.out.println(appbean133.getClass().getName() + " | " + appbean133.toString());
        System.out.println(appbean134.getClass().getName() + " | " + appbean134.toString());
        System.out.println(appbean135.getClass().getName() + " | " + appbean135.toString());
        System.out.println(appbean136.getClass().getName() + " | " + appbean136.toString());
        System.out.println(appbean137.getClass().getName() + " | " + appbean137.toString());
        System.out.println(appbean138.getClass().getName() + " | " + appbean138.toString());
        System.out.println(appbean139.getClass().getName() + " | " + appbean139.toString());

    }
}
