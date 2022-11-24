Feature: To validate the login functionality of OrangeHRM site
    Scenario: This is the login scenario
    Given Goto login webpage
    When Enter valid username and password
    And click login button
    Then user should be navigated to homepage of Orange HRM
   