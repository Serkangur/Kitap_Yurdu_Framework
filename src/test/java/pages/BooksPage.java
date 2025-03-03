package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class BooksPage {
    ReusableMethods reusableMethods = new ReusableMethods();

    public BooksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class=\"search-heading-title\"]")
    public WebElement listingBookCheck;

    @FindBy(xpath = "//div[@class=\"name\"]")
    public WebElement allBooksNameValue;

    @FindBy(xpath = "(//div[@class=\"name\"])[1]")
    public WebElement firstBook;

    @FindBy(xpath = "//div[@class=\"product-not-found\"]")
    public WebElement errorText;

    @FindBy(xpath = "//div[@class=\"author\"]")
    public WebElement allAuthorValue;

    @FindBy(xpath = "(//div[@class=\"publisher\"])[5]")
    public WebElement PublisingHouse;

    @FindBy(xpath = "(//i[@class=\"fa fa-shopping-cart\"])[8]")
    public WebElement cartAddButton;

    @FindBy(xpath = "//h2[@class=\"swal2-title ky-swal-title-single\"]")
    public WebElement popUpElement;

    @FindBy(xpath = "//div[@class=\"product-list\"]/div[3]//a")
    public WebElement secilen_kitap;

    @FindBy(xpath = "//span[@id='cart-items']")
    public WebElement cartAmount;

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    public WebElement minTextInput;

    @FindBy(xpath = "(//input[@type=\"text\"])[3]")
    public WebElement maxTextInput;

    @FindBy(xpath = "//a[text()='Güncelle']")
    public WebElement updateButton;

    @FindBy(xpath = "(//select[@onchange=\"location = this.value;\"])")
    public WebElement siralama;

    @FindBy(xpath = "(//span[@class=\"value\"])[4]")
    public WebElement firstBookPrice;

    @FindBy(xpath = "(//div[@class=\"name\"])[1]")
    public WebElement firstBookName;

    @FindBy(xpath = "(//span[text()='Oylama'])[2]")
    public WebElement ratingClick;

    @FindBy(xpath = "//span[@class=\"value\"]")
    public List<WebElement> allBooksPriceValues;

    @FindBy(xpath = "//div[@class=\"product-not-found\"]")
    public WebElement bookNotFound;


    public void bookListingCheck(String bookName) {
        verifyTextContains(listingBookCheck, bookName);
    }

    public void bookListingCheckDouble(String bookName1, String bookName2) {
        assertTrueDoubleCheck(listingBookCheck, bookName1, bookName2);
    }

    public void errorTextCheck(){
        Assert.assertTrue(errorText.isDisplayed());
    }

    public void verifyValuesContainDouble(String txt, String errorMessage) {
        List<WebElement> list1 = getValues(allAuthorValue);
        List<WebElement> list2 = getValues(allBooksNameValue);

        List<WebElement> combinedValues = new ArrayList<>();
        combinedValues.addAll(list1);
        combinedValues.addAll(list2);

        boolean found = false;

        for (WebElement element : combinedValues) {
            String text = element.getText();
            if (text.toLowerCase().contains(txt)) {
                found = true;
                System.out.println("Bulundu: " + text);
            }
            Assert.assertTrue(errorMessage, found);
        }
    }

    public void verifyValuesContain(WebElement element,String txt, String errorMessage) {
        boolean found = false;
        List<WebElement> list1 = getValues(element);
        for (WebElement Value : list1) {
            String ListText = Value.getText();
            if (ListText.toLowerCase().contains(txt)) {
                found = true;
            }
            Assert.assertTrue(errorMessage, found);
        }
    }

    public void differentLangueageSearchCheck(String txt) {
        verifyTextContains(firstBook, txt);
    }

    public void urlCheck(String url){
        urlCheckMethods(url);
    }

    public void clickCartAddButton(){
        clickToWebElement(cartAddButton);
    }

    public void popUpIsDisplayed(){
        Assert.assertTrue(popUpElement.isDisplayed());
    }

    public void bookClick(){
        clickToWebElement(secilen_kitap);
    }
    public void cartAddButton(){
        clickToWebElement(cartAddButton);
    }
    public void getCartText(){
        String totalBookAmount= getTextMethodString(cartAmount);
        System.out.println(totalBookAmount);
    }

    public void setMinTextBox(String minText) {
        textInput(minText,minTextInput);
    }

    public void setMaxTextBox(String maxText) {
        textInput(maxText,maxTextInput);
    }

    public void clickUpdateButton(){
        clickToWebElement(updateButton);
    }

    public void listingDropDownFromCheapToExpensive(){
        reusableMethods.dropDownSelect(siralama,"Ucuzdan Pahalıya");
    }

    public void getfirstBookPriceMin(Double min,Double max){
        String minPrice=getTextMethodString(firstBookPrice);
        minPrice = minPrice.replace(",", ".");
        double price = Double.parseDouble(minPrice);
        Assert.assertTrue("FAILED: Price is outside the valid range.", price >= min && price < max);

    }

    public void listingDropDownFromExpensiveToCheap(){
        reusableMethods.dropDownSelect(siralama,"Pahalıdan Ucuza");
    }

    public void getfirstBookPriceMax(Double min,Double max){
        String maxPrice=getTextMethodString(firstBookPrice);
        maxPrice = maxPrice.replace(",", ".");
        double price = Double.parseDouble(maxPrice);
        Assert.assertTrue("FAILED: Price is outside the valid range.", price >= min && price < max);

    }

    public void checkFirstBookName(){
        String beforeClickBookName=  getTextMethodString(firstBookName);
        clickUpdateButton();
        String afterClickBookName=getTextMethodString(firstBookName);
        Assert.assertEquals(beforeClickBookName,afterClickBookName);
    }

    public void clickRatingElement(){
        clickToWebElement(ratingClick);
    }

    public void ratingElementIsDisplayed(){
        Assert.assertFalse(ratingClick.isDisplayed());
    }

    public List<WebElement> getAllBooksPrice() {
        return allBooksPriceValues;
    }

    public void verifyAllBooksPriceExceptFirstThree(Double min, Double max) {
        List<WebElement> allBooksPriceValues = getAllBooksPrice();
        for (int i = 3; i < allBooksPriceValues.size(); i++) {
            WebElement bookValue = allBooksPriceValues.get(i);
            String posText = bookValue.getText();
            posText = posText.replace(",", ".");
            double price = Double.parseDouble(posText);
            Assert.assertTrue("FAILED: Price is outside the valid range.", price >= min && price < max);
        }
    }

    public void bookNotFoundMessageIsDisplayed(){
        Assert.assertTrue(bookNotFound.isDisplayed());
    }


}
