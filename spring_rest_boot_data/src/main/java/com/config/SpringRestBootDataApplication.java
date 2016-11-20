package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EntityScan(basePackages = "com.model")
@EnableJpaRepositories(basePackages = "com.model")
public class SpringRestBootDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestBootDataApplication.class, args);
	}
}
