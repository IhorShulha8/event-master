package com.eventmaster.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.eventmaster.application",
        "com.eventmaster.api",
        "com.eventmaster.persistence",
        "com.eventmaster.domain"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
