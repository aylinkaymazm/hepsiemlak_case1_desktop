import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BaseMethods {
    Logger logger = Logger.getLogger(BaseMethods.class);

    public static WebDriver webDriver(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiemlak.com/");
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver driver = webDriver();
    static WebDriverWait wait = new WebDriverWait(driver,10,1000);

    static WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickToElement (By by){
        findElement(by).click();
    }
    String getUrl(){
        return driver.getCurrentUrl();
    }


}