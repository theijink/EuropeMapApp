package com.example.europe_map_app;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = EuropeMapApplication.class)
public class CucumberSpringConfiguration {
}
