Feature: Assert End 2 End flow for order


	  Background:
			Given user logs in with credentials username "standard_user" and password "secret_sauce"
			And clicks on Login button


	  Scenario Outline: Assert Order flow for products
			And user adds the "<noOfItems>" products to card
			And "<noOfItems>" products are adding to cart
			And remove button is shown "<noOfItems>" for the selected products
			And user clicks on shopping cart button
			When user clicks on Proceed to checkout Button
			Then the contact information page is opening


			Examples:
				  | noOfItems |
				  | 1         |
				  | 5         |



			Scenario Outline: Input Personal Details and order
				  And user adds the "<noOfItems>" products to card
				  And user clicks on shopping cart button
				  And user clicks on Proceed to checkout Button
				  And user fills in her personal details
				  And user clicks on Continue Button
				  And user sees the overview of delivery page
				  When user clicks on Finish order button
				  Then a successful Thank you for your order message is shown to the user




				  Examples:
						| noOfItems |
						| 1         |
						| 5         |

