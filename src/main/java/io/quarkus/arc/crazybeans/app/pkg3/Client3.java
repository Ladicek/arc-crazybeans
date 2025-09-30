package io.quarkus.arc.crazybeans.app.pkg3;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client3 {
    @Inject AppBean60 appbean60;
    @Inject AppBean61 appbean61;
    @Inject AppBean62 appbean62;
    @Inject AppBean63 appbean63;
    @Inject AppBean64 appbean64;
    @Inject AppBean65 appbean65;
    @Inject AppBean66 appbean66;
    @Inject AppBean67 appbean67;
    @Inject AppBean68 appbean68;
    @Inject AppBean69 appbean69;
    @Inject AppBean70 appbean70;
    @Inject AppBean71 appbean71;
    @Inject AppBean72 appbean72;
    @Inject AppBean73 appbean73;
    @Inject AppBean74 appbean74;
    @Inject AppBean75 appbean75;
    @Inject AppBean76 appbean76;
    @Inject AppBean77 appbean77;
    @Inject AppBean78 appbean78;
    @Inject AppBean79 appbean79;


    public void trigger(@Observes @Priority(1_000_000 + 3) StartupEvent ignored) {
        System.out.println(appbean60.getClass().getName() + " | " + appbean60.toString());
        System.out.println(appbean61.getClass().getName() + " | " + appbean61.toString());
        System.out.println(appbean62.getClass().getName() + " | " + appbean62.toString());
        System.out.println(appbean63.getClass().getName() + " | " + appbean63.toString());
        System.out.println(appbean64.getClass().getName() + " | " + appbean64.toString());
        System.out.println(appbean65.getClass().getName() + " | " + appbean65.toString());
        System.out.println(appbean66.getClass().getName() + " | " + appbean66.toString());
        System.out.println(appbean67.getClass().getName() + " | " + appbean67.toString());
        System.out.println(appbean68.getClass().getName() + " | " + appbean68.toString());
        System.out.println(appbean69.getClass().getName() + " | " + appbean69.toString());
        System.out.println(appbean70.getClass().getName() + " | " + appbean70.toString());
        System.out.println(appbean71.getClass().getName() + " | " + appbean71.toString());
        System.out.println(appbean72.getClass().getName() + " | " + appbean72.toString());
        System.out.println(appbean73.getClass().getName() + " | " + appbean73.toString());
        System.out.println(appbean74.getClass().getName() + " | " + appbean74.toString());
        System.out.println(appbean75.getClass().getName() + " | " + appbean75.toString());
        System.out.println(appbean76.getClass().getName() + " | " + appbean76.toString());
        System.out.println(appbean77.getClass().getName() + " | " + appbean77.toString());
        System.out.println(appbean78.getClass().getName() + " | " + appbean78.toString());
        System.out.println(appbean79.getClass().getName() + " | " + appbean79.toString());

    }
}
