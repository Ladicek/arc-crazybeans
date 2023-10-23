package io.quarkus.arc.crazybeans.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Generator {
    private static final String TEMPLATE = "package io.quarkus.arc.crazybeans.app.%s;\n"
            + "\n"
            + "import io.quarkus.arc.Unremovable;\n"
            + "import io.quarkus.arc.crazybeans.MyInterceptorBinding;\n"
            + "import io.quarkus.arc.crazybeans.MySimpleAnnotation;\n"
            + "import io.quarkus.runtime.StartupEvent;\n"
            + "import jakarta.enterprise.event.Observes;\n"
            + "import jakarta.inject.Singleton;\n"
            + "\n"
            + "@Singleton\n"
            + "@Unremovable\n"
            + "public class AppBean%s {\n"
            + "    public void init(@Observes StartupEvent ignored) {\n"
            + "        this.ping();\n"
            + "        this.pong();\n"
            + "        this.hello();\n"
            + "        this.bye();\n"
            + "    }\n"
            + "\n"
            + "    @MyInterceptorBinding\n"
            + "    @MySimpleAnnotation(\"foo\")\n"
            + "    public void ping() {\n"
            + "    }\n"
            + "\n"
            + "    @MyInterceptorBinding\n"
            + "    @MySimpleAnnotation(\"bar\")\n"
            + "    public void pong() {\n"
            + "    }\n"
            + "\n"
            + "    @MyInterceptorBinding\n"
            + "    @MySimpleAnnotation(\"baz\")\n"
            + "    public void hello() {\n"
            + "    }\n"
            + "\n"
            + "    @MyInterceptorBinding\n"
            + "    @MySimpleAnnotation(\"quux\")\n"
            + "    public void bye() {\n"
            + "    }\n"
            + "}\n";

    public static void main(String[] args) throws IOException {
        int totalCount = 500;
        int perPackageCount = 20;
        File outputDir = new File("src/main/java/io/quarkus/arc/crazybeans/app");
        if (outputDir.exists()) {
            Files.walk(outputDir.toPath()).map(Path::toFile).forEach(File::delete);
        }
        outputDir.mkdirs();
        for (int i = 0; i < totalCount; i++) {
            int pkg = i / perPackageCount;
            String pkgName = "pkg" + pkg;
            File pkgDir = new File(outputDir, pkgName);
            pkgDir.mkdirs();
            Path path = new File(pkgDir, "AppBean" + i + ".java").toPath();
            Files.write(path, String.format(TEMPLATE, pkgName, i).getBytes(StandardCharsets.UTF_8));
        }
    }
}
