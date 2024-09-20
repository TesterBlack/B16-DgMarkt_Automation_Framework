@regression
Feature:Cat-Subcategory - PRICE slider function
  As a user, I should be able to bring the products in the price range I want on the Sub-Category Page by using the PRICE slider.

  Background:
    Given The user is on the login page
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page
  @smoke
  Scenario: Adjusting the PRICE slider to filter products within a specific price range - B16DDM-181
    When The user locates the PRICE slider on the page.
    Then I adjust the PRICE slider minimum to 110 and maximum to 150
    Then I should see that the product prices are within desired range

  Scenario Outline: No products displayed when the selected price range has no products - B16DDM-182
    Then I adjust the PRICE slider minimum to <minprice> and maximum to <maxprice>
    Then The user should be able to see the negative "<noProductMatchesMessage>" message

    Examples:
      | maxprice | minprice | noProductMatchesMessage                         |
      | 250      | 110      | There are no products to list in this category. |

