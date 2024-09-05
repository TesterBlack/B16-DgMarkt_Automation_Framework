@logout
Feature: Logout functionality

  Scenario: Logout Test

    Given The user is on the login page
    When The user clicks on My Account menu
    Then The user clicks on Logout button
    And The user should be able to logout
    Then The user clicks on Continue button
    And The user closes the newsletter popup
    Then The user should be able to see login main page