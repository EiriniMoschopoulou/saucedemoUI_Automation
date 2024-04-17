package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class burgerMenuPage extends BaseClass {
    public static final By burgerMenuBtn = By.xpath("//*[@id='react-burger-menu-btn']");

    public burgerMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void clickOnBurgerMenuBtn() {
        commonFunctions.elementIsDisplayed(burgerMenuBtn);
        commonFunctions.pressClick(burgerMenuBtn);
    }
}
