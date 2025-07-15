Feature: Cart Functionality
  Scenario: Happy Scenario to add item to the cart
    Given Open the web home page
    When select category and subcategory
    And view the product and add to the cart
    Then Assert that the product added and git the cart qty