Feature: My Account-User can Modify wish list
  As a user, I should be able to modify My wish list by clicking the Wish List tab under the My Account module.

  Background:
    Given The user is on the login page
    Then The user adds a product to the Wish List
    When user clicks My Account on the main page
    Then user clicks My Account from Dropdown menu


  Scenario:Verify that the user should be able to reach wish list on My wish list page - B16DDM-137

    Then The user clicks Wish List under the My Account module.
    And The user should be see the My Wish List Page.


  Scenario: Verify that the user should be able to reach wish list from pop-up message after adding the product to the wish list.

    When The user clicks on a Product on the Home Page
    Then The user sees the Add to Wisch List tab to select
    And The user clicks Add to Wish List tab
    Then The user should be see the pop-up Message “ Success: You have "added…" to your wish list! „


  Scenario:
    When The user clicks on a Product on the Home Page
    Then The user sees the Add to Wisch List tab to select
    And The user clicks Add to Wish List tab
    Then The user should be see the pop-up Message “ Success: You have "added…" to your wish list! „
    And The user clicks Add to Wisch List tab on the pop-up to reach wish list
    Then The user should be able to reach wish list

  Scenario: Verify that the user should be able to add the products from wish list to cart - B16DDM-150

    When The user clicks on a Product on the Home Page
    Then The user sees the Add to Wisch List tab to select
    And The user clicks Add to Wish List tab
    Then The user should be see the pop-up Message “ Success: You have "added…" to your wish list! „
    And The user clicks on the cart icon on the My Wish List to add products to the cart.
    Then The user should see the success message that the products have been added to the cart



