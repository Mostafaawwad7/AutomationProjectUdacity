@SmokeTest
Feature: Login with valid data
    Scenario: Test Login
      Given user click on Login
        When user enter valid mail
      And user enter valid password
    And user click on login button
      Then user confirm login by checking the URL
