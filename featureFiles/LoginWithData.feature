Feature: This the login feature for OrangeHRM
  Scenario: Login with valid credentials
    Given user is on login page
    When user enters valid credentials "Admin" and "admin123"
    And clicks on login button
    Then user should be navigated to home page