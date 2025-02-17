Feature: Login Functionality

  @successfulLogin
  Scenario: Successful Login
    Given I am on the login page
    When I enter valid credentials
    Then I should be logged in and redirected to the homepage

  Scenario: Unsuccessful Login with invalid credentials
    Given I am on the login page
    When I enter invalid credentials
    Then I should see an error message
