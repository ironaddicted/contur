package com.smartphire.model.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"com.smartphire.model"})
@EntityScan({"com.smartphire.model"})
public class ModelConfig {
}
