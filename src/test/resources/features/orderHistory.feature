
Feature: Order History functionality Test
  As a user, I should be able to see and modify order history by clicking the Order History tab under the My Account module.

  Background:
    Given The user is on the first login page

  Scenario Outline: User should be able to see order history
  (after completed a purchase) by clicking the Order History tab under the My Account module. - B16DDM-140

    When The user is on the login page
    And The user clicks on My Account menu
    Then The user should be able to see the "<submenuList>" of My Account
    And The user clicks on Order History button
    Then The user should be able to see completed purchase on the Order History page
    Examples:
      | submenuList   |
      | My Account    |
      | Order History |
      | Transactions  |
      | Downloads     |
      | Logout        |


  Scenario Outline: User should be able to see order history
  (before completed a purchase) by clicking the Order History tab under the My Account module. - B18DDM-180

    Given The new user is on the login page
    And The user clicks on My Account menu
    Then The user should be able to see the "<submenuList>" of My Account
    And The user clicks on Order History button
    Then The user should be able to see a message on the Order History page "You have not made any previous orders!"
    Examples:
      | submenuList   |
      | My Account    |
      | Order History |
      | Transactions  |
      | Downloads     |
      | Logout        |


  Scenario Outline: User should be able to modify order history
  by clicking the Order History tab under the My Account module. - B16DDM-141

    When The user is on the login page
    And The user clicks on My Account menu
    Then The user should be able to see the "<submenuList>" of My Account
    And The user clicks on Order History button
    Then The user should be able to see completed purchase on the Order History page
      #When The user clicks on Modify Order button
      #Then The user should be able to modify the order history
    Examples:
      | submenuList   |
      | My Account    |
      | Order History |
      | Transactions  |
      | Downloads     |
      | Logout        |


  Scenario Outline: User can access the order detail by clicking the view icon - B16DDM-142

    When The user is on the login page
    And The user clicks on My Account menu
    Then The user should be able to see the "<submenuList>" of My Account
    And The user clicks on Order History button
    Then The user should be able to see completed purchase on the Order History page
    When The user clicks on view button
    Then The user should be able to see the order information page
    Examples:
      | submenuList   |
      | My Account    |
      | Order History |
      | Transactions  |
      | Downloads     |
      | Logout        |


  Scenario Outline: User can re-order an item from their order history - B16DDM-143

    When The user is on the login page
    And The user clicks on My Account menu
    Then The user should be able to see the "<submenuList>" of My Account
    And The user clicks on Order History button
    Then The user should be able to see completed purchase on the Order History page
    When The user clicks on view button
    Then The user should be able to see the order information page
    When The user clicks on Re-order button
    Then The user should be able to see the following message "Success: You have added ASUS ROG STRIX GS-AX3000 to your shopping cart!"
    Examples:
      | submenuList   |
      | My Account    |
      | Order History |
      | Transactions  |
      | Downloads     |
      | Logout        |



    Scenario Outline: User can return an item from their order history - B16DDM-144

      When The user is on the login page
      And The user clicks on My Account menu
      Then The user should be able to see the "<submenuList>" of My Account
      And The user clicks on Order History button
      Then The user should be able to see completed purchase on the Order History page
      When The user clicks on view button
      Then The user should be able to see the order information page
      When The user clicks on Return button
      Then The user should be able to see the Product Returns page
      And The user checks the Product Information for correct product name
      And The user clicks Order Error radio button
      Then The user should be able to see the Order Error button is clicked
      And The user clicks Submit button
      Then The user should be able to see a message "Thank you for submitting your return request. Your request has been sent to the relevant department for processing."

      Examples:
        | submenuList   |
        | My Account    |
        | Order History |
        | Transactions  |
        | Downloads     |
        | Logout        |