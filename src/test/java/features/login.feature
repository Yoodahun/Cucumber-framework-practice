Feature: Application login
  login to application.

  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  @RegressionTest
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User sign up with following details
      |jenney|abcd|john@abcd.com|Austraila|3242302
    Then Homepage is populated
    And Cards Displayed are "false"

  @MobileTest
  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with "Jane" and "1232"
    Then Homepage is populated
    And Cards Displayed are "true"

  @RegressionTest
  Scenario Outline: Homepage default login
    Given User is on Netbanking landing page
    When User login into application with <username> and <password>
    Then Homepage is populated
    And Cards Displayed are "false"

    Examples:
      |username|password|
      |"Jin"     |"1234"    |
      |"john"    |"4321"    |
      |"user2"   |"password2"|
      |"user3"   |"password3"|
      |"user1"   |"password1"|
      |"user4"   |"password4"|