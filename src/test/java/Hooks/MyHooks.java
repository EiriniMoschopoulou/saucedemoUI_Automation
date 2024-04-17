package Hooks;


import io.cucumber.java.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import utils.BaseClass;

import java.util.concurrent.TimeUnit;


public class MyHooks extends BaseClass {

    public MyHooks() {
    }

    public MyHooks(WebDriver driver) {
        super(driver);
        BaseClass.driver = driver;
    }


    @Before
    public void navigateToLoginPage() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        System.out.println("This is the start of the scenario");
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
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
