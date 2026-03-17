package io.quarkiverse.langchain4j.skills.runtime;

import java.util.List;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

@ConfigRoot(phase = ConfigPhase.RUN_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.skills")
public interface SkillsConfiguration {

    /**
     * List of directories from which skills should be loaded.
     * Each entry can be a relative path (resolved against the current working directory)
     * or a classpath resource path.
     */
    Optional<List<String>> directories();

}
