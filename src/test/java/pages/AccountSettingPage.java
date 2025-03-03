package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class AccountSettingPage {
    public AccountSettingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@class=\"d-flex justify-content-between border-bottom border-primary lh-1 p-3 text-decoration-none\"])[1]")
    public WebElement membershipInformation;

    @FindBy(xpath = "(//a[@class=\"d-flex justify-content-between border-bottom border-primary lh-1 p-3 text-decoration-none\"])[2]")
    public WebElement changePassword;

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@id=\"flash-message-alert\"]")
    public WebElement alertMessage;

    @FindBy(xpath = "(//a[@class=\"account-menu__link\"])[5]")
    public WebElement scrollSave;

    @FindBy(xpath = "(//a[@class=\"account-menu__link\"])[3]")
    public WebElement scroll;

    @FindBy(xpath = "//input[@name=\"current_password\"]")
    public WebElement currentPassword;

    @FindBy(xpath = "//input[@name=\"new_password\"]")
    public WebElement newPassword;

    @FindBy(xpath = "//input[@name=\"new_password_confirm\"]")
    public WebElement newPasswordConfirm;

    @FindBy(xpath = "//a[@id=\"js-update-password-button\"]")
    public WebElement updateButton;

    @FindBy(xpath = "//div[@aria-labelledby=\"swal2-title\"]")
    public WebElement alertWindow;

    @FindBy(xpath = "(//a[@class=\"account-menu__link\"])[1]")
    public WebElement scrollUpdate;

    @FindBy(xpath = "//div[@data-is-valid=\"invalid\"]")
    public WebElement notEqualAlert;

    @FindBy(xpath = "(//a[@class=\"account-menu__link\"])[3]")
    public WebElement myAddresses;

    @FindBy(xpath = "//button[@class=\"js-delete-address btn btn-outline-gray-200 d-inline-block fs-14 fw-bold border-0 p-0 text-red-dark\"]")
    public WebElement deleteAddresses;

    @FindBy(xpath = "//button[text()='Evet']")
    public WebElement deleteAddressesAccept;

    @FindBy(xpath = "//h2[@class=\"swal2-title pe-10px ms-5 mt-14px ps-5px fw-normal\"]")
    public WebElement deleteIsDisplayed;

    @FindBy(xpath = "//a[@id=\"phoneUpdateButton\"]")
    public WebElement phoneUpdateButton;

    @FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
    public WebElement phoneCountry;

    @FindBy(xpath = "//*[@id=\"iti-1__item-tr-preferred\"]/span[1]")
    public WebElement choseCountry;

    @FindBy(xpath = "//input[@id=\"phone_number\"]")
    public WebElement phoneNumberInputText;

    @FindBy(xpath = "//button[@id=\"submit-update-phone-number-button\"]")
    public WebElement submitPhoneNumber;

    @FindBy(xpath = "//div[@class=\"modal-body ky-modal-body\"]")
    public WebElement phoneNumberConfirmIsDisplayed;

    public void clickToMembershipInformationButton(){
        clickToWebElement(membershipInformation);
    }
    public void changeFirstName(){
        textInput("Serkan",firstNameTextBox);
    }
    public void changeLastName(){
        textInput("Gür",lastNameTextBox);
    }
    public void clickSaveButton(){
        clickToWebElement(saveButton);
    }

    public void alertMessageIsDisplayed(){
        Assert.assertTrue(alertMessage.isDisplayed());
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickChangePasswordButton(){
        clickToWebElement(changePassword);
    }
    public void inputCurrentPassword(){
        textInput("Serkan_23",currentPassword);
    }
    public void inputNewPassword(){
        textInput("123456789",newPassword);
    }
    public void inputnewPasswordConfirm(){
        textInput("123456789",newPasswordConfirm);
    }
    public void clickUpdateButton(){
        clickToWebElement(updateButton);
    }

    public void alertWindowIsDisplayed(){
        Assert.assertTrue(alertWindow.isDisplayed());
    }

    public void PasswordText(String password){
        textInput(password,newPassword);
    }

    public void confirmPasswordText(String password){
        textInput(password,newPasswordConfirm);
    }

    public void notEqualAlert(){
        Assert.assertTrue(notEqualAlert.isDisplayed());
    }

    public void myAddressesButtonClick(){
        clickToWebElement(myAddresses);
    }
    public void deleteAddressesButtonClick(){
        hoverClick(deleteAddresses);
    }

    public void acceptDeleteAddressesButtonClick(){
        clickToWebElement(deleteAddressesAccept);
    }

    public void deleteIsDisplayed(){
        Assert.assertTrue(deleteIsDisplayed.isDisplayed());
    }

    public void phoneUpdateButtonClick(){
        clickToWebElement(phoneUpdateButton);
    }

    public void phoneCountryButtonClick(){
        clickToWebElement(phoneCountry);
    }
    public void choiseCountry(){
        clickToWebElement(choseCountry);
    }

    public void phoneNumberInputText(String phoneNumber){
        textInput(phoneNumber,phoneNumberInputText);
    }

    public void submitPhoneNumberClick(){
        clickToWebElement(submitPhoneNumber);
    }

    public void phoneNumberConfirmIsDisplayed(){
        Assert.assertTrue(phoneNumberConfirmIsDisplayed.isDisplayed());
    }

}
