package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;


public class MyHooks {
    protected static WebDriver driver=new ChromeDriver();

    public MyHooks(){
    }
    public MyHooks(WebDriver driver) {
        this.driver=driver;
    }


    @BeforeClass
    public static WebDriver setup() throws MalformedURLException {
        WebDriver driver=new ChromeDriver();
        System.out.println("This is the start of the scenario");

        driver.manage().window().maximize();
        return driver;

    }

    @Before
    public void navigateToLoginPage(){
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        driver.getCurrentUrl().equals("https://www.saucedemo.com/");

    }

    @After
    public static void closeBrowser() {
        System.out.println("This is the end of the scenario");
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
        driver = null;
    }
}
