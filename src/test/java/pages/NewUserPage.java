package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class NewUserPage {
    public NewUserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "register-name")
    public WebElement nameTextBox;

    @FindBy(id = "register-lastname")
    public WebElement lastNameTextBox;

    @FindBy(id = "register-email")
    public WebElement emailTextBox;

    @FindBy(id = "register-password")
    public WebElement passwordTextBox;

    @FindBy(id = "register-password-confirm")
    public WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//div[@class='d-flex flex-row align-items-center gap-15px mb-15px']")
    public WebElement successNewUserRegister;

    @FindBy(xpath = "(//div[@class='ky-checkbox-input'])[1]")  // XPath index belirtilmiş hali
    public WebElement kvkAccept;

    @FindBy(xpath = "//button[@role='button']")
    public WebElement newUserButton;

    @FindBy(xpath = "//span[@class='ky-error-input']")
    public WebElement passwordErrorMessage;

    @FindBy(xpath = "//span[@class='ky-error-input']")
    public WebElement mailTextErrorMessage;

    @FindBy(xpath = "//div[@class='ky-error']")
    public WebElement setSameMailTextErrorMessage;

    @FindBy(xpath = "//div[@class='ky-error']")
    public WebElement kvkErrorMessage;

    @FindBy(xpath = "//span[@class='ky-error-input']")
    public WebElement setDiffrentPassword;

    @FindBy(xpath = "//span[@class='ky-error-input']")
    public WebElement invalidMail;


    public void setUserName(String userName) {
        textInput(userName,nameTextBox);
    }

    public void setLastName(String lastName) {
        textInput(lastName,lastNameTextBox);
    }

    public void setEmail(String email) {
        textInput(email,emailTextBox);
    }

    public void setPassword(String password) {
        textInput(password,passwordTextBox);
    }


    String email = generateRandomEmail();
    public void fakerTextMail(){
        emailTextBox.sendKeys(email);
    }

    public void setConfirmPassword(String confirmPassword) {
        textInput(confirmPassword,confirmPasswordTextBox);
    }

    public void successNewUserIsDisplayed() {
        Assert.assertTrue(successNewUserRegister.isDisplayed());

    }
    public void inValidIsDisplayed() {
        Assert.assertTrue(invalidMail.isDisplayed());
    }

    public void kvkAcceptClick(){
        clickToWebElement(kvkAccept);
    }

    public void clickNewUser(){
        clickToWebElement(newUserButton);
    }

    public void passwordErrorMessageIsDisplayed(){
        Assert.assertTrue(passwordErrorMessage.isDisplayed());

    }
    public void mailErrorMessageIsDisplayed(){
        Assert.assertTrue(mailTextErrorMessage.isDisplayed());
    }
    public void sameMailTextErrorMessageIsDisplayed(){
        Assert.assertTrue(setSameMailTextErrorMessage.isDisplayed());
    }
    public void kvkErrorMessageIsDisplayed(){
        Assert.assertTrue(kvkErrorMessage.isDisplayed());
    }
    public void differentPasswordErrorMessageIsDisplayed(){
        Assert.assertTrue(setDiffrentPassword.isDisplayed());
    }






}
