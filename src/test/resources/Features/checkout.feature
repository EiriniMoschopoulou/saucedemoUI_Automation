Feature: Checkout Page
	  Background:
			Given user logs in with credentials username "standard_user" and password "secret_sauce"
			And clicks on Login button
			Then the user should be "loggedIn"

	  Scenario: Assert Checkout page without products
			When user clicks on shopping cart button
			Then the checkout page has the continue shopping button
			And the checkout page includes checkout Button
			And the checkout page includes quantity label
			And the checkout page includes description label
			And the url is the expected "https://www.saucedemo.com/cart.html"


		Scenario:Assert Checkout page with product
			  And user opens product details page
			  When user clicks on Add to cart button
			  When user clicks on shopping cart button
			  And each product has title
			  And each product has price
