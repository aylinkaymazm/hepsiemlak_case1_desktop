import org.openqa.selenium.By;

public class WebElementsConstants {

    public static By btn_satilik_icon = By.cssSelector("[title='İstanbul Satılık İlanları']");
    public static By btn_select_city = By.cssSelector("[class=he-select-base__value]");
    public static By btn_city_search = By.cssSelector("input[placeholder='İl Ara']");
   // public static By input_city = By.xpath("//span[contains(@class,'he-select-base__placeholder') and contains(text(),'İl Seçiniz')]");
    public static By btn_select_city_radio= By.cssSelector("[class=he-select__list-item]");

    public static By input_town = By.xpath("//span[contains(@class,'he-select-base__placeholder') and contains(text(),'İlçe Seçiniz')]");
    public static By btn_town_search = By.cssSelector("input[class=he-select-base__search][placeholder='İlçe Ara']");
  //  public static By btn_select_town = By.cssSelector("input[class=he-select-base__search][placeholder='İlçe Ara']");
    public static By btn_select_town_square= By.cssSelector("[class=he-multiselect__list-item]");

    public static By btn_kategori=By.cssSelector("label[for='category1']");

    public static By input_priceMin = By.cssSelector("input[class='floating-input priceMin']");
    public static By input_priceMax = By.cssSelector("input[class='floating-input priceMax']");

    public static By btn_bina_yasi = By.xpath("//div[contains(text(),'Bina Yaşı Seçiniz')]");
    public static By btn_select_bina_yasi_1 = By.xpath("//label[span[contains(text(),'Sıfır Bina')]]");
    public static By btn_select_bina_yasi_2 = By.xpath("//label[span[contains(text(),'1-5')]]");
    public static By btn_select_bina_yasi_3 = By.xpath("//label[span[contains(text(),'6-10')]]");

    public static By btn_search = By.cssSelector("a[class='btn btn-red btn-large']");

    public static By control_tags = By.cssSelector("ul[class='applied-filters-list']");

    public static By control_city_tag = By.xpath("//li[@class='applied-filters-list__group']/span[contains(text(),'İzmir')]");
    public static By control_town_tag = By.xpath("//li[@class='applied-filters-list__group']/span[contains(text(),'Çankaya')]");
    public static By control_bina_tag = By.xpath("//li[@class='applied-filters-list__group']/span[contains(text(),'2+1')]");
    public static By control_site_tag = By.xpath("//li[@class='applied-filters-list__group']/span[contains(text(),'Evet')]");


}


