package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class ProductPageDetailsStepDefinition {

    @When("^user clicks on Add to cart button")
    public void userClicksOnAddToCartButton() {
        productDetailsPage.clickonAddToCartBtn();
    }
}
