Feature: This the login feature for OrangeHRM
  Scenario: Login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And clicks on the login button
    Then user should be navigated to the home page