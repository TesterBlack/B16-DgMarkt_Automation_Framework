
@wip
Feature: register Functionality
  As a user, I should be able to register

  Background:
    Given The user is on the first login page
    When The user enters valid credentials

  Scenario Outline: Registering with Correct Information test with DDT
    When user clicks My Account on the main page
    When user clicks Register on My Account
    When user enters "<firstname>" firstname
    When user enters "<lastname>" lastname
    When user enters "<email>" email
    When user enters "<telephone>" telephone
    When user enters "<password>" password
    When user enters "<passwordConfirm>" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see "<message>" message
    Examples:
      | firstname   | lastname | email                   | telephone | password   | passwordConfirm | message                        |
      |  sevgi      | sezgi    | amazon@gmail.com        | 2222222222| sevgi123   | sevgi123        | Your Account has been created! |
      |  mauro      | icardi   | mauroicardi@gmail.com   | 2222222221| mauro123   | mauro           | Your Account has been created! |



