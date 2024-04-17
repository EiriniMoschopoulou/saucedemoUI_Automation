package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class burgerMenuPage extends BaseClass {
    public static final By burgerMenuBtn = By.xpath("//*[@id='react-burger-menu-btn']");
    public static final By allItemsBtn = By.xpath("//*[@data-test='inventory-sidebar-link']");
    public static final By aboutBtn = By.xpath("//*[@data-test='about-sidebar-link']");
    public static final By resetBtn = By.xpath("//*[@data-test='reset-sidebar-link']");

    public burgerMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void clickOnBurgerMenuBtn() {
        commonFunctions.elementIsDisplayed(burgerMenuBtn);
        commonFunctions.pressClick(burgerMenuBtn);
    }

    public static void verifyAboutBtnExistance() {
        commonFunctions.elementIsDisplayed(aboutBtn);
    }


    public static void verifyallItemsBtnExistance() {
        commonFunctions.elementIsDisplayed(allItemsBtn);
    }

    public static void verifyResetAppStateBtnExistence() {
        commonFunctions.elementIsDisplayed(resetBtn);
    }

    public static void clickonAllItems() {
        commonFunctions.pressClick(allItemsBtn);
    }

    public static void clickonAboutBtn() {
        commonFunctions.pressClick(aboutBtn);
    }
}
