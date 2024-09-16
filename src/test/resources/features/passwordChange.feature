
Feature: My Account-User can Change password
  As a user, I should be able to change the password by clicking the Password tab under the My Account module.

  Background:
    Given The user is on the login page
    When user clicks My Account on the main page
    Then user clicks My Account from Dropdown menu
    Then user clicks Password button

  Scenario Outline: Verifies that the user can change the password - B16DDM-81

    Then the user enters the "<NewPassword>" in the blank in the password field.
    And the user enters the same "<SameNewPassword>" into the blank in the confirm password field.
    Then the user clicks the continue button.
    And User should be see the "<SuccessMessage>" "Success: Your password has been successfully updated."
    Examples:
      | NewPassword | SameNewPassword | SuccessMessage                                        |
      | 123456      | 123456          | Success: Your password has been successfully updated. |

  Scenario Outline: Verifies error message when user can't confirm password - B16DDM-83

    Then the user enters the "<NewPassword>" in the blank in the password field.
    And the user enters the "<DifferentNewPassword>" into the blank in the confirm password field.
    Then the user clicks the continue button.
    And User should see the "<warningMessagePaswordNotChange>" "Password confirmation does not match password!"
    Examples:
      | NewPassword | DifferentNewPassword | warningMessagePaswordNotChange                 |
      | 54321       | 654321               | Password confirmation does not match password! |
      | 12.a*'T     | 12..a*'T             | Password confirmation does not match password! |





