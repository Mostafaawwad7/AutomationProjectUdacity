@SmokeTest
Feature: Search for a Product
  Scenario: Search for any product
    Given user click on search field and search for product
    And user click on search button
    Then user should be navigated to the right URL
