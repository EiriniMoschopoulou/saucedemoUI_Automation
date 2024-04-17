package pages;


import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import utils.BaseClass;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class productsPage extends BaseClass {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

    public static final By titleProductsPage = By.xpath("//*[@data-test='title']");
    public static final By sortingBtn = By.xpath("//*[@data-test='product-sort-container']");
    public static final By shoppingCartBtn = By.xpath("//*[@data-test='shopping-cart-link']");
    public static final By shoppingListItems = By.xpath("//*[@data-test='inventory-item']");
    public static final By shoppingCartBadge = By.xpath("//*[@data-test='shopping-cart-badge']");
    public static final By productname = By.xpath("//*[@data-test='inventory-item-name']");
    public static final By productprice = By.xpath("//*[@data-test='inventory-item-price']");

    public static final By addToCardBtn = By.className("btn_inventory");
    public static final By removeBtn = By.xpath("//button[contains(@class,'btn_inventory') and (text()='Remove')]");


    public productsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static void verifyProductsPageURL() {
        driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
    }






    public static void assertProductsListPageTitle(String title) {
        String titleProducts = driver.findElement(commonFunctions.titlePage).getText();
        commonFunctions.equals(title, titleProducts,
                "The title in the Products page is not the expected");
    }

    public static void verifySortingFunctionalityExistance() {
        commonFunctions.elementIsDisplayed(sortingBtn);
    }

    public static void verifyshoppingCartExistanceBtn() {
        commonFunctions.elementIsDisplayed(shoppingCartBtn);
    }

    public static void verifyNumberOfProducts(int noOfProducts) {
        int actualNumberOfProducts = driver.findElements(shoppingListItems).size();
        commonFunctions.equals(noOfProducts, actualNumberOfProducts,
                "Homepage does ot have the expected number of products");

    }

    public static void addProductToCart(int itemsToBecliked) {
        List<WebElement> listItems = driver.findElements(shoppingListItems);
        int NumberOfProducts = listItems.size();
        //asserting that the required items to be clicked are not more than the visual ones
        if (itemsToBecliked <= NumberOfProducts) {
            for (int i = 0; i < itemsToBecliked; i++) {
                listItems.get(i).findElement(addToCardBtn).click();
            }
        }
    }

    public static void verifyNumberOfProductsAddedtoCart(int itemsSelected) {
        int noOfProductsTocard = Integer.parseInt(driver.findElement(shoppingCartBadge).getText());
        commonFunctions.equals(itemsSelected, noOfProductsTocard,
                "Adding to card functionality through products page is not working properly");
    }

    public static void clickonProduct(String indicationofProduct) {
        List<WebElement> listItems = driver.findElements(shoppingListItems);
        if (indicationofProduct.equals("first")) {
            listItems.get(0).findElement(productname).click();
        }
    }

    public static void verifyExistenceofRemoveBtn(int noOfRemovebtn) {
        int listRemoveBtn = driver.findElements(removeBtn).size();
        commonFunctions.equals(noOfRemovebtn, listRemoveBtn, "Remove button is not shown correctly for all the selected products");
    }

    public static void assertProductsTitleinProducts() {
        List<WebElement> listItems = driver.findElements(shoppingListItems);
        int NumberOfProducts = listItems.size();


        for (int i = 0; i < NumberOfProducts; i++) {
            String productTitle = listItems.get(i).findElements(productname).get(i).getText();
            logger.info("Checking that the title of each product is not null :" + productTitle);
            assertTrue(StringUtils.isNotEmpty(productTitle));
        }
    }

    public static void assertProductsPriceinProducts() {
        List<WebElement> listItems = driver.findElements(shoppingListItems);
        int NumberOfProducts = listItems.size();


        for (int i = 0; i < NumberOfProducts; i++) {
            String productPrice = listItems.get(i).findElements(productprice).get(i).getText();
            logger.info("Checking that the price of each product is not null :" + productPrice);
            assertTrue(StringUtils.isNotEmpty(productPrice));
        }
    }

    public static void clickOnshoppingCartbtn() {
        commonFunctions.elementIsDisplayed(shoppingCartBtn);
        commonFunctions.pressClick(shoppingCartBtn);
    }
}


