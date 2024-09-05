
@wip
Feature: register Functionality
  As a user, I should be able to register

  Background:
    Given The user is on the first login page
    When The user enters valid credentials

  Scenario Outline: Registering with Correct Information test with DDT
    When user clicks My Account on the main page
    When user clicks Register on My Account
    When user enters "<firstname>"
    When user enters "<lastname>"
    When user enters "<email>"
    When user enters "<telephone>"
    When user enters "<password>"
    When user enters "<passwordConfirm>"
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see "<message>" message
    Examples:
      | firstname | lastname | email | telephone | password | passwordConfirm | message |