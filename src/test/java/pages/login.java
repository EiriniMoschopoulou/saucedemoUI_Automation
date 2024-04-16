package pages;

import org.openqa.selenium.By;


public class login {
    public static final By inputFieldName = By.xpath("//*[@data-test='username']");
    public static final By inputFieldPassword = By.xpath("//*[@data-test='password']");
    public static final By loginButton = By.xpath("//*[@data-test='login-button']");

    public static void clickLoginBtn() {
//        commonFunctions.pressClick(commonFunctions.findElementCustom(loginButton));
        commonFunctions.findElementCustom(loginButton).click();
    }


    public static void inputUsername(String username) {
//        commonFunctions.sendKeys(commonFunctions.findElementCustom(inputFieldName),username);
     commonFunctions.findElementCustom(inputFieldName).sendKeys(username);
    }

    public static void inputPassword(String password) {
       commonFunctions.findElementCustom(inputFieldPassword).sendKeys(password);
    }
}
