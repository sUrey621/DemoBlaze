@SmokeTest
Feature: User Authentication
  Test the signup functionality for users using different datasets.

  @ClickSigninbtn
  Scenario Outline: User signup with multiple datasets
    Given I navigate to the signup page
    When I enter the username "<username>" and Password "<password>"
    And I click the signup button

    Examples: 
      | username        | password | loginMessage     |
      | sk123@gmail.com | Suresh56 | Login successful |
