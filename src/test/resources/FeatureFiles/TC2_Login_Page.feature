@LoginSmokeTest
Feature: User Authentication
  Test the Login functionality for users using different datasets.

  @ClickLoginbtn
  Scenario Outline: User Login with multiple datasets
    Given I navigate to the Login page
    When I enter the username "<username>" and password "<password>"
    And I click the Login button

    Examples: 
      | username        | password | loginMessage     |
      | sk123@gmail.com | Suresh56 | Login successful |
