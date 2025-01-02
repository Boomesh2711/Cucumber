Feature: This is to test google search
  Scenario: Google search scenario
    Given user is entering google.com
    When user is typing the search term "Cucumber"
    Then I should see "Cucumber" in search results