package io.quarkus.arc.crazybeans.app.pkg22;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client22 {
    @Inject AppBean440 appbean440;
    @Inject AppBean441 appbean441;
    @Inject AppBean442 appbean442;
    @Inject AppBean443 appbean443;
    @Inject AppBean444 appbean444;
    @Inject AppBean445 appbean445;
    @Inject AppBean446 appbean446;
    @Inject AppBean447 appbean447;
    @Inject AppBean448 appbean448;
    @Inject AppBean449 appbean449;
    @Inject AppBean450 appbean450;
    @Inject AppBean451 appbean451;
    @Inject AppBean452 appbean452;
    @Inject AppBean453 appbean453;
    @Inject AppBean454 appbean454;
    @Inject AppBean455 appbean455;
    @Inject AppBean456 appbean456;
    @Inject AppBean457 appbean457;
    @Inject AppBean458 appbean458;
    @Inject AppBean459 appbean459;


    public void trigger(@Observes @Priority(1_000_000 + 22) StartupEvent ignored) {
        System.out.println(appbean440.getClass().getName() + " | " + appbean440.toString());
        System.out.println(appbean441.getClass().getName() + " | " + appbean441.toString());
        System.out.println(appbean442.getClass().getName() + " | " + appbean442.toString());
        System.out.println(appbean443.getClass().getName() + " | " + appbean443.toString());
        System.out.println(appbean444.getClass().getName() + " | " + appbean444.toString());
        System.out.println(appbean445.getClass().getName() + " | " + appbean445.toString());
        System.out.println(appbean446.getClass().getName() + " | " + appbean446.toString());
        System.out.println(appbean447.getClass().getName() + " | " + appbean447.toString());
        System.out.println(appbean448.getClass().getName() + " | " + appbean448.toString());
        System.out.println(appbean449.getClass().getName() + " | " + appbean449.toString());
        System.out.println(appbean450.getClass().getName() + " | " + appbean450.toString());
        System.out.println(appbean451.getClass().getName() + " | " + appbean451.toString());
        System.out.println(appbean452.getClass().getName() + " | " + appbean452.toString());
        System.out.println(appbean453.getClass().getName() + " | " + appbean453.toString());
        System.out.println(appbean454.getClass().getName() + " | " + appbean454.toString());
        System.out.println(appbean455.getClass().getName() + " | " + appbean455.toString());
        System.out.println(appbean456.getClass().getName() + " | " + appbean456.toString());
        System.out.println(appbean457.getClass().getName() + " | " + appbean457.toString());
        System.out.println(appbean458.getClass().getName() + " | " + appbean458.toString());
        System.out.println(appbean459.getClass().getName() + " | " + appbean459.toString());

    }
}
