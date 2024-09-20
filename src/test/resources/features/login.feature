@loginFunctionTest
@regression
@loginFunctionTest
Feature: Login functionality test
  As a user, I should be able to login with VALID credentials

  @positiveLoginTest
  Scenario: Positive Login Test
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user enters own login information
    Then The user should be able to logged in

  @firstAuthentication
  Scenario: The user can login with given credentials for the first authentication - B16DDM-30
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page

  @validLogintest
  Scenario: The user can login by entering the valid E-Mail and password - B16DDM-51
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "login@gmail.com" accountEmail
    And The user enters "Login123" accountPassword
    And The user clicks account login click button
    And The user should be able to see main page
    Then The user should be able to logged in

  @wrongCredentialsLoginTest
  Scenario Outline: The user can not login with wrong Credentials - B16DDM-57-58-61
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<AccountEmail>" accountEmail
    And The user enters "<AccountPassword>" accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | AccountEmail    | AccountPassword | expectedWarningMessage                                |
      | wrong@gmail.com | Login123        | Warning: No match for E-Mail Address and/or Password. |
      | login@gmail.com | wrongPassword   | Warning: No match for E-Mail Address and/or Password. |
      | wrong@gmail.com | wrongPass3      | Warning: No match for E-Mail Address and/or Password. |

  @smoke
  @invalidEmailLogin
  Scenario Outline: The user can not login with invalid email address - B16DDM-62
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<AccountEmail>" accountEmail
    And The user enters "<AccountPassword>" accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | AccountEmail    | AccountPassword | expectedWarningMessage                                 |
      | login@gmail.co  | Login123        | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail,com | Login123        | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail     | Login123        | Warning: No match for E-Mail Address and/or Password.  |
      | loginqgmail.com | wrongPass3      | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmal.com  | wrongPass4      | Warning: No match for E-Mail  Address and/or Password. |


  @invalidPasswordLogin
  Scenario Outline: The user can not login with invalid password - B16DDM-64
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<AccountEmail>" accountEmail
    And The user enters "<AccountPassword>" accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | AccountEmail    | AccountPassword       | expectedWarningMessage                                 |
      | login@gmail.com | ogin123               | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail.com | Login                 | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail.com | Log                   | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail.com | Login1234567890123456 | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail.com | 1234                  | Warning: No match for E-Mail  Address and/or Password. |


  @invalidEmail&PasswordLogin
  Scenario Outline: The user can not login with invalid email and password - B16DDM-65
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<AccountEmail>" accountEmail
    And The user enters "<AccountPassword>" accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | AccountEmail    | AccountPassword        | expectedWarningMessage                                 |
      | login@gmail.co  | ogin123                | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail,com | Login                  | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmail     | Log                    | Warning: No match for E-Mail Address and/or Password.  |
      | loginqgmail.com | Login12345678901234567 | Warning: No match for E-Mail Address and/or Password.  |
      | login@gmal.com  | 1234                   | Warning: No match for E-Mail  Address and/or Password. |


  @blankInputboxLogin
  Scenario Outline: The user can not login with blank inputbox of email / password - B16DDM-66-67-68
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<AccountEmail>" accountEmail
    And The user enters "<AccountPassword>" accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | AccountEmail    | AccountPassword | expectedWarningMessage                                |
      |                 | Login123        | Warning: No match for E-Mail Address and/or Password. |
      | Login@gmail.com |                 | Warning: No match for E-Mail Address and/or Password. |
      |                 |                 | Warning: No match for E-Mail Address and/or Password. |


  @bulletTest
  Scenario: The user can see the password as bullet signs by default - B16DDM-69
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "login@gmail.com" accountEmail
    And The user enters "Login123" accountPassword
    Then The user should be able to see the password as bullet signs
    And The user clicks account login click button
    Then The user should be able to logged in


  @forgottenPassword
  Scenario: The user see and use the ‘Forgotten Password’ functionality - B16DDM-70
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user clicks Forgotten Password button
    And The user enters "login@gmail.com" accountEmail
    And The user clicks Continue button
    Then The user should be able to see "An email with a confirmation link has been sent your email address." message


  @login
  Scenario Outline: The user can not login with incorrect credentials after exceeded login 5 attempts - B16DDM-71
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "<wrongAccountEmail>" as wrong accountEmail
    And The user enters "<wrongAccountPassword>" as accountPassword
    And The user clicks account login click button
    Then The user should be able to see "<expectedWarningMessage>" for five invalid login attempts
    Examples:
      | wrongAccountEmail | wrongAccountPassword | expectedWarningMessage                                                                          |
      | wrongUser1        | wrongPass1           | Warning: No match for E-Mail Address and/or Password.                                           |
      | wrongUser2        | wrongPass2           | Warning: No match for E-Mail Address and/or Password.                                           |
      | wrongUser3        | wrongPass3           | Warning: No match for E-Mail Address and/or Password.                                           |
      | wrongUser4        | wrongPass4           | Warning: No match for E-Mail Address and/or Password.                                           |
      | wrongUser5        | wrongPass5           | Warning: No match for E-Mail Address and/or Password.                                           |
      | wrongUser6        | wrongPass6           | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour |






















