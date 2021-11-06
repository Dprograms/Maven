Feature: Feature to test login functionality

  Scenario: Validate login with correct crendentials
    Given user is on login page
    When user enters username and password
    And clicks login button
    Then user navigates to home page
