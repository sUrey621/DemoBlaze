@SmokeTest
Feature: Shopping Cart Validation

  @CartPage
  Scenario: Verify that the added products appear in the cart
    Given I have added "Samsung galaxy s6" and "Nokia lumia 1520" to the cart
    When I navigate to the cart
    Then I should see "Samsung galaxy s6" in the cart
    And I should see "Nokia lumia 1520" in the cart
    And the correct prices for both products should be displayed
    And the total price should be correct
    And I remove "Samsung galaxy s6" from the cart
    And the total price should be updated correctly
