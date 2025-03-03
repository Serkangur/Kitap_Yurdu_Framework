package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.delay;

public class LoginSteps {
    HomePage homePage = new HomePage();
    LoginPage loginpage = new LoginPage();
    @Given("Kullanıcı ana sayfaya gider")
    public void kullanıcıAnaSayfayaGider() {
    }

    @When("Ana sayfa yüklendiği doğrulanır")
    public void anaSayfaYuklendigiDogrulanır() {
        String actualResult = Driver.getDriver().getCurrentUrl();
        String expectedResult = ConfigReader.getProperty("urlKitapYurdu");
        Assert.assertEquals(expectedResult, actualResult);
        delay(2);
    }

    @And("Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar")
    public void kullanıcıAnaSayfadaGirisYapButonunuBulurVeTıklar() {
        homePage.clickLoginButton();
        delay(2);
    }

    @And("Giriş sayfasına girdiği doğrulanır")
    public void girisSayfasınaGirdigiDogrulanır() {
        String actualResult= Driver.getDriver().getCurrentUrl();
        String expectedResult = "https://www.kitapyurdu.com/index.php?route=account/login";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("E-posta alanına geçerli bir e-posta girilir")
    public void ePostaAlanınaGecerliBirEPostaGirilir() {
        loginpage.trueloginMailText();
    }

    @And("Şifre alanına geçerli bir şifre girilir")
    public void sifreAlanınaGecerliBirSifreGirilir() {
        loginpage.trueloginPasswordText();
        delay(2);
    }

    @And("Kullanıcı Giriş Yap butonuna tıklar")
    public void kullanıcıGirisYapButonunaTıklar() {
        loginpage.clickSubmitButton();
    }

    @And("Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular")
    public void kullanıcıHesabaBasaralıBirSekildeGirdiginiDogrular() {
        Assert.assertTrue(loginpage.accountIsDisplayed.isDisplayed());
    }

    @And("Beni hatırla seçeneği seçilir")
    public void beniHatırlaSecenegiSecilir() {
        loginpage.clickRememberMeCheckbox();
    }

    @Then("Uyarı mesajı kontrol edilir")
    public void uyarıMesajıKontrolEdilir() {
        loginpage.errorTextCheck();
    }

    @And("Şifre alanına yanlış bir şifre girilir")
    public void sifreAlanınaYanlısBirSifreGirilir() {
        loginpage.loginPasswordText("123456");
    }

    @And("E-posta alanına yanlış bir e-posta girilir")
    public void ePostaAlanınaYanlısBirEPostaGirilir() {
        loginpage.loginMailText("random@gmail.com");
    }

    @And("E-posta alanı boş bırakılır")
    public void ePostaAlanıBosBırakılır() {
        loginpage.loginMailText("");
    }

    @And("E-posta text önüne ve arkasına boşluk bırakılır")
    public void ePostaTextOnuneVeArkasınaBoslukBırakılır() {
        loginpage.loginMailText(" cucumberdeneme@gmail.com ");
    }

    @And("E-posta alanına özel karakterler girilir")
    public void ePostaAlanınaOzelKarakterlerGirilir() {
        loginpage.loginMailText("☐☐☐serkangur111@gmail.com");
    }

    @And("Şifre önüne ve arkasına boşluk koyularak girilir")
    public void sifreOnuneVeArkasınaBoslukKoyularakGirilir() {
        loginpage.loginPasswordText(" serkan_23 ");
    }

    @And("E-posta alanına fazla karakter girilir")
    public void ePostaAlanınaFazlaKarakterGirilir() {
        loginpage.loginMailText("dkfsjfksjfdfsdfsfsfsfsdf@gmail.com");
    }


}
