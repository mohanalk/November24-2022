Feature: To validate the login functionality in fb application

Scenario: To validate with invalid username and invalid password
				Given User has to launch the chrome browser and max the window
				When User has to launch the fb application in browser
				And User has to pass invalid username in email field 
				And User has to pass invalid password in password field 
				And User has to click the login button
				Then User has to close the browser

