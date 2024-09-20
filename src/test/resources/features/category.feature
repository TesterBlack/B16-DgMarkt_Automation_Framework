@category
@regression
Feature: Cart Icon Functionality Test
  As a user, I should be able to manage the cart by clicking the cart icon

  Background:
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user enters own login information
    Then The user should be able to logged in
  @smoke
  Scenario Outline: Subcategory selection under Category Module Test - B16DDM-91 - 94 - 95 - 96
    When The user hover over the Category header on the main page
    And The user clicks on a subcategory '<subCategoryName>'
    Then The user should be in "<subCategoryName>" page

    Examples:
      | subCategoryName |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |
