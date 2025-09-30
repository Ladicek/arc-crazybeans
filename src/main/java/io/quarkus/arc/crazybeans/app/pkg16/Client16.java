package io.quarkus.arc.crazybeans.app.pkg16;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client16 {
    @Inject AppBean320 appbean320;
    @Inject AppBean321 appbean321;
    @Inject AppBean322 appbean322;
    @Inject AppBean323 appbean323;
    @Inject AppBean324 appbean324;
    @Inject AppBean325 appbean325;
    @Inject AppBean326 appbean326;
    @Inject AppBean327 appbean327;
    @Inject AppBean328 appbean328;
    @Inject AppBean329 appbean329;
    @Inject AppBean330 appbean330;
    @Inject AppBean331 appbean331;
    @Inject AppBean332 appbean332;
    @Inject AppBean333 appbean333;
    @Inject AppBean334 appbean334;
    @Inject AppBean335 appbean335;
    @Inject AppBean336 appbean336;
    @Inject AppBean337 appbean337;
    @Inject AppBean338 appbean338;
    @Inject AppBean339 appbean339;


    public void trigger(@Observes @Priority(1_000_000 + 16) StartupEvent ignored) {
        System.out.println(appbean320.getClass().getName() + " | " + appbean320.toString());
        System.out.println(appbean321.getClass().getName() + " | " + appbean321.toString());
        System.out.println(appbean322.getClass().getName() + " | " + appbean322.toString());
        System.out.println(appbean323.getClass().getName() + " | " + appbean323.toString());
        System.out.println(appbean324.getClass().getName() + " | " + appbean324.toString());
        System.out.println(appbean325.getClass().getName() + " | " + appbean325.toString());
        System.out.println(appbean326.getClass().getName() + " | " + appbean326.toString());
        System.out.println(appbean327.getClass().getName() + " | " + appbean327.toString());
        System.out.println(appbean328.getClass().getName() + " | " + appbean328.toString());
        System.out.println(appbean329.getClass().getName() + " | " + appbean329.toString());
        System.out.println(appbean330.getClass().getName() + " | " + appbean330.toString());
        System.out.println(appbean331.getClass().getName() + " | " + appbean331.toString());
        System.out.println(appbean332.getClass().getName() + " | " + appbean332.toString());
        System.out.println(appbean333.getClass().getName() + " | " + appbean333.toString());
        System.out.println(appbean334.getClass().getName() + " | " + appbean334.toString());
        System.out.println(appbean335.getClass().getName() + " | " + appbean335.toString());
        System.out.println(appbean336.getClass().getName() + " | " + appbean336.toString());
        System.out.println(appbean337.getClass().getName() + " | " + appbean337.toString());
        System.out.println(appbean338.getClass().getName() + " | " + appbean338.toString());
        System.out.println(appbean339.getClass().getName() + " | " + appbean339.toString());

    }
}
