package io.quarkus.arc.crazybeans.app.pkg8;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client8 {
    @Inject AppBean160 appbean160;
    @Inject AppBean161 appbean161;
    @Inject AppBean162 appbean162;
    @Inject AppBean163 appbean163;
    @Inject AppBean164 appbean164;
    @Inject AppBean165 appbean165;
    @Inject AppBean166 appbean166;
    @Inject AppBean167 appbean167;
    @Inject AppBean168 appbean168;
    @Inject AppBean169 appbean169;
    @Inject AppBean170 appbean170;
    @Inject AppBean171 appbean171;
    @Inject AppBean172 appbean172;
    @Inject AppBean173 appbean173;
    @Inject AppBean174 appbean174;
    @Inject AppBean175 appbean175;
    @Inject AppBean176 appbean176;
    @Inject AppBean177 appbean177;
    @Inject AppBean178 appbean178;
    @Inject AppBean179 appbean179;


    public void trigger(@Observes @Priority(1_000_000 + 8) StartupEvent ignored) {
        System.out.println(appbean160.getClass().getName() + " | " + appbean160.toString());
        System.out.println(appbean161.getClass().getName() + " | " + appbean161.toString());
        System.out.println(appbean162.getClass().getName() + " | " + appbean162.toString());
        System.out.println(appbean163.getClass().getName() + " | " + appbean163.toString());
        System.out.println(appbean164.getClass().getName() + " | " + appbean164.toString());
        System.out.println(appbean165.getClass().getName() + " | " + appbean165.toString());
        System.out.println(appbean166.getClass().getName() + " | " + appbean166.toString());
        System.out.println(appbean167.getClass().getName() + " | " + appbean167.toString());
        System.out.println(appbean168.getClass().getName() + " | " + appbean168.toString());
        System.out.println(appbean169.getClass().getName() + " | " + appbean169.toString());
        System.out.println(appbean170.getClass().getName() + " | " + appbean170.toString());
        System.out.println(appbean171.getClass().getName() + " | " + appbean171.toString());
        System.out.println(appbean172.getClass().getName() + " | " + appbean172.toString());
        System.out.println(appbean173.getClass().getName() + " | " + appbean173.toString());
        System.out.println(appbean174.getClass().getName() + " | " + appbean174.toString());
        System.out.println(appbean175.getClass().getName() + " | " + appbean175.toString());
        System.out.println(appbean176.getClass().getName() + " | " + appbean176.toString());
        System.out.println(appbean177.getClass().getName() + " | " + appbean177.toString());
        System.out.println(appbean178.getClass().getName() + " | " + appbean178.toString());
        System.out.println(appbean179.getClass().getName() + " | " + appbean179.toString());

    }
}
