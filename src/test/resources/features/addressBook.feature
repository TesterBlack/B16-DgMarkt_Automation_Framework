
Feature: address Book Functionality
  As a user, I should be able to update and add new address information by clicking the Address Book tab under the My Account module.

  Background: user is on account page
    Given The user is on the login page
    When user clicks My Account on the main page
    When user clicks My Account from Dropdown menu


  Scenario: Verify that the user can navigate to Address Book from My Account page successfully -  B16DDM-107
    When The user clicks on Address Book from Account Page
    And The user should be successfully navigated to the Address Book page


  Scenario: Verify that the user can add a new address with valid data - B16DDM-108
    When The user clicks on Address Book from Account Page
    And The user clicks on New Address button
    And The user enters valid credentials on add address page
    And The user should receive a success message for new addresse "Your address has been successfully added"


  Scenario: Verify that the user can successfully update an existing address with valid data - B16DDM-109
    When The user clicks on Address Book from Account Page
    And The user clicks on Edit button
    And The user enters valid credential address1 field
    And The user clicks on Continue button on edit address page
    Then The user should receive a success message for new addresse "Your address has been successfully updated"


  Scenario: Verify that an error message is displayed when the required fields are not filled in when adding a new address - B16DDM-110
    When The user clicks on Address Book from Account Page
    And The user clicks on New Address button
    And The user enters valid credentials without required address1 field on add address page
    Then The user should receive a message "Address must be between 3 and 128 characters!"


  Scenario: Verify that the error message is displayed when the user incorrectly fills in or does not fill in the required field by editing the address - B16DDM-112
    When The user clicks on Address Book from Account Page
    When The user clicks on Edit button
    And The user enters valid credentials without required address1 field on add address page
    Then The user should receive a message "Address must be between 3 and 128 characters!"


  Scenario: Verify that the user can add a new address as the default address - B16DDM-113
    When The user clicks on Address Book from Account Page
    And The user clicks on New Address button
    And The user enters valid credentials with default address yes on add address page
    And The user clicks on Continue button on add address page
    Then The user should receive a success message for new addresse "Your address has been successfully added"


  Scenario: Verify that the user can edit a address as the default address - B16DDM-116
    When The user clicks on Address Book from Account Page
    When The user clicks on Edit button
    When The user select as default address Yes
    And The user clicks on Continue button on edit address page
    And The user clicks on Edit button
    Then The user should be see default address Yes


  Scenario: Verify that the user can delete an address - B16DDM-156
    When The user clicks on Address Book from Account Page
    And The user clicks on first Delete button for first address book
    Then The user should receive a success message for Delete "Your address has been successfully deleted"
