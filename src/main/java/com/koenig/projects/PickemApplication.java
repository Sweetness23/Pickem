package com.koenig.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigurationProperties
@Configuration
@ComponentScan
public class PickemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickemApplication.class, args);
	}
}
