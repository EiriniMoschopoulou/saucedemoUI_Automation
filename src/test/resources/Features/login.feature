Feature: Assert Login functionality
	

	  Scenario Outline: Login with credentials
#			Given user is navigating to base url
			When user logs in with credentials username "<username>" and password "<password>"
			And clicks on Login button
			Then the user should be "<result>"

			Examples:
				  | username        | password     | result    |
				  | standard_user   | secret_sauce | loggedIn  |
#				  | locked_out_user | secret_sauce | lockedOut |
	
			
			