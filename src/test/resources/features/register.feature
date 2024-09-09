
Feature: register Functionality
  As a user, I should be able to register

  Background:
    Given The user is on the first login page
    When The user enters valid credentials
    When user clicks My Account on the main page
    When user clicks Register on My Account


  Scenario Outline: Registering with Correct Information test with DDT - TC01
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
      | firstname   | lastname | email                   | telephone | password        | passwordConfirm | message                               |
      |  sevgi      | sezgi    | amazon@gmail.com        | 2222222222| sevgi.SSHs123   | sevgi.SSHs123   | Your Account Has Been Created!        |
      |  mauro      | icardi   | mauroicardi@gmail.com   | 2222222221| mauro123        | mauro123        | Your Account Has Been Created!        |


  Scenario: Attempting to Register with Empty Required Fields (E-Mail Field) - TC02
    When user enters "lucas" firstname
    When user enters "torreria" lastname
    When user enters "" email
    When user enters "19051905" telephone
    When user enters "lucas1234" password
    When user enters "lucas1234" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Email "E-Mail Address does not appear to be valid!"


  Scenario: Attempting to Register with Empty Required Fields (First Name Field) - TC03
    When user enters "" firstname
    When user enters "torreria" lastname
    When user enters "lucas@gmail.com" email
    When user enters "190519051234" telephone
    When user enters "lucas1234" password
    When user enters "lucas1234" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Firstname "First Name must be between 1 and 32 characters!"


  Scenario: Attempting to Register with Empty Required Fields (Last Name Field) - TC04
    When user enters "kaan" firstname
    When user enters "" lastname
    When user enters "kaangs@gmail.com" email
    When user enters "19051905123442" telephone
    When user enters "kaan1234" password
    When user enters "kaan1234" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Lastname "Last Name must be between 1 and 32 characters!"


  Scenario: Attempting to Register with Empty Required Fields (Telephone Field) - TC05
    When user enters "kaan" firstname
    When user enters "ayhan" lastname
    When user enters "kaangs1@gmail.com" email
    When user enters "" telephone
    When user enters "kaangs123" password
    When user enters "kaangs123" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Telephone "Telephone must be between 3 and 32 characters!"


  Scenario: Attempting to Register with Empty Required Fields (Password Field) - TC06
    When user enters "kaan" firstname
    When user enters "ayhan" lastname
    When user enters "kaan@gmail.com" email
    When user enters "213434" telephone
    When user enters "" password
    When user enters "" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Password "Password must be between 4 and 20 characters!"


  Scenario: User clicks not checkbox - TC07
    When user enters "hakan" firstname
    When user enters "ayhan" lastname
    When user enters "hakan@gmail.com" email
    When user enters "2134342352451" telephone
    When user enters "" password
    When user enters "" password Confirm
    And user clicks Continue
    Then verify that user can see error message for checkbox "Warning: You must agree to the Privacy Policy!"


  Scenario Outline: Registierung with Invalid E-Mail Format - TC08
    When user enters "victor" firstname
    When user enters "osimhen" lastname
    When user enters "<email>" email
    When user enters "2134342352451" telephone
    When user enters "12345" password
    When user enters "12345" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Email "E-Mail Address does not appear to be valid!"
    Examples:
      | email            |
      | victorgmail.com  |
      | victorgamil.     |
      | gamil.           |
      | victorhotmailcom |


  Scenario Outline: Attempt to register when the password and confirm password fields do not match - TC09
    When user enters "victor" firstname
    When user enters "nelson" lastname
    When user enters "victornelson@gmail.com" email
    When user enters "21343423524511" telephone
    When user enters "<password>" password
    When user enters "<passwordConfirm>" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for beide Password "Password confirmation does not match password!"
    Examples:
      | password  | passwordConfirm |
      | 1234      | 123456          |
      | victor123 | victor1         |
      | nelson123 | nelson122424    |


  Scenario Outline: Registierung with Invalid Password - TC10
    When user enters "kerem" firstname
    When user enters "aks" lastname
    When user enters "kerem@gmail.com" email
    When user enters "2134341514" telephone
    When user enters "<password>" password
    When user enters "<passwordConfirm>" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Password "Password must be between 4 and 20 characters!"
    Examples:
      | password | passwordConfirm |
      | 1        | 1               |
      | 123      | 123             |
      | ab       | ab              |
      | ab4      | ab4             |


  Scenario Outline: Attempt to register with an E-Mail already in use - TC11
    When user enters "kenan" firstname
    When user enters "yildiz" lastname
    When user enters "<email>" email
    When user enters "2134341514" telephone
    When user enters "kenan" password
    When user enters "kenan" password Confirm
    And user clicks checkBox
    And user clicks Continue
    Then verify that user can see error message for Register Email "Warning: E-Mail Address is already registered!"
    Examples:
      | email                |
      | sevgisezer@gmail.com |
      | batch16@gmail.com    |
      | sdet1607@gmail.com   |



