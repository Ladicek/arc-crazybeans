package io.quarkus.arc.crazybeans.app.pkg9;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client9 {
    @Inject AppBean180 appbean180;
    @Inject AppBean181 appbean181;
    @Inject AppBean182 appbean182;
    @Inject AppBean183 appbean183;
    @Inject AppBean184 appbean184;
    @Inject AppBean185 appbean185;
    @Inject AppBean186 appbean186;
    @Inject AppBean187 appbean187;
    @Inject AppBean188 appbean188;
    @Inject AppBean189 appbean189;
    @Inject AppBean190 appbean190;
    @Inject AppBean191 appbean191;
    @Inject AppBean192 appbean192;
    @Inject AppBean193 appbean193;
    @Inject AppBean194 appbean194;
    @Inject AppBean195 appbean195;
    @Inject AppBean196 appbean196;
    @Inject AppBean197 appbean197;
    @Inject AppBean198 appbean198;
    @Inject AppBean199 appbean199;


    public void trigger(@Observes @Priority(1_000_000 + 9) StartupEvent ignored) {
        System.out.println(appbean180.getClass().getName() + " | " + appbean180.toString());
        System.out.println(appbean181.getClass().getName() + " | " + appbean181.toString());
        System.out.println(appbean182.getClass().getName() + " | " + appbean182.toString());
        System.out.println(appbean183.getClass().getName() + " | " + appbean183.toString());
        System.out.println(appbean184.getClass().getName() + " | " + appbean184.toString());
        System.out.println(appbean185.getClass().getName() + " | " + appbean185.toString());
        System.out.println(appbean186.getClass().getName() + " | " + appbean186.toString());
        System.out.println(appbean187.getClass().getName() + " | " + appbean187.toString());
        System.out.println(appbean188.getClass().getName() + " | " + appbean188.toString());
        System.out.println(appbean189.getClass().getName() + " | " + appbean189.toString());
        System.out.println(appbean190.getClass().getName() + " | " + appbean190.toString());
        System.out.println(appbean191.getClass().getName() + " | " + appbean191.toString());
        System.out.println(appbean192.getClass().getName() + " | " + appbean192.toString());
        System.out.println(appbean193.getClass().getName() + " | " + appbean193.toString());
        System.out.println(appbean194.getClass().getName() + " | " + appbean194.toString());
        System.out.println(appbean195.getClass().getName() + " | " + appbean195.toString());
        System.out.println(appbean196.getClass().getName() + " | " + appbean196.toString());
        System.out.println(appbean197.getClass().getName() + " | " + appbean197.toString());
        System.out.println(appbean198.getClass().getName() + " | " + appbean198.toString());
        System.out.println(appbean199.getClass().getName() + " | " + appbean199.toString());

    }
}
