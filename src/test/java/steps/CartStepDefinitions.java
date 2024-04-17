package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class CartStepDefinitions {

    @Then("^the checkout page has the continue shopping button")
    public void productsAreAddingToCart() {
        cartPage.verifyContinueShoppingbtnExistance();

    }

    @And("^the checkout page includes checkout Button")
    public void theCheckoutPageIncludesCheckoutButton() {
        cartPage.verifyCheckoutBtnExistance();
    }

    @And("^the checkout page includes quantity label")
    public void theCheckoutPageIncludesQuantityLabel() {
        cartPage.verifyCartQuantityExistance();
    }

    @And("^the checkout page includes description label")
    public void theCheckoutPageIncludesDescriptionLabel() {
        cartPage.verifyCartDescriptionExistance();
    }

    @And("^the url is the expected \"([^\"]*)\"")
    public void theUrlIsTheExpected(String urlExpected) {
        cartPage.verifycartURL(urlExpected);
    }

    @When("user clicks on Proceed to checkout Button")
    public void userClicksOnProceedToCheckoutButton() {
        cartPage.clickonProceedtoCheckoutPage();
    }
}
