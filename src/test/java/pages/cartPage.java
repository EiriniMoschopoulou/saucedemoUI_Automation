package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class cartPage extends BaseClass {
    public static final By continueShoppingBtn = By.xpath("//*[@data-test='continue-shopping']");
    public static final By continuecheckoutBtn = By.className("checkout_button");
    public static final By goToCheckoutBtn = By.xpath("//*[@data-test='checkout']");
    public static final By cartQuantityLabel = By.xpath("//*[@data-test='cart-quantity-label']");
    public static final By cartDescLabel = By.xpath("//*[@data-test='cart-desc-label']");


    public cartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void verifyContinueShoppingbtnExistance() {
        commonFunctions.elementIsDisplayed(continueShoppingBtn);
    }

    public static void verifyCheckoutBtnExistance() {
        commonFunctions.elementIsDisplayed(goToCheckoutBtn);
    }

    public static void verifyCartQuantityExistance() {
        commonFunctions.elementIsDisplayed(cartQuantityLabel);
    }

    public static void verifyCartDescriptionExistance() {
        commonFunctions.elementIsDisplayed(cartDescLabel);
    }

    public static void verifycartURL(String urlExpected) {
        commonFunctions.verifyGeneralPageURL(urlExpected);
    }

    public static void clickonProceedtoCheckoutPage() {
        commonFunctions.pressClick(continuecheckoutBtn);
    }
}
