Feature: Translate word

  Scenario: Translate 'Hello' to various languages
    Given the application is running
    When I request the translation of "Hello"
    Then the response should contain "Bonjour"
    And the response should contain "Hallo"
