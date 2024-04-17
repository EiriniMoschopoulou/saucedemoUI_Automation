Feature: Assert Login functionality
	

	  Scenario: Login with valid credentials

			Given user logs in with credentials username "standard_user" and password "secret_sauce"
			When clicks on Login button
			Then the user should be "loggedIn"
			And user opens Burger Menu
			And user logs out



	  Scenario: Login with invalid credentials - Locked out user

			Given user logs in with credentials username "locked_out_user" and password "secret_sauce"
			When clicks on Login button
			Then the user should see an error "Epic sadface: Sorry, this user has been locked out."


	



			