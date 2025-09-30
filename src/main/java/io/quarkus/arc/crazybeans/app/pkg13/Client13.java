package io.quarkus.arc.crazybeans.app.pkg13;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client13 {
    @Inject AppBean260 appbean260;
    @Inject AppBean261 appbean261;
    @Inject AppBean262 appbean262;
    @Inject AppBean263 appbean263;
    @Inject AppBean264 appbean264;
    @Inject AppBean265 appbean265;
    @Inject AppBean266 appbean266;
    @Inject AppBean267 appbean267;
    @Inject AppBean268 appbean268;
    @Inject AppBean269 appbean269;
    @Inject AppBean270 appbean270;
    @Inject AppBean271 appbean271;
    @Inject AppBean272 appbean272;
    @Inject AppBean273 appbean273;
    @Inject AppBean274 appbean274;
    @Inject AppBean275 appbean275;
    @Inject AppBean276 appbean276;
    @Inject AppBean277 appbean277;
    @Inject AppBean278 appbean278;
    @Inject AppBean279 appbean279;


    public void trigger(@Observes @Priority(1_000_000 + 13) StartupEvent ignored) {
        System.out.println(appbean260.getClass().getName() + " | " + appbean260.toString());
        System.out.println(appbean261.getClass().getName() + " | " + appbean261.toString());
        System.out.println(appbean262.getClass().getName() + " | " + appbean262.toString());
        System.out.println(appbean263.getClass().getName() + " | " + appbean263.toString());
        System.out.println(appbean264.getClass().getName() + " | " + appbean264.toString());
        System.out.println(appbean265.getClass().getName() + " | " + appbean265.toString());
        System.out.println(appbean266.getClass().getName() + " | " + appbean266.toString());
        System.out.println(appbean267.getClass().getName() + " | " + appbean267.toString());
        System.out.println(appbean268.getClass().getName() + " | " + appbean268.toString());
        System.out.println(appbean269.getClass().getName() + " | " + appbean269.toString());
        System.out.println(appbean270.getClass().getName() + " | " + appbean270.toString());
        System.out.println(appbean271.getClass().getName() + " | " + appbean271.toString());
        System.out.println(appbean272.getClass().getName() + " | " + appbean272.toString());
        System.out.println(appbean273.getClass().getName() + " | " + appbean273.toString());
        System.out.println(appbean274.getClass().getName() + " | " + appbean274.toString());
        System.out.println(appbean275.getClass().getName() + " | " + appbean275.toString());
        System.out.println(appbean276.getClass().getName() + " | " + appbean276.toString());
        System.out.println(appbean277.getClass().getName() + " | " + appbean277.toString());
        System.out.println(appbean278.getClass().getName() + " | " + appbean278.toString());
        System.out.println(appbean279.getClass().getName() + " | " + appbean279.toString());

    }
}
