@regression
Feature: Edit Account Functionality
  As a user, I should be able to update the user information by clicking the Edit Account tab under the My Account module

  Background: The user is on the account page
    Given The user is on the login page
    When user clicks My Account on the main page
    When user clicks My Account from Dropdown menu
    When user clicks Edit Account

  @smoke
  Scenario: Verify that the user's First Name information can be successfully updated -  B16DDM-76
    When The user updates the First Name field with valid information
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message "Success: Your account has been successfully updated."


  Scenario: Verify that the user's Last Name information can be successfully updated - B16DDM-77
    When The user updates the Last Name field with valid information
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message "Success: Your account has been successfully updated."


  Scenario: Verify that the user's Telephone information can be successfully updated - B16DDM-78
    When The user updates the Telephone field with valid information
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message "Success: Your account has been successfully updated."


  Scenario: Verify that the user's E-Mail information can be successfully updated - B16DDM-80
    When The user updates the E-Mail field with valid information
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message "Success: Your account has been successfully updated."


  Scenario: Verify that the user did not fill in the required First Name field and received an error message - B16DDM-82
    When The user does not fill in the required First Name field
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message für Firstname "First Name must be between 1 and 32 characters!"


  Scenario: Verify that the user did not fill in the required Last Name field and received an error message - B16DDM-84
    When The user does not fill in the required Last Name field
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for Lastname "Last Name must be between 1 and 32 characters!"


  Scenario: Verify that the user did not fill in the required Telephone field and received an error message - B16DDM-85
    When The user does not fill in the required Telephone field
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for Telephone "Telephone must be between 3 and 32 characters!"


  Scenario: Verify that the user did not fill in the required E-Mail field and received an error message - B16DDM-87
    When The user does not fill in the required E-Mail field
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for empty Email  "E-Mail Address does not appear to be valid!"


  Scenario: Verify that the user is attempting to update with an Invalid Email Format and receiving an error message - B16DDM-88
    When The user attempted update with invalid E-Mail format without @-Zeichen
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for invalid E-Mail Format without @-Zeichen


  Scenario: Verify that the user is attempting to update with an Invalid Email Format and receiving an error message - B16DDM-89
    When The user attempted update with invalid E-Mail format vordem @-Zeichen
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for invalid E-Mail Format vordem @-Zeichen


  Scenario: The user tries to update with the existing E-Mail and receives an error message - B16DDM-90
    When updates user E-Mail details with an already registered E-Mail address
    And The user clicks Continue button on Edit Account site
    Then The user should receive a success message for registered Email "Warning: E-Mail address is already registered!"


  Scenario Outline: Verify that the user is attempting to update with an Invalid Email Format and receiving an error message - B16DDM-102
    When The user attempted update with invalid Email format "<invalidEmail>"
    And The user clicks Continue button on Edit Account site
    Then The user should receive a error message for Invalid Email Format '<errorMessage>'
    Examples:
      | invalidEmail          | errorMessage                                                   |
      | sevgi sezer@gmail.com | Vor dem @-Zeichen darf das Zeichen " " nicht verwendet werden. |
