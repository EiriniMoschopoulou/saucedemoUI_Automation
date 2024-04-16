package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class LoginPageStepDefinitions {

    @When("^user logs in with credentials username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void userLogsInWithCredentialsUsernameAndPassword(String username, String password) {
        login.inputUsername(username);
        login.inputPassword(password);


    }

    @Then("^the user should be \"([^\"]*)\"")
    public void theUserShouldBe(String expectedResult) {
    }

    @And("^clicks on Login button")
    public void clicksOnLoginButton() {
        login.clickLoginBtn();
    }


}
