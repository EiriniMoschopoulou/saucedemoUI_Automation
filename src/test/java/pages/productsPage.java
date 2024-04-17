package pages;


import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class productsPage extends BaseClass {
    public productsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void verifyProductsPageURL(){
        driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }
}
