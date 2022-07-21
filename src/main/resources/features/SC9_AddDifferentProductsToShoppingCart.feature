@SmokeTest
Feature: user could add different products to Shopping cart
  Scenario: Adding and checking cart
    Given User choose the product
    When User click add to cart button
    And Confirming that the product is added to cart
    And Go to cart
    Then Check Cart
