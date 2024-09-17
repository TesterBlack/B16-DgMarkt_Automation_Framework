Feature: Cart Icon Functionality Test
  As a user, I should be able to manage the cart by clicking the cart icon

  Background:
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user enters own login information
    Then The user should be able to logged in

  @addedProductPositive
  Scenario Outline: Positive product add to cart Test - B16DDM-111
    When The user hover over the Category header on the main page
    And The user clicks on a subcategory '<subCategoryName>'
    #And The user clicks on input limit filter
   # And The user selects size
    And The user clicks on the product
    And The user clicks on add to cart button
    And The user closes the received message
    And The user clicks on basket icon
    Then The user should be able to see the added product

     Examples:
       | subCategoryName |
       | Health & Beauty |
       | Televisions     |
       | TV Accessories  |
       | Networking      |