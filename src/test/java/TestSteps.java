import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.TAB;


public class TestSteps extends BaseMethods{
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    public void anasayfa() {
        String mainPageUrl = getUrl();
        String mainPageUrlC = "https://www.hepsiemlak.com/";

        if (mainPageUrl.equals(mainPageUrlC)) {
            logger.info("Anasayfadasınız");
        }
    }

    public void satilik() throws InterruptedException {
        clickToElement(WebElementsConstants.btn_satilik_icon);
        Thread.sleep(2000);
    }
    public void konum() throws InterruptedException{
        clickToElement(WebElementsConstants.btn_select_city);
        findElement(WebElementsConstants.btn_city_search).sendKeys("İzmir");
        clickToElement(WebElementsConstants.btn_select_city_radio);
        Thread.sleep(2000);
        clickToElement(WebElementsConstants.input_town);
        findElement(WebElementsConstants.btn_town_search).sendKeys("Bornova");
        clickToElement(WebElementsConstants.btn_select_town_square);
        Thread.sleep(2000);

       /* WebElement radioButton = driver.findElement(new By.ByCssSelector("ul[class='he-select__list']"));
        boolean isEnabled = radioButton.isEnabled();
        if (isEnabled){
            radioButton.click();
            System.out.println("Clicked izmir");

        }*/

    }

    public void kategori(){
        clickToElement(WebElementsConstants.btn_kategori);
    }

    public void fiyat()throws InterruptedException{
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        findElement(WebElementsConstants.input_priceMin).sendKeys("100000");
        Thread.sleep(1000);
        findElement(WebElementsConstants.input_priceMin).sendKeys(TAB);

        findElement(WebElementsConstants.input_priceMax).sendKeys("2000000");
        //findElement(WebElementsConstants.input_priceMax).sendKeys(TAB);
        Thread.sleep(5000);
    }

    public void bina_yasi(){
        jse.executeScript("window.scrollBy(0,800)");
        clickToElement(WebElementsConstants.btn_bina_yasi);
        clickToElement(WebElementsConstants.btn_select_bina_yasi_1);
        clickToElement(WebElementsConstants.btn_select_bina_yasi_2);
        clickToElement(WebElementsConstants.btn_select_bina_yasi_3);
        jse.executeScript("window.scrollBy(0,300)");
        clickToElement(WebElementsConstants.btn_search);
    }


    public void control_tags() throws InterruptedException {
        String controlTag = "Tags bulunmamaktadır.";
        String ControlTagsA = findElement(WebElementsConstants.control_tags).getText();
        Thread.sleep(2000);

        findElement(WebElementsConstants.control_city_tag).getText().equals("İzmir");
        findElement(WebElementsConstants.control_town_tag).getText().equals("Bornova");
        findElement(WebElementsConstants.control_bina_tag).getText().equals("2+1");
        findElement(WebElementsConstants.control_site_tag).getText().equals("Evet");



    }


}
