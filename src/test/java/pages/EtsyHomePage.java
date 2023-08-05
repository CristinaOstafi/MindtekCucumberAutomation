package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyHomePage {
    WebDriver driver;
    public EtsyHomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBar;

    @FindBy(xpath = "//ol[@data-results-grid-container]//h3")
    public List<WebElement> items;

    @FindBy (id = "search-filter-button")
    public WebElement allFiltersBtn;

    @FindBy(xpath = "//label[@for='price-input-4']")
    public WebElement over1000Btn;

    @FindBy(xpath = "//button[@aria-label='Apply']")
    public  WebElement applyBtn;

    @FindBy (xpath = "//ol[@data-results-grid-container]//p[2]//span[@class='currency-value']")
    public  List<WebElement> prices;

    @FindBy(xpath = "//span[contains(text(),'Fashion Favourites')]")
    public WebElement fashionAndFavoritesTab;

    @FindBy(xpath = "//span[@id='catnav-primary-link-10855']")
    public WebElement jewelryAccessoriesTab;

    @FindBy(id = "catnav-primary-link-10923")
    public WebElement clothingShoes;

    @FindBy(id = "catnav-primary-link-891")
    public WebElement homeLiving;

    @FindBy(id = "catnav-primary-link-10983")
    public WebElement weddingParty;

    @FindBy(id = "catnav-primary-link-11049")
    public WebElement toysEntertainment;

    @FindBy(id = "catnav-primary-link-66")
    public WebElement artCollectibles;

    @FindBy(id = "catnav-primary-link-562")
    public WebElement craftSupplies;

    @FindBy(id = "catnav-primary-link--10")
    public  WebElement giftCards;



}
