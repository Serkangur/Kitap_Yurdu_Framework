package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id=\"login-email\"]")
    public WebElement emailText;

    @FindBy(xpath = "//input[@id=\"login-password\"]")
    public WebElement passwordText;

    @FindBy(xpath = "//button[@role=\"button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@class=\"common-sprite\"])[1]")
    public WebElement accountIsDisplayed;

    @FindBy(xpath = "//div[@class=\"ky-checkbox-input\"]")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//div[@class=\"ky-error\"]")
    public WebElement errorText;

    @FindBy(xpath = "//a[@type=\"submit\"]")
    public WebElement newUserButton;





    public void trueloginMailText() {
        emailText.sendKeys(ConfigReader.getProperty("e-posta"));
    }
    public void trueloginPasswordText(){
        passwordText.sendKeys(ConfigReader.getProperty("password"));
    }
    public void clickSubmitButton(){
        hoverClick(loginButton);
    }
    public void clickRememberMeCheckbox(){
        rememberMeCheckbox.click();
    }
   public void errorTextCheck(){
       Assert.assertTrue(errorText.isDisplayed());
   }
    public void loginPasswordText(String password){
        passwordText.sendKeys(password);
    }
    public void loginMailText(String txt){
        emailText.sendKeys(txt);
    }


}
