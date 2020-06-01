Feature: Search and Place order for Vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on Greencart landing page
    When User searched for "Cucumber" Vegetable
    Then "Cucumber" results are displayed

