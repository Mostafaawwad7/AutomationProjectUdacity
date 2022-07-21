@SmokeTest
Feature: Select Different tags
  Scenario: choose random categories and tags
    Given user select random category
    When user select random tag
    Then user should see relative products to the selected tag