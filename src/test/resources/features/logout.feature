@regression
Feature: Logout functionality Test
  As a user, I should be able to log out
  @smoke
  Scenario: User should be logged out on the main page - B16DDM-23

    Given The user is on the login page
    When The user clicks on My Account menu
    Then The user clicks on Logout button
    And The user should be able to logout
    Then The user clicks on Continue button
    And The user closes the newsletter popup
    Then The user should be able to see login main page


  Scenario: User should not be able to re-login by clicking “Back” button - B16DDM-27

    Given The user is on the login page
    When The user clicks on My Account menu
    Then The user clicks on Logout button
    And The user should be able to logout
    Then The user clicks on Continue button
    And The user closes the newsletter popup
    When The user clicks on Back button
    And The user closes the newsletter popup
    Then The user should able to see login button by clicking on My Account menu


  Scenario Outline: User should be logged out every page by clicking "Logout" button - B16DDM-105

    Given The user is on the login page
    When The user clicks "<header>" header
    Then The user should be able to see the "<page>" page
    When The user clicks on My Account menu
    Then The user clicks on Logout button
    Examples:
      | header     | page                                    |
      | Category   | The Page You Requested Cannot Be Found! |
      | Specials   | Special Offers                          |
      | Contact Us | Contact Us                              |
      | About Us   | About Us                                |
      | Blog       | Blog                                    |