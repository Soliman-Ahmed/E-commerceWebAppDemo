Feature: Confirm Checkout and order placement happy scenario
  Scenario: Complete the checkout and Order Placement
    Given User Login Successfully
    When User Add Products to the cart and Navigate to cart section
    And User Agree terms and click on checkout button
    And User Open Checkout Page and Complete the Order Info
    Then Assert that the order Placed Successfully