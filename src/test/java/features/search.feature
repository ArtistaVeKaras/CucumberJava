Feature: Search and place order for Vegetables

@SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenCart Landig page
    When User searched for "Cucumber" Vegetables.
    Then "Cucumber" results are displayed!


  @SeleniumTest
  Scenario: Search for items and the move to checkout page
    Given User is on GreenCart Landig page
    And Added items to chart
    And User proceeded to Checkout page for purchase
    Then Verify selected "Bringal" items are displayed in chekout page