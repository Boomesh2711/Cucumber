Feature: This is Example scenario login testing
  Scenario Outline: This is Example Login
    Given Using Example to login
    When I enter "<username>" and "<password>"
    Then Login should be when i click signin

    Examples:
        | username | password |
        | Admin    | admin123 |
        | Admin1   | admin123 |