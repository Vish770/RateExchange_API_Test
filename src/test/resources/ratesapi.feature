Feature: To verify response status of Rates API

  Scenario: To verify Rest service
    Given I want to execute getURL method
    When I submit the GET request
    Then I should get 200 Success Status code
