package com.example.europe_map_app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertTrue;

public class GreetingStepDefinitions {

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @Given("the application is running")
    public void the_application_is_running() {
        // Spring context will inject the TestRestTemplate
    }

    @When("I request the translation of {string}")
    public void i_request_the_translation_of(String word) {
        response = restTemplate.getForEntity("/?word=" + word, String.class);
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String translation) {
        assertTrue(response.getBody().contains(translation));
    }
}
