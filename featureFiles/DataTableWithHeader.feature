Feature: This the login features for OrangeHRM
  Scenario: Login with must valid credentials
    Given You are in signin page
    When You entered the below valid cred
      |username | password|
      |Admin | admin123|
    And clicking on the signin button
