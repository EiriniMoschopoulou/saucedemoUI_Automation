package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class LoginPageStepDefinitions {

    @Given("^user logs in with credentials username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void userLogsInWithCredentialsUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);


    }

    @Then("^the user should be \"([^\"]*)\"")
    public void theUserShouldBe(String expectedResult) {
        switch (expectedResult){
            case "loggedIn":
                productsPage.verifyProductsPageURL();

        }
    }

    @When("^clicks on Login button")
    public void clicksOnLoginButton() {
        loginPage.clickLoginBtn();
    }


    @And("user logs out")
    public void userLogsOut() {
        loginPage.clickLogoutBtn();

    }

    @Then("^the user should see an error \"([^\"]*)\"")
    public void theUserShouldSeeAnError(String errorMsg) {
        loginPage.assertloginError(errorMsg);


    }
}
