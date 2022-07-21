@SmokeTest
Feature: Register With New Data
  Scenario: Test Register
    Given user click on register
    When user enter "Mostafa" and "Awwad" as name
    And user choose gender
    And user enter date of birth
    And user enter "mostafaawad3111@gmail.com"
    And user enter company name as "Udacity"
    And Uncheck Newsletter box
    And user enter "123456789" as password
    And user click on register button
    Then Confirm that Registration is done