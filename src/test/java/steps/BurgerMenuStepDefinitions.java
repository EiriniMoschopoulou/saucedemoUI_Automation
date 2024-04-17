package steps;

import io.cucumber.java.en.And;

import pages.*;

public class BurgerMenuStepDefinitions {



    @And("^user opens Burger Menu")
    public void useropensBurgerMenu() {
        burgerMenuPage.clickOnBurgerMenuBtn();


    }
}
