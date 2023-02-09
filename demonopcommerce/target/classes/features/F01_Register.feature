@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
   And user enter first name "Mohamed"
  And last name "sayed"
  And user enter day of birth"10"
 And user enter month of birth"october"
And user enter year of birth"2010"
And user enter email "ohamed313s1ayhe1dd2d@gmail.com"
    And user enter company name "Egfwd"
And click on select Newsletter option
And user enter password
    And user confirm password
And user clicked on REGISTER button
  Then user should see Your registration completed message
And color of this message is green