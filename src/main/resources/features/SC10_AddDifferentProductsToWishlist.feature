@SmokeTest
Feature: Add different products to wishlist
  Scenario: adding phone to wishlist
    Given User choose any of the products
    When User click add to wishlist button
    And Confirming that the product is added to Wishlist
    And Go to Wishlist
    Then Check Wishlist