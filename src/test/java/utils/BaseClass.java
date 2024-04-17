package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class BaseClass {
    protected static WebDriver driver;

    public BaseClass() {
    }

    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }


    @BeforeClass
    public static WebDriver setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

//        WebDriver driver=new ChromeDriver();
        System.out.println("This is the start of the driver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);

        return driver;

    }

    @AfterClass
    public static void closeBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


}
