package pages;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import org.slf4j.LoggerFactory;
import utils.BaseClass;
import java.util.List;


public class commonFunctions extends BaseClass {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

    public commonFunctions(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public static void pressClick(By element) {
        logger.info(" Click to element: " + element);
        driver.findElement(element).click();

    }

    public static void elementIsDisplayed(By element) {
        try {
            logger.info(" Asserting that this element is displayed: " + element);
            driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            logger.info(" The element " + element + " is not visible ");

        }
    }


    public List<WebElement> findElementsCustom(By element) {
        try {
            logger.info("Trying to find elements: " + element);
            return driver.findElements(element);
        } catch (Exception e) {
            logger.info("The element " + element + " is not found with exception " + e.getMessage(), e);
        }
        return (List<WebElement>) element;
    }

    public void scrollDown() {
        logger.info("Scrolling down");
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public void ScrollUp() {
        logger.info("Scrolling down");
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public static void sendKeys(By element, String input) {
        logger.info("typing: " + input + " to element: " + element);
        driver.findElement(element).sendKeys(input);
    }


    public static String getCurrentUrl(WebDriver driver) {
        logger.info("Current Url found: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public static void equals(Object actual, Object expected, String Errormessage) {
        logger.info("checking if the received object: " + actual + "is the expected");
        try {
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            logger.info(Errormessage);
        }
    }

}



