package io.quarkus.arc.crazybeans.app.pkg11;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
public class Client11 {
    @Inject AppBean220 appbean220;
    @Inject AppBean221 appbean221;
    @Inject AppBean222 appbean222;
    @Inject AppBean223 appbean223;
    @Inject AppBean224 appbean224;
    @Inject AppBean225 appbean225;
    @Inject AppBean226 appbean226;
    @Inject AppBean227 appbean227;
    @Inject AppBean228 appbean228;
    @Inject AppBean229 appbean229;
    @Inject AppBean230 appbean230;
    @Inject AppBean231 appbean231;
    @Inject AppBean232 appbean232;
    @Inject AppBean233 appbean233;
    @Inject AppBean234 appbean234;
    @Inject AppBean235 appbean235;
    @Inject AppBean236 appbean236;
    @Inject AppBean237 appbean237;
    @Inject AppBean238 appbean238;
    @Inject AppBean239 appbean239;


    public void trigger(@Observes @Priority(1_000_000 + 11) StartupEvent ignored) {
        System.out.println(appbean220.getClass().getName() + " | " + appbean220.toString());
        System.out.println(appbean221.getClass().getName() + " | " + appbean221.toString());
        System.out.println(appbean222.getClass().getName() + " | " + appbean222.toString());
        System.out.println(appbean223.getClass().getName() + " | " + appbean223.toString());
        System.out.println(appbean224.getClass().getName() + " | " + appbean224.toString());
        System.out.println(appbean225.getClass().getName() + " | " + appbean225.toString());
        System.out.println(appbean226.getClass().getName() + " | " + appbean226.toString());
        System.out.println(appbean227.getClass().getName() + " | " + appbean227.toString());
        System.out.println(appbean228.getClass().getName() + " | " + appbean228.toString());
        System.out.println(appbean229.getClass().getName() + " | " + appbean229.toString());
        System.out.println(appbean230.getClass().getName() + " | " + appbean230.toString());
        System.out.println(appbean231.getClass().getName() + " | " + appbean231.toString());
        System.out.println(appbean232.getClass().getName() + " | " + appbean232.toString());
        System.out.println(appbean233.getClass().getName() + " | " + appbean233.toString());
        System.out.println(appbean234.getClass().getName() + " | " + appbean234.toString());
        System.out.println(appbean235.getClass().getName() + " | " + appbean235.toString());
        System.out.println(appbean236.getClass().getName() + " | " + appbean236.toString());
        System.out.println(appbean237.getClass().getName() + " | " + appbean237.toString());
        System.out.println(appbean238.getClass().getName() + " | " + appbean238.toString());
        System.out.println(appbean239.getClass().getName() + " | " + appbean239.toString());

    }
}
