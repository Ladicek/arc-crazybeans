package io.quarkus.arc.crazybeans.app.pkg10;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client10 {
    @Inject AppBean200 appbean200;
    @Inject AppBean201 appbean201;
    @Inject AppBean202 appbean202;
    @Inject AppBean203 appbean203;
    @Inject AppBean204 appbean204;
    @Inject AppBean205 appbean205;
    @Inject AppBean206 appbean206;
    @Inject AppBean207 appbean207;
    @Inject AppBean208 appbean208;
    @Inject AppBean209 appbean209;
    @Inject AppBean210 appbean210;
    @Inject AppBean211 appbean211;
    @Inject AppBean212 appbean212;
    @Inject AppBean213 appbean213;
    @Inject AppBean214 appbean214;
    @Inject AppBean215 appbean215;
    @Inject AppBean216 appbean216;
    @Inject AppBean217 appbean217;
    @Inject AppBean218 appbean218;
    @Inject AppBean219 appbean219;


    public void trigger(@Observes @Priority(1_000_000 + 10) StartupEvent ignored) {
        System.out.println(appbean200.getClass().getName() + " | " + appbean200.toString());
        System.out.println(appbean201.getClass().getName() + " | " + appbean201.toString());
        System.out.println(appbean202.getClass().getName() + " | " + appbean202.toString());
        System.out.println(appbean203.getClass().getName() + " | " + appbean203.toString());
        System.out.println(appbean204.getClass().getName() + " | " + appbean204.toString());
        System.out.println(appbean205.getClass().getName() + " | " + appbean205.toString());
        System.out.println(appbean206.getClass().getName() + " | " + appbean206.toString());
        System.out.println(appbean207.getClass().getName() + " | " + appbean207.toString());
        System.out.println(appbean208.getClass().getName() + " | " + appbean208.toString());
        System.out.println(appbean209.getClass().getName() + " | " + appbean209.toString());
        System.out.println(appbean210.getClass().getName() + " | " + appbean210.toString());
        System.out.println(appbean211.getClass().getName() + " | " + appbean211.toString());
        System.out.println(appbean212.getClass().getName() + " | " + appbean212.toString());
        System.out.println(appbean213.getClass().getName() + " | " + appbean213.toString());
        System.out.println(appbean214.getClass().getName() + " | " + appbean214.toString());
        System.out.println(appbean215.getClass().getName() + " | " + appbean215.toString());
        System.out.println(appbean216.getClass().getName() + " | " + appbean216.toString());
        System.out.println(appbean217.getClass().getName() + " | " + appbean217.toString());
        System.out.println(appbean218.getClass().getName() + " | " + appbean218.toString());
        System.out.println(appbean219.getClass().getName() + " | " + appbean219.toString());

    }
}
