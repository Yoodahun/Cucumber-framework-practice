Feature: Application login
  login to application.

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with username and password
    Then Homepage is populated
    And Cards are Displayed
