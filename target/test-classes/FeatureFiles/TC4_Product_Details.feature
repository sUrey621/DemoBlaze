@tag
Feature: Product Details Page

  @Product
  Scenario: Validate Product information in product details page
    When Navigate to a product details page.
    Then validate  product information like description price
    When Add product to shopping cart
    Then validate product is added to cart
