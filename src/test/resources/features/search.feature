Feature: Search Icon Functionality test
  As a user I should be able to search products in the search engine.

  @searchIconPositive
  Scenario Outline: Positive search Test - B16DDM-201
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks on search icon on the main page
    And The user enters any "<product>" name
    And The user clicks on search icon on search field
    Then The user should be able to see the list of products with the "<product>" name

    Examples:
      | product |
      | Shave   |
      | Hair    |
      | TV      |
      | Adapter |
      | Router  |

  @searchIconNegative
  Scenario Outline: Negative search Test - B16DDM-202
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks on search icon on the main page
    And The user enters any "<product>" name
    And The user clicks on search icon on search field
    Then The user should be able to see the negative "<noProductMessage>" message

    Examples:
      | product | noProductMessage                                      |
      | Auto    | There is no product that matches the search criteria. |
      | 1234    | There is no product that matches the search criteria. |
      | *****   | There is no product that matches the search criteria. |
      | -123    | There is no product that matches the search criteria. |
      |         | There is no product that matches the search criteria. |


