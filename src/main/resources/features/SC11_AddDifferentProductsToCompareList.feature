@SmokeTest
Feature: user could add different products to compare list
  Scenario: add products to compare list
    Given User choose any of the products to add to compare list
    When User click add to compare button
    And Confirming that the product is added to Compare list
    And Go to compare list
    Then Check Comparelist