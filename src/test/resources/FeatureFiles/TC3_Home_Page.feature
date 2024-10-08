@homepage
Feature: Home Page Validation
@homepagebanners
  Scenario: Validate rendering of banners, featured products, and categories
    Given I am on the home page
    When I check the banner display
    Then the banner should be displayed correctly
    And featured products should be displayed
    And product categories should be visible
    And I resize the window to mobile view
    And I resize the window to tablet view
    Then the layout should adapt to desktop view


