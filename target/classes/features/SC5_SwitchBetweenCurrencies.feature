@SmokeTest
Feature: Checking Changing between currencies
  Scenario: change currency to Euro
    Given user click on currency button
    And user change currency to EURO
    Then all products should be shown in EUROS