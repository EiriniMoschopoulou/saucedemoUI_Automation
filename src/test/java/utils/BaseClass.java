package utils;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
    protected static WebDriver driver;

    public BaseClass(){
    }
    public BaseClass(WebDriver driver) {
        this.driver=driver;
    }


    @BeforeClass
    public static WebDriver setup(){
        WebDriver driver=new ChromeDriver();
        System.out.println("This is the start of the driver");
        driver.manage().window().maximize();

        return driver;

    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }


}
