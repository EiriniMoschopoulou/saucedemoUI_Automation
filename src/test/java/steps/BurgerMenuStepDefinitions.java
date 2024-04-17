package steps;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class BurgerMenuStepDefinitions {



    @And("^user opens Burger Menu")
    public void useropensBurgerMenu() {
        burgerMenuPage.clickOnBurgerMenuBtn();


    }

    @Then("burger menu has All items button")
    public void burgerMenuHasAllItemsButton() {
        burgerMenuPage.verifyallItemsBtnExistance();
    }

    @And("burger menu has About button")
    public void burgerMenuHasAboutButton() {
        burgerMenuPage.verifyAboutBtnExistance();
    }

    @And("burger menu has Reset App state button")
    public void burgerMenuHasResetAppStateButton() {
        burgerMenuPage.verifyResetAppStateBtnExistence();
    }

    @When("user clicks on All items button")
    public void userClicksOnAllItemsButton() {
        burgerMenuPage.clickonAllItems();
    }

    @When("user clicks on About button")
    public void userClicksOnAboutButton() {
        burgerMenuPage.clickonAboutBtn();
    }

    @Then("user is redirecting to saucelab page")
    public void userIsRedirectingToSaucelabPage() {
        commonFunctions.verifyGeneralPageURL("https://saucelabs.com/");
    }
}
