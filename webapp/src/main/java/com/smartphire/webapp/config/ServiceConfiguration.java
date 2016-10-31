package com.smartphire.webapp.config;

import com.smartphire.model.config.ModelConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by avoinovan on 10/28/16
 */
@Configuration
@ComponentScan({"com.smartphire.webapp.service"})
@Import(ModelConfig.class)
public class ServiceConfiguration {
}
