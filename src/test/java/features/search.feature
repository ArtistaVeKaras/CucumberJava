Feature: Search and place order for Vegetables

#@SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenCart Landing page
    When User searched for "Cucumber" Vegetables.
    Then "Cucumber" results are displayed!


 # @SeleniumTest
  Scenario: Search for items and the move to checkout page
    Given User is on GreenCart Landing page
    And Added items to chart
    And User proceeded to Checkout page for purchase
    Then Verify selected "Bringal" items are displayed in chekout page

 @SeleniumTest
 Scenario Outline: Search for items and the move to checkout page
   Given User is on GreenCart Landing page
   When  User searched for <Name> Vegetable
   And   Added items to chart
   And   User proceeded to Checkout page for purchase
   Then  Verify selected <Name> items are displayed in checkout page

   Examples:
     | Name     |
     | Beetroot |
     | Cucumber |
