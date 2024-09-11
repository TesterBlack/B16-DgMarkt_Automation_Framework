Feature: Product Compare Functionality
  As a user, I should be able to compare the features of the products I want


  Scenario Outline: Verify that the User should be able to navigate the Product Compare Page when the User clicks on the Product Compare sub-Tab. - B16DDM-159
    Given The user is on the login page
    When The user clicks Category module on main page
    When The user clicks on a subcategory '<subCategoryName>'
    And The user clicks Product Compare on this page
    Then The user should be able to navigate the Product Compare Page
    Examples:
      | subCategoryName |
      | Health & Beauty |
      | Televisions     |
      | TV Accessories  |
      | Networking      |


  Scenario Outline:  Verify that the user should be able to see the Products they want to compare on the Product Comparison page - B16DDM-161
    Given The user is on the login page
    When The user clicks Category module on main page
    When The user clicks on a Tv Accessories
    When The user clicks "<firstProduct>" on the other product they want to compare
    When The user closes the received message
    When The user clicks "<secondProduct>" on the other product they want to compare
    When The user closes the received message
    And The user clicks Product Compare on this page
    Then The user should be able to see "<firstProduct>" and "<secondProduct>"
    Examples:
      | firstProduct                                      | secondProduct                              |
      | C2G audio cable - 5 m                             | C2G Velocity audio cable                   |
      | Belkin High Speed HDMI Cable with Ethernet        | Belkin High Speed HDMI Cable with Ethernet |
      | C2G 3m Select High Speed HDMI Cable with Ethernet | Cables Direct adapter cable                |


  Scenario Outline: Verify that the user can ADD the compared products to the cart separately - B16DDM-162
    Given The user is on the login page
    When The user clicks Category module on main page
    When The user clicks on a Tv Accessories
    When The user clicks "<firstProduct>" on the other product they want to compare
    When The user closes the received message
    When The user clicks "<secondProduct>" on the other product they want to compare
    When The user closes the received message
    And The user clicks Product Compare on this page
    And The user clicks add to cart button products
    And The user clicks on basket icon
    Then The user should be able to see the products he added "<firstProduct>" and "<secondProduct>"
    Examples:
      | firstProduct                                      | secondProduct                              |
      | C2G audio cable - 5 m                             | C2G Velocity audio cable                   |
      | Belkin High Speed HDMI Cable with Ethernet        | Belkin High Speed HDMI Cable with Ethernet |
      | C2G 3m Select High Speed HDMI Cable with Ethernet | Cables Direct adapter cable                |



  Scenario Outline: Verify that the user can REMOVE the compared products separately - B16DDM-163
    Given The user is on the login page
    When The user clicks Category module on main page
    When The user clicks on a Tv Accessories
    When The user clicks "<firstProduct>" on the other product they want to compare
    When The user closes the received message
    When The user clicks "<secondProduct>" on the other product they want to compare
    When The user closes the received message
    And The user clicks Product Compare on this page
    And The user clicks remove button products
    Then The user should be able to see message for product comparison "Success: You have modified your product comparison!"
    Examples:
      | firstProduct                                      | secondProduct               |
      | C2G audio cable - 5 m                             | C2G Velocity audio cable    |
      | C2G 3m Select High Speed HDMI Cable with Ethernet | Cables Direct adapter cable |

