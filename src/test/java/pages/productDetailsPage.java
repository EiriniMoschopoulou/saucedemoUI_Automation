package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class productDetailsPage extends BaseClass {
    public static final By addToCartBtn = By.xpath("//*[@data-test='add-to-cart']");

    public productDetailsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void clickonAddToCartBtn() {
        commonFunctions.elementIsDisplayed(addToCartBtn);
        driver.findElement(addToCartBtn).click();
    }
}
