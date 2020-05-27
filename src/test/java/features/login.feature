Feature: Application login
  login to application.

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "Jin" and "1234"
    Then Homepage is populated
    And Cards are Displayed

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "john" and "4321"
    Then Homepage is populated
    And Cards are Displayed
