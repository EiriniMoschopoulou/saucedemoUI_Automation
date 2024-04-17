Feature: Add to cart Functionality

	  Background:
			Given user logs in with credentials username "standard_user" and password "secret_sauce"
			And clicks on Login button


	  Scenario Outline: Asserting Add to cart functionality via products page
			When user adds the "<noOfItems>" products to card
			Then "<noOfItems>" products are adding to cart
			And remove button is shown "<noOfItems>" for the selected products


			Examples:
				  | noOfItems |
				  | 1         |
				  | 5         |


	  Scenario: Asserting Add to cart functionality via products details page
			And user opens product details page
			When user clicks on Add to cart button
			Then "1" products are adding to cart
			And remove button is shown "1" for the selected products