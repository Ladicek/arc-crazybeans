package io.quarkus.arc.crazybeans.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Generator {
    // template parameters:
    // 1. package name (`pkgN`)
    // 2. bean scope (`Singleton` or `ApplicationScoped`)
    // 3. order number (`N`)
    // 4. order number (`N`)
    private static final String TEMPLATE = """
            package io.quarkus.arc.crazybeans.app.%s;

            import io.quarkus.arc.Unremovable;
            import io.quarkus.arc.crazybeans.MyDependency;
            import io.quarkus.arc.crazybeans.MyInterceptorBinding;
            import io.quarkus.arc.crazybeans.MySimpleAnnotation;
            import io.quarkus.runtime.StartupEvent;
            import io.smallrye.common.annotation.Identifier;
            import jakarta.enterprise.context.ApplicationScoped;
            import jakarta.enterprise.context.Dependent;
            import jakarta.enterprise.inject.Produces;
            import jakarta.enterprise.event.Observes;
            import jakarta.inject.Singleton;

            @%s
            @Unremovable
            public class AppBean%s {
                public void init(@Observes StartupEvent ignored) {
                    this.ping();
                    this.pong();
                    this.hello();
                    this.bye();
                }

                @Produces
                @Dependent
                @Identifier("dep%s")
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
        for (int i = 0; i < totalCount; i++) {
            String scope = i % 2 == 0 ? "Singleton" : "ApplicationScoped";
            int pkg = i / perPackageCount;
            String pkgName = "pkg" + pkg;
            File pkgDir = new File(outputDir, pkgName);
            pkgDir.mkdirs();
            Path path = new File(pkgDir, "AppBean" + i + ".java").toPath();
            Files.writeString(path, String.format(TEMPLATE, pkgName, scope, i, i));
        }
    }
}
