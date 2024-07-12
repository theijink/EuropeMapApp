package com.example.europe_map_app;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
    glue = "com.example.europe_map_app"
)
public class RunCucumberTest {
}
