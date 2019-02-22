package com.testjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.testjpa")
@EntityScan(basePackages = "com.testjpa")
@EnableJpaRepositories(basePackages = "com.testjpa")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
