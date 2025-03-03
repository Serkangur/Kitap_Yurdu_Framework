package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.searchInputMethod;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='cookiescript_accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//div[@class=\"menu-top-button login\"]")
    public WebElement clickLoginButton;

    @FindBy(id = "search-input")
    public WebElement search_Input;

    @FindBy(xpath = "//div[@class=\"menu-top-button register\"]")
    public WebElement newUserButton;

    public void clickCookieButton() {
        acceptCookies.click();
    }

    public void clickNewUserButton() {
        newUserButton.click();
    }

    public void clickLoginButton() {
        clickLoginButton.click();
    }

    public void setSearch_Input(String txt) {
        searchInputMethod(txt,search_Input);
    }
    public void clearSearchBox(){
        search_Input.clear();
        search_Input.sendKeys("");
    }



}
