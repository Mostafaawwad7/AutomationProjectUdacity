@SmokeTest
Feature: Create Order
  Scenario: user make an order and entering all of his informations
    Given User choose the product
    Given User click add to cart button
    Given Confirming that the product is added to cart
    Given Go to cart
    Given agree terms and conditions
    When use click checkout
    And user Checkout as guest
    And user Enter billing address
    And user Enter shipping method
    And user Enter payment method
    And user Enter paymentInfo
    And User confirm order
    Then Confirm that order is done successfully





