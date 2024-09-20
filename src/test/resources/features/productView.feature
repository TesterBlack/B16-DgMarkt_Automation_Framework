@regression
Feature: Product View functionality Test
  As a user, I should be able to change the product view to a list or twos, threes, fours by clicking on the product view icon.

  Background:
    Given The user is on the login page
    When The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header submenus
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page

  Scenario Outline: User can change the view to <number> products side by side - B16DDM-196 -197 -198
    When The user clicks the option to display <number> products icon
    Then The user should be able to see "<getGrid>" products displayed side by side on the page
    Examples:
      | getGrid  | number |
      | col-lg-6 | 2      |
      | col-lg-4 | 3      |
      | col-lg-3 | 4      |

  @smoke
  Scenario: User can change the view of products to a list - B16DDM-199
    When The user clicks the option to display products in a list view icon
    Then The user should be able to see all products displayed in a list view