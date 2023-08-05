package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class BrowserUtils {
    /**
     * This method generates random emails
     * Ex:
     *       .getRandomEmail(); -> returns user5sh4k-12jsdcd-nk2n3@gmail.com
     */

    public static String getRandomEmail(){
        UUID uuid = UUID.randomUUID();
        return "user"+uuid+"@gmail.com";
    }
    /**
     * This method takes screenshots.
     * Ex:
     *     .takeScreenshot("NameOfScreenshot");
     */
    public static void takeScreenshot(String testName) throws IOException {
        WebDriver driver = Driver.getDriver();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path = "src/test/resources/screenshots/"+testName+".png";// location for screenshot,where is saved
        File file = new File(path);
        FileUtils.copyFile(screenshot, file);
    }
    /**
     * This method accepts a WebElement and a String value to select
     * an option from a dropDown by value
     * Ex:
     *     .selectDropDownByValue(WebElement dropdown,String value);

     */

    public  static  void selectDropdownByValue(WebElement dropdown, String value){
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    /**
     * This method will create a WebDriverWait object and wait for certain text to be present in a WebElement
     * Ex:
     *       .waitsForTextToBePresentInElement(WebElement element, String expectedText)
     *
     *
     */
    public static void waitsForElementToBeClickable(WebElement element, String expectedText){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
    }

    /**
     * This method waits for certain element to be clickable.
     * Ex:
     *     .waitsForTextToBeClickable(WebElement element)
     * @param element
     */
    public static void waitsForTextToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    /**
     * This method scrolls down by [num] px.
     * Ex:
     *     .scrollDownBy(int numOfPixels);
     */
     public static void scrollDownBy(Integer numOfPixel){
         JavascriptExecutor jse = ((JavascriptExecutor) Driver.getDriver());
         jse.executeScript("window.scrollBy0,"+numOfPixel+")");
     }
}
