package pages;
import Hooks.MyHooks;
import org.apache.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import org.slf4j.LoggerFactory;

import java.util.List;





public class commonFunctions extends MyHooks {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

    public commonFunctions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public static void pressClick(WebElement element) {
        logger.info("Click");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        logger.info(element.getText());
    }

    public void elementIsDisplayed(By element) {
        try {
            logger.info("Asserting that this element is displayed: " +element);
            driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            logger.info("The element " + element + " is not visible");

        }
    }


    public static WebElement findElementCustom(By element){
        try {
            logger.info("Trying to find element: " +element);
            return driver.findElement(element);
        } catch (Exception e) {
            logger.info("The element " + element + " is not found with exception " + e.getMessage(), e);
        }
        return (WebElement) element;
    }

    public List<WebElement> findElementsCustom(By element){
        try {
            logger.info("Trying to find elements: " +element);
            return driver.findElements(element);
        } catch (Exception e) {
            logger.info("The element " + element + " is not found with exception " + e.getMessage(), e);
        }
        return (List<WebElement>) element;
    }

    public void scrollDown() {
        logger.info("Scrolling down") ;
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public void ScrollUp() {
        logger.info("Scrolling down") ;
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public static void sendKeys(WebElement e, String input) {
        logger.info("typing:" + input) ;
        Actions actionObject = new Actions(driver);
        pressClick(e);
        actionObject.sendKeys(input).build().perform();
    }


    public static String getCurrentUrl(WebDriver driver) {
        logger.info("Current Url found: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
//
//    public WebElement waitFor(By by, Duration timeout, Duration polling) {
//        logger.info("Waiting for Element " + by.toString());
//        return waitFor(timeout, polling, ExpectedConditions.visibilityOfElementLocated(by));
//    }


}

