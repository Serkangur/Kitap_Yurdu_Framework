package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.NewUserPage;
import utilities.Driver;

import static utilities.ReusableMethods.delay;

public class NewUserSteps {
    HomePage homePage = new HomePage();
    NewUserPage newUserPage = new NewUserPage();
    LoginPage loginPage = new LoginPage();

    @And("Kullanıcı Ana Sayfada Üye Ol butonuna tıklar")
    public void kullanıcıAnaSayfadaUyeOlButonunaTıklar() {
        homePage.clickNewUserButton();
    }

    @And("Ücretsiz üye ol butonuna tıklanır")
    public void ucretsizUyeOlButonunaTıklanır() {
        loginPage.newUserButton.click();
    }

    @Then("Üye ol sayfasına girdiği doğrulanır")
    public void uyeOlSayfasınaGirdigiDogrulanır() {
        String actualResult = Driver.getDriver().getCurrentUrl();
        String expectedResult = "https://www.kitapyurdu.com/index.php?route=account/register";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Ad textbox'u doldurulur")
    public void adTextboxUDoldurulur() {
        newUserPage.setUserName("Serkan");
    }

    @And("Soyad textbox'u doldurulur")
    public void soyadTextboxUDoldurulur() {
        newUserPage.setLastName("Gür");
    }

    @And("FakerJava ile E-posta textbox'u doldurulur")
    public void fakerjavaIleEPostaTextboxUDoldurulur() {
        newUserPage.fakerTextMail();
    }

    @And("Şifre textbox'u doldurulur")
    public void sifreTextboxUDoldurulur() {
        newUserPage.setPassword("serkan12345");
    }

    @And("Şifre Tekrarı textbox'u doldurulur")
    public void sifreTekrarıTextboxUDoldurulur() {
        newUserPage.setConfirmPassword("serkan12345");
    }

    @And("Kvk checkbox tıklanır")
    public void kvkCheckboxTıklanır() {
        newUserPage.kvkAcceptClick();
        delay(2);
    }

    @And("Üye ol butonuna tıklanır")
    public void uyeOlButonunaTıklanır() {
        newUserPage.clickNewUser();
    }

    @And("Başarılı şekilde kayıt yapıldığı doğrulanır")
    public void basarılıSekildeKayıtYapıldıgıDogrulanır() {
        newUserPage.successNewUserIsDisplayed();
    }

    @And("E-posta textbox'u doldurulur")
    public void ePostaTextboxUDoldurulur() {
        newUserPage.setEmail("serkangur111@gmail.com");
    }

    @And("inValid uyarı ekranı doğrulanır")
    public void invalidUyarıEkranıDogrulanır() {
        newUserPage.inValidIsDisplayed();
    }

    @And("Şifre hata mesajı doğrulanır")
    public void sifreHataMesajıDogrulanır() {
        newUserPage.passwordErrorMessageIsDisplayed();
    }

    @And("Mail hata mesajı doğrulanır")
    public void mailHataMesajıDogrulanır() {
        newUserPage.mailErrorMessageIsDisplayed();
    }

    @And("Aynı hesap ile kayıt hata mesajı doğrulanır")
    public void aynıHesapIleKayıtHataMesajıDogrulanır() {
        newUserPage.sameMailTextErrorMessageIsDisplayed();
    }

    @And("Kvk hata mesajı doğrulanır")
    public void kvkHataMesajıDogrulanır() {
        newUserPage.kvkErrorMessageIsDisplayed();
    }

    @And("Farklı şifre girildiği hata mesajı doğrulanır")
    public void farklıSifreGirildigiHataMesajıDogrulanır() {
        newUserPage.differentPasswordErrorMessageIsDisplayed();
    }

    @And("E-posta textbox'u geçersiz mail ile doldurulur")
    public void ePostaTextboxUGecersizMailIleDoldurulur() {
        newUserPage.setEmail("randomtext");
    }


    @And("Şifre textbox'u kısa şifre ile doldurulur")
    public void sifreTextboxUKısaSifreIleDoldurulur() {
        newUserPage.setPassword("sasdasd");
    }

    @And("Şifre Tekrarı textbox'u kısa şifre ile doldurulur")
    public void sifreTekrarıTextboxUKısaSifreIleDoldurulur() {
        newUserPage.setConfirmPassword("sasdasd");
    }

    @And("Şifre Tekrarı textbox'u yanlış şifre ile doldurulur")
    public void sifreTekrarıTextboxUYanlısSifreIleDoldurulur() {
        newUserPage.setConfirmPassword("serkan54321");
    }
}
