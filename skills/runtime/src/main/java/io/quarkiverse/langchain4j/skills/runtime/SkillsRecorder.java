package io.quarkiverse.langchain4j.skills.runtime;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.jboss.logging.Logger;

import dev.langchain4j.service.tool.ToolProvider;
import dev.langchain4j.service.tool.ToolProviderResult;
import dev.langchain4j.skills.FileSystemSkill;
import dev.langchain4j.skills.FileSystemSkillLoader;
import dev.langchain4j.skills.Skills;
import io.quarkus.runtime.RuntimeValue;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class SkillsRecorder {

    private static final Logger log = Logger.getLogger(SkillsRecorder.class);

    private final RuntimeValue<SkillsConfiguration> configuration;

    public SkillsRecorder(RuntimeValue<SkillsConfiguration> configuration) {
        this.configuration = configuration;
    }

    public Supplier<ToolProvider> toolProviderSupplier() {
        return new Supplier<>() {
            @Override
            public ToolProvider get() {
                SkillsConfiguration config = configuration.getValue();
                if (config.directories().isEmpty() || config.directories().get().isEmpty()) {
                    log.warn("No skills directories configured (quarkus.langchain4j.skills.directories). "
                            + "The skills ToolProvider will provide no tools.");
                    return request -> ToolProviderResult.builder().build();
                }
                List<String> directories = config.directories().get();
                List<FileSystemSkill> allSkills = new ArrayList<>();
                for (String directory : directories) {
                    Path dirPath = resolveDirectory(directory);
                    if (dirPath != null && Files.isDirectory(dirPath)) {
                        List<FileSystemSkill> loaded = FileSystemSkillLoader.loadSkills(dirPath);
                        if (!loaded.isEmpty()) {
                            log.infof("Loaded %d skill(s) from directory: %s", loaded.size(), dirPath);
                            allSkills.addAll(loaded);
                        } else {
                            log.warnf("No skills found in directory: %s", dirPath);
                        }
                    } else {
                        log.warnf("Skills directory does not exist or is not a directory: %s", directory);
                    }
                }
                if (allSkills.isEmpty()) {
                    log.warn("No skills were loaded from any configured directory. "
                            + "The skills ToolProvider will provide no tools.");
                    return request -> ToolProviderResult.builder().build();
                }
                Skills skills = Skills.from(allSkills);
                return skills.toolProvider();
            }
        };
    }

    private static Path resolveDirectory(String directory) {
        // First try as a filesystem path
        Path fsPath = Paths.get(directory);
        if (Files.isDirectory(fsPath)) {
            return fsPath;
        }
        // Then try as a classpath resource
        URL resource = Thread.currentThread().getContextClassLoader().getResource(directory);
        if (resource != null) {
            try {
                return Paths.get(resource.toURI());
            } catch (Exception e) {
                log.warnf("Failed to resolve classpath resource '%s' as a path: %s", directory, e.getMessage());
            }
        }
        return null;
    }
}
