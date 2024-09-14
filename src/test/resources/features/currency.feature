Feature: Currency functionality test
  As a user I should be able to select the currency and complete transactions

  Background:
    Given The user is on the first login page
    When The user is on the login page

  Scenario:Currency Selection Reflects on Product Page - B16DDM-28
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects Euro as the currency
    And sees that Euro have been selected

  Scenario:Currency Selection Reflects on Product Page  - B16DDM-29
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar)
    And User selects pounds as the currency
    And sees that pounds have been selected

  Scenario:Currency Selection Reflects on Product Page  - B16DDM-48
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects dolar as the currency
    And sees that dolar have been selected

  Scenario Outline: Purchase Completion in Selected Currency
    When The user select the "<currency>" from the Currency section
    When The user hover over the Category header on the main page
    When The user clicks Health & Beauty submenu
    Given The user adds a product to the cart
    When The user clicks on the shopping cart
    When The user clicks on the Checkout button.
    Then Verify that the total amount is displayed in the selected currency.
    Then The user completes the purchase process (choose payment method, enter details, confirm payment).

    Examples:
      | currency |
      | Euro     |
      | Pounds   |
      | Dollar   |




