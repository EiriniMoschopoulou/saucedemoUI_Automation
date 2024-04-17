package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

import java.util.stream.Stream;

public class orderPage extends BaseClass {

    public static final By checkoutInfoContainer = By.xpath("//*[@data-test='checkout-info-container']");
    public static final By inputFirstName = By.xpath("//*[@data-test='firstName']");
    public static final By inputLastName = By.xpath("//*[@data-test='lastName']");
    public static final By inputzipCode = By.xpath("//*[@data-test='postalCode']");
    public static final By continueBtn = By.xpath("//*[@data-test='continue']");
    public static final By finishOrderBtn = By.xpath("//*[@data-test='finish']");
    public static final By successfulOrderTxt = By.xpath("//*[@data-test='complete-header']");


    
    static Faker faker = new Faker();
    
    public orderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void verifyContantInfoPage() {
        commonFunctions.elementIsDisplayed(checkoutInfoContainer);
    }

    public static void fillInPersonalRandomDetails() {
       String randomFirstName= faker.name().firstName();
       String randomlastName = faker.name().lastName();
       String randomZip=  faker.address().zipCode();
        commonFunctions.sendKeys(inputFirstName,randomFirstName);
        commonFunctions.sendKeys(inputLastName,randomlastName);
        commonFunctions.sendKeys(inputzipCode,randomZip);

    }

    public static void clickOnContinueBtn() {
        commonFunctions.pressClick(continueBtn);
    }

    public static void assertTitleOfOrderOverviewPage(String titleofPage) {
        String titleOrders = driver.findElement(commonFunctions.titlePage).getText();
        commonFunctions.equals(titleofPage, titleOrders,
                "The title in the Orders page is not the expected");

    }

    public static void clickOnFinishOrderBtn() {
        commonFunctions.pressClick(finishOrderBtn);
    }

    public static void verifyfinishOrderSuccessfulMsg(String ExpectedMessage) {
        String messge = driver.findElement(successfulOrderTxt).getText();
        commonFunctions.equals(messge, ExpectedMessage,
                "The order is not finished successfully");
    }
}
