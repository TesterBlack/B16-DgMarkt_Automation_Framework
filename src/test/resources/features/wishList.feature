@wish
Feature: Like Icon (Wish List) functionality test

  Scenario Outline: Wish List Test - The user should be able to see products in the wish list - B16DDM-59

    Given The user is on the first login page
    When The user is on the login page
    When The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header "<submenu>" submenus

    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "<page>" page

    When The user add the product "BaByliss 3663U - Hair rollers" to the wish list
    Then The user should able to see the message "You must login or create an account to save BaByliss 3663U - Hair rollers to your wish list!"

    When The user add the product "Capsule Plate 6pcs" to the wish list
    Then The user should able to see the message "You must login or create an account to save Capsule Plate 6pcs to your wish list!"

    When The user clicks wish list icon
    Then The user should be able to see the products on the wish list page
    Examples:
      | submenu         | page            |
      | HEALTH & BEAUTY | Health & Beauty |