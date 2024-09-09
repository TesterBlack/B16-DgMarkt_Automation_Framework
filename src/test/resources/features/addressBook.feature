Feature: address Book Functionality
  As a user, I should be able to update and add new address information by clicking the Address Book tab under the My Account module.

  Background: user is on Account page
    Given The user is on the login page
    When user clicks My Account on the main page
    When user clicks My Account from Dropdown menu


  Scenario: Verify that the user can navigate to Address Book from My Account page successfully -  TC01
    When The user clicks on Address Book from Account Page
    And The user should be successfully navigated to the Address Book page


  @wip
  Scenario: Verify that the user can add a new address with valid data -  TC02   - B16DDM-108
    When The user clicks on Address Book from Account Page
    And The user clicks on New Address button
    And The user enters valid credentials on add address page
    And The user should receive a success message for new addresse "Your address has been successfully added"
