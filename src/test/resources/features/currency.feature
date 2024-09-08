

Feature: Currency functionality test



  Scenario:Currency Selection Reflects on Product Page - TC01
    Given The user is on the first login page
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects Euro as the currency
    And sees that Euro have been selected

  Scenario:
    Given The user is on the first login page
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar)
    And User selects pounds as the currency
    And sees that pounds have been selected


  Scenario:
    Given The user is on the first login page
    When The User navigates to the currency selector dropdown on the home page
    Then The user should be see the currency options(Euro-Pound-Dolar).
    And User selects dolar as the currency
    And sees that dolar have been selected