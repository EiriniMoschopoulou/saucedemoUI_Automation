Feature: Assert Burger Menu
Background:

	  Given user logs in with credentials username "standard_user" and password "secret_sauce"
	  And clicks on Login button
	  And the user should be "loggedIn"


	  Scenario: Open burger Menu and verify its content

			When user opens Burger Menu
			Then burger menu has All items button
			And burger menu has About button
			And burger menu has Reset App state button


	  Scenario: Open burger Menu and click on All Items

			And user opens Burger Menu
			When user clicks on All items button
			Then the page should have title "Products"
			And the page should have the sorting functionality
			And the page should have the shopping cart button

	  Scenario: Open burger Menu and click on About Button

			And user opens Burger Menu
			When user clicks on About button
			Then user is redirecting to saucelab page
