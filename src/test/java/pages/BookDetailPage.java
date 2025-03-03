package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.clickToWebElement;
import static utilities.ReusableMethods.delay;

public class BookDetailPage {
    public BookDetailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='preparation-day']")
    public WebElement stockText;

    @FindBy(id = "button-cart")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//div[@class='heading']")
    public WebElement cartPlace;

    @FindBy(xpath = "//a[@id='js-cart']")
    public WebElement cartClick;

    @FindBy(xpath = "//div[@class='empty']")
    public WebElement cartEmpty;

    @FindBy(xpath = "//h2[@class=\"swal2-title ky-swal-title-single\"]")
    public WebElement popUpElement;

    public void stockTextIsDisplayed() {
        Assert.assertTrue(stockText.isDisplayed());
    }
    public void addCart(int times) {
        for (int i = 0; i < times; i++) {
            clickToWebElement(sepeteEkle);
        }
    }

    public String getTextMethodString(WebElement element) {
        String text = element.getText();
        return text;
    }

    public void popUpCheck(String amount,WebElement element){
        String actualResult=getTextMethodString(element);
        Assert.assertTrue(actualResult.contains(amount));
    }

    public void popUpCheck(){
        popUpCheck("2",popUpElement);

    }

    public void goToCartPlace(){
        clickToWebElement(cartPlace);
        delay(1);
        clickToWebElement(cartClick);
    }

    public void goToCartEmpty(){
        clickToWebElement(cartPlace);
    }

    public void cartEmptyIsDisplayed(){
        Assert.assertTrue(cartEmpty.isDisplayed());
    }


}
