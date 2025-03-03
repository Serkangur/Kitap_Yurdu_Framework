package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.clickToWebElement;

public class AccountPage {
    public AccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class=\"account-details__settings\"]")
    public WebElement accountSettings;

    public void accountSettingsClick(){
        clickToWebElement(accountSettings);
    }

}
