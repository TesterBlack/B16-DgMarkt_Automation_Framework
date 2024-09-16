@wip
Feature:Cat-Subcategory - PRICE slider function
  As a user, I should be able to bring the products in the price range I want on the Sub-Category Page by using the PRICE slider.

  Background:
    Given The user is on the login page
    When The user hover over the Category header on the main page
    Then The user should be able to see on the submenu-header submenus
    When The user clicks Health & Beauty submenu
    Then The user should be able to see the "Health & Beauty" page

  Scenario:
    And The user locates the PRICE slider on the page.
    Then The user attempts to scroll the PRICE slider from its minimum position to a higher value and then back to a lower value.

    Given kullanıcı fiyat kaydırıcısı sayfasını açar
    When kullanıcı fiyat kaydırıcısını 50'ye ayarlar
    Then fiyat aralığı 50 olmalıdır

    Scenario:

    And The user locates the PRICE slider on the page.
    Then The user scrolls the PRICE slider to set a desired price range (e.g., $110 - $150).
    Then The user observes the products displayed on the Sub-Category Page after the slider is set.
