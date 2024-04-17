package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class OrderPageStepDefinitions {

    @Then("^the contact information page is opening")
    public void thecontactinformationpageisopening() {
        orderPage.verifyContantInfoPage();

    }

    @And("user fills in her personal details")
    public void userFillsInHerPersonalDetails() {
        orderPage.fillInPersonalRandomDetails();
    }

    @And("user clicks on Continue Button")
    public void userClicksOnContinueButton() {
        orderPage.clickOnContinueBtn();
    }

    @And("user sees the overview of delivery page")
    public void userSeesTheOverviewOfDeliveryPage() {
        orderPage.assertTitleOfOrderOverviewPage("Checkout: Overview");
    }

    @When("user clicks on Finish order button")
    public void userClicksOnFinishOrderButton() {
        orderPage.clickOnFinishOrderBtn();
    }

    @Then("a successful Thank you for your order message is shown to the user")
    public void aSuccessfulThankYouForYourOrderMessageIsShownToTheUser() {
        orderPage.verifyfinishOrderSuccessfulMsg("Thank you for your order!");
    }
}
