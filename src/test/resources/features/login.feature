Feature: Login functionality test



Scenario: Positive Login Test
  Given The user is on the first login page
  When The user enters valid credentials
  Then The user should be able to see main page
  And The user enters own login information
