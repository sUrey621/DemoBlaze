@SmokeTest
Feature: Checkout Process

  @Checkout
  Scenario Outline: 
    : Proceed to checkout and complete purchase

    Given I have added "Samsung galaxy s6" to the cart
    When I proceed to checkout
    And I fill in the shipping information with "<Name>", "<Country>", "<City>", "<Creditcard>", "<Month>", "<Year>"
    And I complete the purchase
    Then I should see the order confirmation with a valid order ID

    Examples: 
      | Name | Country | City    | Creditcard   | Month | Year |
      | John | INDIA   | Chennai | 123456789009 |    10 | 2026 |
