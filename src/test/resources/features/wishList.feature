@regression
Feature: Like Icon (Wish List) functionality test
  As a user, I should be able to see the product in my wish list, when I like the product.

  Background:
    Given The user is on the first login page
    When The user is on the login page
  @smoke
  Scenario: The user should be able to see products in the wish list - B16DDM-59

    When The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header submenus
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page
    When The user add the product "BaByliss 3663U - Hair rollers" to the wish list
    Then The user should able to see the message "You must login or create an account to save BaByliss 3663U - Hair rollers to your wish list!"
    When The user add the product "Capsule Plate 6pcs" to the wish list
    Then The user should able to see the message "You must login or create an account to save Capsule Plate 6pcs to your wish list!"
    When The user clicks wish list icon
    Then The user should be able to see the products on the wish list page



  Scenario: The user should be able to delete products from wish list - B16DDM-63

    Given The user clicks wish list icon
    Then The user should be able to see the products on the wish list page
    When The user clicks the delete icon for the first product in the My Wish List table
    Then The user should no longer see the first product in the wish list and get the message
    When The user clicks the delete icon for the second product in the My Wish List table
    Then The user should no longer see the second product in the wish list and  get the message
    And The user should be able to see the empty message



  Scenario: The user should be able to products add to cart from wish list - B16DDM-128

    Given The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header submenus
    When The user clicks Health & Beauty submenu
    When The user add the product "BaByliss 3663U - Hair rollers" to the wish list
    When The user add the product "Capsule Plate 6pcs" to the wish list
    And The user clicks wish list icon
    Then The user should be able to see the products on the wish list page
    When The user clicks the add to cart icon for the first product in the My Wish List table
    Then The user should be able to see the message "Success: You have added Capsule Plate 6pcs to your shopping cart!"
    When The user clicks the add to cart icon for the second product in the My Wish List table
    Then The user should be able to see the message "Success: You have added BaByliss 3663U - Hair rollers to your shopping cart!"
    And The user clicks the add to cart icon
    Then The user should be able to see a dropdown menu for the shopping cart that the products have been added to the cart.
