package Hooks;


import io.cucumber.java.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BaseClass;


public class MyHooks extends BaseClass {

    public MyHooks() {
    }

    public MyHooks(WebDriver driver) {
        super(driver);
        BaseClass.driver = driver;
    }


    @Before
    public void navigateToLoginPage() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        System.out.println("This is the start of the scenario");
        driver.get("https://www.saucedemo.com/");
        driver.getCurrentUrl().equals("https://www.saucedemo.com/");
    }

    @After
    public static void closeBrowser() {
        System.out.println("This is the end of the scenario");
        driver.manage().deleteAllCookies();
        System.out.println("Chrome is going to be closed");
        driver.close();
        driver.quit();
    }
}
