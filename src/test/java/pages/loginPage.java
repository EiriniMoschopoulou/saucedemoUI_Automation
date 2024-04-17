package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;


public class loginPage extends BaseClass {

    public static final By inputFieldName = By.xpath("//*[@data-test='username']");
    public static final By inputFieldPassword = By.xpath("//*[@data-test='password']");
    public static final By loginButton = By.xpath("//*[@data-test='login-button']");
    public static final By logoutButton = By.xpath("//*[@data-test='logout-sidebar-link']");
    public static final By loginError = By.xpath("//*[@data-test='error']");


    public loginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public static void clickLoginBtn() {
        commonFunctions.pressClick(loginButton);
    }


    public static void inputUsername(String username) {
        commonFunctions.sendKeys(inputFieldName,username);

    }

    public static void inputPassword(String password) {
       commonFunctions.sendKeys(inputFieldPassword,password);
    }

    public static void clickLogoutBtn() {
        commonFunctions.pressClick(logoutButton);
    }

    public static void assertloginError(String errorMsg) {
        String expectedErrorMsg = driver.findElement(loginError).getText();
        commonFunctions.equals(errorMsg,expectedErrorMsg,
                "Error message for locked user is not shown as expected");
    }
}
