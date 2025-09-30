package io.quarkus.arc.crazybeans.app.pkg12;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client12 {
    @Inject AppBean240 appbean240;
    @Inject AppBean241 appbean241;
    @Inject AppBean242 appbean242;
    @Inject AppBean243 appbean243;
    @Inject AppBean244 appbean244;
    @Inject AppBean245 appbean245;
    @Inject AppBean246 appbean246;
    @Inject AppBean247 appbean247;
    @Inject AppBean248 appbean248;
    @Inject AppBean249 appbean249;
    @Inject AppBean250 appbean250;
    @Inject AppBean251 appbean251;
    @Inject AppBean252 appbean252;
    @Inject AppBean253 appbean253;
    @Inject AppBean254 appbean254;
    @Inject AppBean255 appbean255;
    @Inject AppBean256 appbean256;
    @Inject AppBean257 appbean257;
    @Inject AppBean258 appbean258;
    @Inject AppBean259 appbean259;


    public void trigger(@Observes @Priority(1_000_000 + 12) StartupEvent ignored) {
        System.out.println(appbean240.getClass().getName() + " | " + appbean240.toString());
        System.out.println(appbean241.getClass().getName() + " | " + appbean241.toString());
        System.out.println(appbean242.getClass().getName() + " | " + appbean242.toString());
        System.out.println(appbean243.getClass().getName() + " | " + appbean243.toString());
        System.out.println(appbean244.getClass().getName() + " | " + appbean244.toString());
        System.out.println(appbean245.getClass().getName() + " | " + appbean245.toString());
        System.out.println(appbean246.getClass().getName() + " | " + appbean246.toString());
        System.out.println(appbean247.getClass().getName() + " | " + appbean247.toString());
        System.out.println(appbean248.getClass().getName() + " | " + appbean248.toString());
        System.out.println(appbean249.getClass().getName() + " | " + appbean249.toString());
        System.out.println(appbean250.getClass().getName() + " | " + appbean250.toString());
        System.out.println(appbean251.getClass().getName() + " | " + appbean251.toString());
        System.out.println(appbean252.getClass().getName() + " | " + appbean252.toString());
        System.out.println(appbean253.getClass().getName() + " | " + appbean253.toString());
        System.out.println(appbean254.getClass().getName() + " | " + appbean254.toString());
        System.out.println(appbean255.getClass().getName() + " | " + appbean255.toString());
        System.out.println(appbean256.getClass().getName() + " | " + appbean256.toString());
        System.out.println(appbean257.getClass().getName() + " | " + appbean257.toString());
        System.out.println(appbean258.getClass().getName() + " | " + appbean258.toString());
        System.out.println(appbean259.getClass().getName() + " | " + appbean259.toString());

    }
}
