package com.example.europe_map_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EuropeMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuropeMapApplication.class, args);
    }
}
