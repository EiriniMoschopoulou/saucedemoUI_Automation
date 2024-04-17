Feature: Assert Products Page

	  Background:
			Given user logs in with credentials username "standard_user" and password "secret_sauce"
			When clicks on Login button
			Then the user should be "loggedIn"

	  Scenario: Assert Products Page with valid user
			And the page should have title "Products"
			And the page should have the sorting functionality
			And the page should have the shopping cart button
			And the products list should have "6" products
			And each product has title
			And each product has price
