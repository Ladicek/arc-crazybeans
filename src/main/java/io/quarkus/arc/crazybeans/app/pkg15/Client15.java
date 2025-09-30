package io.quarkus.arc.crazybeans.app.pkg15;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client15 {
    @Inject AppBean300 appbean300;
    @Inject AppBean301 appbean301;
    @Inject AppBean302 appbean302;
    @Inject AppBean303 appbean303;
    @Inject AppBean304 appbean304;
    @Inject AppBean305 appbean305;
    @Inject AppBean306 appbean306;
    @Inject AppBean307 appbean307;
    @Inject AppBean308 appbean308;
    @Inject AppBean309 appbean309;
    @Inject AppBean310 appbean310;
    @Inject AppBean311 appbean311;
    @Inject AppBean312 appbean312;
    @Inject AppBean313 appbean313;
    @Inject AppBean314 appbean314;
    @Inject AppBean315 appbean315;
    @Inject AppBean316 appbean316;
    @Inject AppBean317 appbean317;
    @Inject AppBean318 appbean318;
    @Inject AppBean319 appbean319;


    public void trigger(@Observes @Priority(1_000_000 + 15) StartupEvent ignored) {
        System.out.println(appbean300.getClass().getName() + " | " + appbean300.toString());
        System.out.println(appbean301.getClass().getName() + " | " + appbean301.toString());
        System.out.println(appbean302.getClass().getName() + " | " + appbean302.toString());
        System.out.println(appbean303.getClass().getName() + " | " + appbean303.toString());
        System.out.println(appbean304.getClass().getName() + " | " + appbean304.toString());
        System.out.println(appbean305.getClass().getName() + " | " + appbean305.toString());
        System.out.println(appbean306.getClass().getName() + " | " + appbean306.toString());
        System.out.println(appbean307.getClass().getName() + " | " + appbean307.toString());
        System.out.println(appbean308.getClass().getName() + " | " + appbean308.toString());
        System.out.println(appbean309.getClass().getName() + " | " + appbean309.toString());
        System.out.println(appbean310.getClass().getName() + " | " + appbean310.toString());
        System.out.println(appbean311.getClass().getName() + " | " + appbean311.toString());
        System.out.println(appbean312.getClass().getName() + " | " + appbean312.toString());
        System.out.println(appbean313.getClass().getName() + " | " + appbean313.toString());
        System.out.println(appbean314.getClass().getName() + " | " + appbean314.toString());
        System.out.println(appbean315.getClass().getName() + " | " + appbean315.toString());
        System.out.println(appbean316.getClass().getName() + " | " + appbean316.toString());
        System.out.println(appbean317.getClass().getName() + " | " + appbean317.toString());
        System.out.println(appbean318.getClass().getName() + " | " + appbean318.toString());
        System.out.println(appbean319.getClass().getName() + " | " + appbean319.toString());

    }
}
