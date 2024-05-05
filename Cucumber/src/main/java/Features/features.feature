Feature: User Login

  Scenario: Valid login credentials
    Given login into the auzmor page
    When enter valid username and valid password
    And click on the login button
    Then I should be redirected to the dashboard