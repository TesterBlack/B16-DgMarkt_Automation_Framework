Feature: Cart Icon Functionality Test
  As a user, I should be able to manage the cart by clicking the cart icon

  Background:
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user enters own login information
    Then The user should be able to logged in

  @checkout
  Scenario Outline: Completing the Checkout Test - B16DDM-185
    When The user hover over the Category header on the main page
    And The user clicks on a subcategory '<subCategoryName>'
    And The user clicks on the product
    And The user clicks on add to cart button
    And The user closes the received message
    And The user clicks on basket icon
    Then The user should be able to see the added product
    When The user clicks View Cart button
    Then User should be able to see the products added to the cart with correct quantity in checkout page
    And The user clicks Checkout button
    And The user select an existing address for billing
    And The user enters "<firstName>" first name
    And The user enters "<lastName>" last name
    And The user enters "<address>" address
    And The user enters "<city>" city
    And The user enters "<postCode>" post code
    And The user selects country
    And The user selects region-state and clicks continue button
    And The user clicks continue button
    And The user accept Terms & Conditions and clicks continue
    And The user clicks Confirm Order Button
    Then The user should be able to see the order confirmation page

    Examples:
      | subCategoryName |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |
    Examples:
      | firstName | lastName | address          | city   | postCode |
      | John      | Doe      | Muster Strasse 1 | Berlin | 44000    |