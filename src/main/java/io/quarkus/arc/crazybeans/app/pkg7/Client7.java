package io.quarkus.arc.crazybeans.app.pkg7;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client7 {
    @Inject AppBean140 appbean140;
    @Inject AppBean141 appbean141;
    @Inject AppBean142 appbean142;
    @Inject AppBean143 appbean143;
    @Inject AppBean144 appbean144;
    @Inject AppBean145 appbean145;
    @Inject AppBean146 appbean146;
    @Inject AppBean147 appbean147;
    @Inject AppBean148 appbean148;
    @Inject AppBean149 appbean149;
    @Inject AppBean150 appbean150;
    @Inject AppBean151 appbean151;
    @Inject AppBean152 appbean152;
    @Inject AppBean153 appbean153;
    @Inject AppBean154 appbean154;
    @Inject AppBean155 appbean155;
    @Inject AppBean156 appbean156;
    @Inject AppBean157 appbean157;
    @Inject AppBean158 appbean158;
    @Inject AppBean159 appbean159;


    public void trigger(@Observes @Priority(1_000_000 + 7) StartupEvent ignored) {
        System.out.println(appbean140.getClass().getName() + " | " + appbean140.toString());
        System.out.println(appbean141.getClass().getName() + " | " + appbean141.toString());
        System.out.println(appbean142.getClass().getName() + " | " + appbean142.toString());
        System.out.println(appbean143.getClass().getName() + " | " + appbean143.toString());
        System.out.println(appbean144.getClass().getName() + " | " + appbean144.toString());
        System.out.println(appbean145.getClass().getName() + " | " + appbean145.toString());
        System.out.println(appbean146.getClass().getName() + " | " + appbean146.toString());
        System.out.println(appbean147.getClass().getName() + " | " + appbean147.toString());
        System.out.println(appbean148.getClass().getName() + " | " + appbean148.toString());
        System.out.println(appbean149.getClass().getName() + " | " + appbean149.toString());
        System.out.println(appbean150.getClass().getName() + " | " + appbean150.toString());
        System.out.println(appbean151.getClass().getName() + " | " + appbean151.toString());
        System.out.println(appbean152.getClass().getName() + " | " + appbean152.toString());
        System.out.println(appbean153.getClass().getName() + " | " + appbean153.toString());
        System.out.println(appbean154.getClass().getName() + " | " + appbean154.toString());
        System.out.println(appbean155.getClass().getName() + " | " + appbean155.toString());
        System.out.println(appbean156.getClass().getName() + " | " + appbean156.toString());
        System.out.println(appbean157.getClass().getName() + " | " + appbean157.toString());
        System.out.println(appbean158.getClass().getName() + " | " + appbean158.toString());
        System.out.println(appbean159.getClass().getName() + " | " + appbean159.toString());

    }
}
