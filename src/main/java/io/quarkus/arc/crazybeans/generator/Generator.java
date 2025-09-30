package io.quarkus.arc.crazybeans.generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Generator {
    // template parameters:
    // 1. package order number (`N`)
    // 2. bean scope (`Singleton` or `ApplicationScoped`)
    // 3. class order number (`N`)
    private static final String BEAN_TEMPLATE = """
            package io.quarkus.arc.crazybeans.app.pkg%1$s;

            import io.quarkus.arc.Unremovable;
            import io.quarkus.arc.crazybeans.MyDependency;
            import io.quarkus.arc.crazybeans.MyInterceptorBinding;
            import io.quarkus.arc.crazybeans.MySimpleAnnotation;
            import io.quarkus.runtime.StartupEvent;
            import io.smallrye.common.annotation.Identifier;
            import jakarta.annotation.Priority;
            import jakarta.enterprise.context.ApplicationScoped;
            import jakarta.enterprise.context.Dependent;
            import jakarta.enterprise.inject.Produces;
            import jakarta.enterprise.event.Observes;
            import jakarta.inject.Singleton;

            @%2$s
            @Unremovable
            public class AppBean%3$s {
                public void init(@Observes @Priority(%3$s) StartupEvent ignored) {
                    this.ping();
                    this.pong();
                    this.hello();
                    this.bye();
                }

                @Produces
                @Dependent
                @Identifier("dep%3$s")
                public MyDependency produce() {
                    return new MyDependency();
                }

                @MyInterceptorBinding
                @MySimpleAnnotation("foo")
                public void ping() {
                }

                @MyInterceptorBinding
                @MySimpleAnnotation("bar")
                public void pong() {
                }

                @MyInterceptorBinding
                @MySimpleAnnotation("baz")
                public void hello() {
                }

                @MyInterceptorBinding
                @MySimpleAnnotation("quux")
                public void bye() {
                }

                public String toString() {
                    return this.getClass().getName();
                }
            }
            """;

    // template parameters:
    // 1. package order number (`N`)
    // 2. injections (`@Inject AppBean1 appbean1; ...`)
    // 3. calls (`appbean1.toString(); ...`)
    private static final String CLIENT_TEMPLATE = """
            package io.quarkus.arc.crazybeans.app.pkg%1$s;

            import io.quarkus.arc.Unremovable;
            import io.quarkus.runtime.StartupEvent;
            import jakarta.annotation.Priority;
            import jakarta.enterprise.event.Observes;
            import jakarta.inject.Inject;
            import jakarta.inject.Singleton;

            @Singleton
            @Unremovable
            public class Client%1$s {
            %2$s

                public void trigger(@Observes @Priority(1_000_000 + %1$s) StartupEvent ignored) {
            %3$s
                }
            }
            """;

    public static void main(String[] args) throws IOException {
        int totalCount = 500;
        int perPackageCount = 20;
        File outputDir = new File("src/main/java/io/quarkus/arc/crazybeans/app");
        if (outputDir.exists()) {
            Files.walk(outputDir.toPath()).map(Path::toFile).forEach(File::delete);
        }
        outputDir.mkdirs();
        Map<Integer, List<String>> classesByPackage = new HashMap<>();
        for (int i = 0; i < totalCount; i++) {
            String scope = i % 2 == 0 ? "Singleton" : "ApplicationScoped";
            int pkg = i / perPackageCount;
            File pkgDir = new File(outputDir, "pkg" + pkg);
            pkgDir.mkdirs();
            String className = "AppBean" + i;
            classesByPackage.computeIfAbsent(pkg, ignored -> new ArrayList<>()).add(className);
            Path path = new File(pkgDir, className + ".java").toPath();
            Files.writeString(path, String.format(BEAN_TEMPLATE, pkg, scope, i));
        }
        for (Map.Entry<Integer, List<String>> entry : classesByPackage.entrySet()) {
            Integer pkg = entry.getKey();
            List<String> classes = entry.getValue();

            StringBuilder injections = new StringBuilder();
            StringBuilder calls = new StringBuilder();
            for (String className : classes) {
                String field = className.toLowerCase(Locale.ROOT);
                injections.append("    @Inject ").append(className).append(" ").append(field).append(";\n");
                calls.append("        System.out.println(").append(field).append(".getClass().getName() + \" | \" + ")
                        .append(field).append(".toString());\n");
            }
            File pkgDir = new File(outputDir, "pkg" + pkg);
            Path path = new File(pkgDir, "Client" + pkg + ".java").toPath();
            Files.writeString(path, String.format(CLIENT_TEMPLATE, pkg, injections, calls));
        }
    }
}
