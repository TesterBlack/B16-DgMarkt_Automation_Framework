

Feature: Currency functionality test



  Scenario:Currency Selection Reflects on Product Page - TC01
    Given The user is on the first login page
    When The user enters own login information
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects Euro as the currency
    And sees that Euro have been selected

  Scenario:Currency Selection Reflects on Product Page - TC02
    Given The user is on the first login page
    When The user enters own login information
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar)
    And User selects pounds as the currency
    And sees that pounds have been selected


  Scenario:Currency Selection Reflects on Product Page - TC03
    Given The user is on the first login page
    When The user enters own login information
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects dolar as the currency
    And sees that dolar have been selected


  Scenario:Purchase Completion in Selected Currency - TC04
    When The user proceeds to the Checkout page
    Then Verify that the total amount is displayed in the selected currency.
    Then The user completes the purchase process (choose payment method, enter details, confirm payment).
    And The purchase should be successfully completed and the order confirmation should show the total amount in the selected currency.


  Scenario:Currency Selection Reflects on Product Prices Globally - TC05
    When The user click on the shopping cart.
    Then Verify that the user sees the checkout page.
    Then The user clicks on the Checkout button.
    And Verify that the user see that the checkout page reflects the selected currency.
    And Verify that the user sees the total amount is displayed in the selected currency.
    And The user sees the Shopping Cart Page in the currency they selected
    Then The user clicks the Checkout button to complete the purchase process
    And The user should be see the Checkout Options
    Then the User fills in the checkout options and click the confirm order button
    And User should be see the message on the page that "Your order has been placed!"

  @wip
  Scenario:Successful Transaction in Selected Currency - TC6
    When The user proceeds to the checkout page
    Then Verify that the total amount is displayed in the selected currency.
    Then The user completes the purchase process (choose payment method, enter details, confirm payment).
    And The purchase should be successfully completed and the order confirmation should show the total amount in the selected currency.