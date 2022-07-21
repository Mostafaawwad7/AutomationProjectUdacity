@SmokeTest
  Feature: Test Reset password
    Scenario:   Test forget password
      Given user click on login link
      Given user click on forget password
      When user enter his email
      And user click on recover
      Then user should recieve confirmation message
