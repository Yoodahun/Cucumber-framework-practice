Feature: Application account

  @MobileTest
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "Panda" and "1234"
    Then Homepage is populated
    And Cards Displayed are "false"

