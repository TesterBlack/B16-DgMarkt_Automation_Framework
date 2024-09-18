Feature:Cat-Subcategory - PRICE slider function
  As a user, I should be able to bring the products in the price range I want on the Sub-Category Page by using the PRICE slider.

  Background:
    Given The user is on the login page
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page

  @wip
  Scenario: Adjusting the PRICE slider to filter products within a specific price range
    When The user locates the PRICE slider on the page.
    Then I adjust the PRICE slider minimum to 150 and maximum to 300
    Then I should see products priced between 150 and 300

  Scenario: Adjusting the PRICE slider from the minumum price
   When I adjust the PRICE slider minumum to 250"
    Then I should see products priced from 275

  Scenario: Adjusting the PRICE slider to the maximum price
    When I adjust the PRICE slider maximum to 381
    Then I should see products priced up to 381
  @wip
  Scenario Outline: No products displayed when the selected price range has no products
    When I adjust the PRICE slider maximum to 250 and minimum to 300 and
    Then I should see no products displayed
    Then The user should be able to see the negative "<noProductMatchesMessage>" message

    Examples:
      | maxprice | minprice | noProductMatchesMessage                                      |
      | 300      | 250      | There is no product that matches the search criteria. |


  Scenario: Verifying that resetting the PRICE slider shows all products
    When I reset the PRICE slider to its default values
    Then I should see all products on the Sub-Category Page