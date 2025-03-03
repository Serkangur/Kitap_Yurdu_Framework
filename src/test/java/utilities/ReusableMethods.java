
package utilities;



import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import static java.nio.file.Files.find;

public class ReusableMethods {
    //Tekrar eden methodları bunun içine yazıyoruz!!!


    //-------------Ekran Görüntüsü Alma------------ //
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Pencere Değiştirme =====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Üzerine gelme methodu =====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========WebElement listesini String listesine dönüştürme methodu====////
    public static List<String> stringListeCevir(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Bir elementin metnini döndürme ==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Üzerine gelme methodu =====//
    public static void hoverClick(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).click().perform();
    }


    //   Zorunlu Bekleme
//   waitFor(5);  => waits for 5 second
    public static void delay(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Belirli bir süre için bekle==============//
    //Belirtilen süre boyunca belirtilen webelementin görünür olmasını bekler
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Belirtilen süre boyunca By locator ve WebElementin görünür olmasını bekler
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    //Altdaki iki tanede tıklanabilir olmayı bekler
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                delay(1);
            }
        }
    }

    //Sayfanın belirli bir süre yüklenmesini bekler
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }

    //======Fluent Wait====//
    //Belirtilen süre boyunca web elementin var olmasını bekler
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;
    }

    public static void searchInputMethod(String input, WebElement element) {
        element.clear();
        element.sendKeys(input, Keys.ENTER);
    }

    public static void textInput(String input, WebElement element) {
        element.clear();
        element.sendKeys(input);
    }


    public  static void verifyTextContains(WebElement element,String bookName){

        String elementText = element.getText();
        Assert.assertTrue(elementText.toLowerCase().contains(bookName));
    }

    public static void assertTrueDoubleCheck(WebElement element,String bookName1,String bookName2){

        String elementText = element.getText();
        boolean isValid = elementText.contains(bookName1) || elementText.contains(bookName2);
        Assert.assertTrue(isValid);
    }


    public static List<WebElement> getValues(WebElement element) {
        return element.findElements(By.xpath(".//*")); // İçindeki tüm öğeleri al
    }

    public static void urlCheckMethods(String url){
        String expectedUrl=url;
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public static void clickToWebElement (WebElement element){
        element.click();
    }

    public static String getTextMethodString(WebElement element) {
        String text = element.getText();
        return text;
    }

    public static String generateRandomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }


    public void selectElement(WebElement element, String selected){
        Select select =new Select(element);
        select.selectByVisibleText(selected);
    }

    public void dropDownSelect(WebElement element,String dropDown){
        selectElement(element,dropDown); //Ucuzdan Pahalıya
    }



}
