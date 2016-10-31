package com.smartphire.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.smartphire.webapp.config"})
public class ConturApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConturApplication.class, args);
	}
}
