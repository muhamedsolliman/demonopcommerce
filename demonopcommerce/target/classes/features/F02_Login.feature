@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given user go to login page
When user Enter valid Email"ohamed313s1ayhe1dd2d@gmail.com"
And write the password "P@ssw0rd"
And press on login button
Then Home page will Appear
And My account tab isDisplayed

