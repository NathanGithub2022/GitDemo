Feature: Login into Application

  Scenario Outline: Positive test validating login

    Given Initialize the browser with chrome
    And Navigate to "https://rahulshettyacademy.com/#/index" site
    And Click on Login link in home page to land on Secure login page
    When User enters <username> and <password> and logs in
    Then Verify that user is successfully logged in
    And Close Browsers

Examples:
   |username         |password     |
   |shanamad131@gmail.com|13579-Maduray|
   |user1            |pass2        |