Feature: This is the login feature  for facebook
Scenario: Check login Scenario
Given Goto Loginpage
When  Enter valid Email "sele@gmail.com" and "324234"
And press login button
Then sucessfully logged into facebook 