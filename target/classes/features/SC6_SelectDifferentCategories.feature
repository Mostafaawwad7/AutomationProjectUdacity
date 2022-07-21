@SmokeTest
Feature: Hover a category and choosing subCategory
  Scenario: choosing subCategory
    Given user hover category
    And user click on subCategory
    Then user should be navigated to the subCategory URL
