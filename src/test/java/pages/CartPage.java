package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='js-count-plus-button cart-sprite cart-icon-plus ms-2px']")
    public WebElement bookAdd;

    @FindBy(xpath = "//div[@id='cart-nav-total']")
    public WebElement productPrice;

    @FindBy(xpath = "//span[@id='cart-items']")
    public WebElement cartAmount;

    @FindBy(xpath = "//p[@class='fs-14 fw-bold lh-1 mb-0']")
    public WebElement productPriceDetail;

    @FindBy(xpath = "//div[@class='js-remove-button d-flex align-items-center pe-10px']")
    public WebElement cleanCart;

    @FindBy(xpath = "//button[@class='btn fs-18 bg-gray-200 lh-sm text-gray-900 mb-10px p-15px']")
    public WebElement cleanCartClick;

    @FindBy(xpath = "//div[@class='cart-empty-text fs-16']")
    public WebElement cartCleanCheck;

    @FindBy(xpath = "//i[@id='minus-button-281936']")
    public WebElement bookSubtract;

    @FindBy(xpath = "//div[@class=\"logo-text\"]")
    public WebElement logo;


    public void valueAdd(){
        clickToWebElement(bookAdd);
        delay(2);

    }

    public void addPopUpIsDisplayed(){
        String bookPrice= getTextMethodString(productPrice);
        String bookPriceDetail=getTextMethodString(productPriceDetail);

        double bookPriceDouble=Double.parseDouble(bookPrice.replaceAll("[^0-9.]", ""));
        double bookPriceDetailDouble=Double.parseDouble(bookPriceDetail.replaceAll("[^0-9.]", ""));

        if(bookPriceDouble==bookPriceDetailDouble){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
    public void cleanCart()  {
        clickToWebElement(cleanCart);
        delay(1);
        clickToWebElement(cleanCartClick);
    }

    public void cartClearIsDisplayed(){
        Assert.assertTrue(cartCleanCheck.isDisplayed());
    }

    public void valueSubtract()  {
        clickToWebElement(bookSubtract);
        delay(2);
    }

    public void cleanSearch(){
        WebElement searchBox = Driver.getDriver().findElement(By.id("search-input"));  // Tek bir element al
        searchBox.clear();  // Input'u temizle
    }



}
