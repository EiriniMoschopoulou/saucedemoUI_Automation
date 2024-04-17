package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class ProductsPageStepDefinitions {

    @And("^the page should have title \"([^\"]*)\"")
    public void thePageShouldHaveTitle(String title) {
        productsPage.assertProductsListPageTitle(title);
    }

    @And("the page should have the sorting functionality")
    public void thePageShouldHaveTheSortingFunctionality() {
        productsPage.verifySortingFunctionalityExistance();
    }

    @And("the page should have the shopping cart button")
    public void thePageShouldHaveTheShoppingCartButton() {
        productsPage.verifyshoppingCartExistanceBtn();
    }

    @And("^the products list should have \"([0-9])\" products$")
    public void theProductsListShouldHaveProducts(int noOfProducts) {
        productsPage.verifyNumberOfProducts(noOfProducts);
    }


    @When("^user adds the \"([0-9])\" products to card$")
    public void userAddsTheProductsToCard(int itemsToBecliked) {
        productsPage.addProductToCart(itemsToBecliked);
    }

    @Then("^\"([0-9])\" products are adding to cart$")
    public void productsAreAddingToCart(int itemsSelected) {
        productsPage.verifyNumberOfProductsAddedtoCart(itemsSelected);
    }

    @And("^user opens product details page")
    public void userOpensProductDetailsPage() {
        productsPage.clickonProduct("first");
    }

    @And("^remove button is shown \"([0-9])\" for the selected products")
    public void removeButtonIsShownForTheSelectedProducts(int noOfRemovebtn) {
        productsPage.verifyExistenceofRemoveBtn(noOfRemovebtn);
    }

    @And("each product has title")
    public void eachProductHasTitle() {
        productsPage.assertProductsTitleinProducts();
    }

    @And("each product has price")
    public void eachProductHasPrice() {
        productsPage.assertProductsPriceinProducts();
    }
}
