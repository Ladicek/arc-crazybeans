package io.quarkus.arc.crazybeans.app.pkg0;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client0 {
    @Inject AppBean0 appbean0;
    @Inject AppBean1 appbean1;
    @Inject AppBean2 appbean2;
    @Inject AppBean3 appbean3;
    @Inject AppBean4 appbean4;
    @Inject AppBean5 appbean5;
    @Inject AppBean6 appbean6;
    @Inject AppBean7 appbean7;
    @Inject AppBean8 appbean8;
    @Inject AppBean9 appbean9;
    @Inject AppBean10 appbean10;
    @Inject AppBean11 appbean11;
    @Inject AppBean12 appbean12;
    @Inject AppBean13 appbean13;
    @Inject AppBean14 appbean14;
    @Inject AppBean15 appbean15;
    @Inject AppBean16 appbean16;
    @Inject AppBean17 appbean17;
    @Inject AppBean18 appbean18;
    @Inject AppBean19 appbean19;


    public void trigger(@Observes @Priority(1_000_000 + 0) StartupEvent ignored) {
        System.out.println(appbean0.getClass().getName() + " | " + appbean0.toString());
        System.out.println(appbean1.getClass().getName() + " | " + appbean1.toString());
        System.out.println(appbean2.getClass().getName() + " | " + appbean2.toString());
        System.out.println(appbean3.getClass().getName() + " | " + appbean3.toString());
        System.out.println(appbean4.getClass().getName() + " | " + appbean4.toString());
        System.out.println(appbean5.getClass().getName() + " | " + appbean5.toString());
        System.out.println(appbean6.getClass().getName() + " | " + appbean6.toString());
        System.out.println(appbean7.getClass().getName() + " | " + appbean7.toString());
        System.out.println(appbean8.getClass().getName() + " | " + appbean8.toString());
        System.out.println(appbean9.getClass().getName() + " | " + appbean9.toString());
        System.out.println(appbean10.getClass().getName() + " | " + appbean10.toString());
        System.out.println(appbean11.getClass().getName() + " | " + appbean11.toString());
        System.out.println(appbean12.getClass().getName() + " | " + appbean12.toString());
        System.out.println(appbean13.getClass().getName() + " | " + appbean13.toString());
        System.out.println(appbean14.getClass().getName() + " | " + appbean14.toString());
        System.out.println(appbean15.getClass().getName() + " | " + appbean15.toString());
        System.out.println(appbean16.getClass().getName() + " | " + appbean16.toString());
        System.out.println(appbean17.getClass().getName() + " | " + appbean17.toString());
        System.out.println(appbean18.getClass().getName() + " | " + appbean18.toString());
        System.out.println(appbean19.getClass().getName() + " | " + appbean19.toString());

    }
}
