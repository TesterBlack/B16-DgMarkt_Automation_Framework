Feature: Login functionality test
  As a user, I should be able to login with VALID credentials


  Scenario: Positive Login Test
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user enters own login information
    Then The user should be able to logged in


  Scenario: The user can login with given credentials for the first authentication - B16DDM-30
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page


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


  Scenario: The user can not login with wrong Email address - B16DDM-57
    Given The user is on the first login page
    When The user enters valid credentials
    Then The user should be able to see main page
    When The user clicks my account button
    And The user clicks account login button
    And The user enters "wrong@gmail.com" wrong accountEmail
    And The user enters "Login123" accountPassword
    And The user clicks account login click button
    Then The user should not be able to logged in with wrong email


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






















