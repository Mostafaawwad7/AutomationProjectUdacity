@SmokeTest
Feature:Filter with colour
  Scenario: Filter shoes with thier color
    Given user hover Apparel category
    And user click on shoes subCategory
    Then user should be navigated to the shoes subCategory URL
    And user could filter by colour
