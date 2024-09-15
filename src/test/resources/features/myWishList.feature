@wip
Feature: My Account-User can Modify wish list
  As a user, I should be able to modify My wish list by clicking the Wish List tab under the My Account module.

  Background:
    Given The user is on the login page
    When The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header submenus
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page
    When The user add the product "BaByliss 3663U - Hair rollers" to the wish list

  Scenario:Verify that the user should be able to reach wish list on My wish list page - B16DDM-137
    When user clicks My Account on the main page
    Then user clicks My Account from Dropdown menu
    Then The user clicks Wish List under the My Account module.
    And The user should be see the My Wish List Page.

  Scenario: Verify that the user should be able to reach wish list from pop-up message after adding the product to the wish list.
    Then The user should be see the pop-up Message “ Success: You have added BaByliss U - Hair rollers to your wish list! „

  Scenario:
    And The user clicks Add to Wisch List tab on the pop-up to reach wish list
    Then The user should be able to reach wish list

  Scenario: Verify that the user should be able to add the products from wish list to cart - B16DDM-150
    And The user clicks on the cart icon on the My Wish List to add products to the cart.
    Then The user should see the success message that the products have been added to the cart





