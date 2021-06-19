import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    WebDriverWait wait = new WebDriverWait(driver,10,1000);

    WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickToElement (By by){
        findElement(by).click();
    }

    String getUrl(){
        return driver.getCurrentUrl();
    }

    void goToUrl(String x){
        driver.get(x);
    }
    
   /* void closePopUp(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        logger.setCapability(ChromeOptions.CAPABILITY, options);
    }*/
}