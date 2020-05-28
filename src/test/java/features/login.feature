Feature: Application login
  login to application.


  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User sign up with following details
      |jenney|abcd|john@abcd.com|Austraila|3242302
    Then Homepage is populated
    And Cards Displayed are "false"

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