Feature: Search and Place order for Vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on Greencart landing page
    When User searched for "Cucumber" Vegetable
    Then "Cucumber" results are displayed

  @SeleniumTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on Greencart landing page
    When User searched for <name> Vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then Verify selected <name> items are displayed in checkout page

    Examples:
      |name|
      |"Brinjal"     |
      |"Beetroot"    |

