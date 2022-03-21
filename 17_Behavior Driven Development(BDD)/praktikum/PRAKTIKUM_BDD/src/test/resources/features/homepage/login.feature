Feature: Login
  As a user
  I want to login
  so that I can see my homepage

  Scenario: Success login
    Given I am in login page
    When I input valid username and password
    And Click login button
    Then I can access my homepage

  Scenario: Failed login with wrong password
    Given I am in login page
    When I input valid username and wrong password
    And Click login button
    Then I can't access my homepage
