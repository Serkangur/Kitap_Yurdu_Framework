package stepdefinitions;

import io.cucumber.java.en.And;
import pages.AccountPage;
import pages.AccountSettingPage;
import utilities.Driver;

import static utilities.ReusableMethods.delay;

public class UserProfileManagementSteps {
    AccountPage accountPage = new AccountPage();
    AccountSettingPage accountSettingPage = new AccountSettingPage();

    @And("Hesap Ayarları butonuna tıklanır")
    public void hesapAyarlarıButonunaTıklanır() {
        accountPage.accountSettingsClick();
    }

    @And("Üyelik Bilgilerim butonuna tıklanır")
    public void uyelikBilgilerimButonunaTıklanır() {
        accountSettingPage.clickToMembershipInformationButton();
    }

    @And("Yeni Ad bilgisi girilir")
    public void yeniAdBilgisiGirilir() {
        accountSettingPage.changeFirstName();
    }

    @And("Yeni Soyad bilgisi girilir")
    public void yeniSoyadBilgisiGirilir() {
        accountSettingPage.changeLastName();
    }

    @And("Kaydet butonuna tıklanır")
    public void kaydetButonunaTıklanır() {
        accountSettingPage.scrollToElement(Driver.getDriver(), accountSettingPage.scrollSave);
        delay(2);
        accountSettingPage.clickSaveButton();
    }

    @And("Mesaj ekranı doğrulanır")
    public void mesajEkranıDogrulanır() {
        accountSettingPage.alertMessageIsDisplayed();
    }

    @And("Şifre Değiştir butonuna tıklanır")
    public void sifreDegistirButonunaTıklanır() {
        accountSettingPage.clickChangePasswordButton();
    }

    @And("Mevcut şifre girilir")
    public void mevcutSifreGirilir() {
        accountSettingPage.inputCurrentPassword();
    }

    @And("Yeni Şifre girilir")
    public void yeniSifreGirilir() {
        accountSettingPage.inputNewPassword();
    }

    @And("Şifre Tekrarı girilir")
    public void sifreTekrarıGirilir() {
        accountSettingPage.inputnewPasswordConfirm();
    }

    @And("Şifre Güncelle butonuna tıklanır")
    public void sifreGuncelleButonunaTıklanır() {
        accountSettingPage.scrollToElement(Driver.getDriver(), accountSettingPage.scrollUpdate);
        delay(2);
        accountSettingPage.clickUpdateButton();
    }

    @And("Alert Window doğrulanır")
    public void alertWindowDogrulanır() {
        accountSettingPage.alertWindowIsDisplayed();
    }

    @And("Şifre tekrarı yanlış girilir")
    public void sifreTekrarıYanlısGirilir() {
        accountSettingPage.confirmPasswordText("12345678");
    }

    @And("Şifre tekrarı eşit olmalıdır uyarı mesajı doğrulanır")
    public void sifreTekrarıEsitOlmalıdırUyarıMesajıDogrulanır() {
        accountSettingPage.notEqualAlert();
    }

    @And("Adreslerim butonuna tıklanır")
    public void adreslerimButonunaTıklanır() {
        accountSettingPage.scrollToElement(Driver.getDriver(), accountSettingPage.scrollUpdate);
        delay(2);
        accountSettingPage.myAddressesButtonClick();
    }

    @And("Adresi Sil butonuna tıklanır")
    public void adresiSilButonunaTıklanır() {
        accountSettingPage.deleteAddressesButtonClick();
    }

    @And("Adres silme için Evet butonuna tıklanır")
    public void adresSilmeIcinEvetButonunaTıklanır() {
        accountSettingPage.acceptDeleteAddressesButtonClick();
    }

    @And("Silindiği doğrulanır")
    public void silindigiDogrulanır() {
        accountSettingPage.deleteIsDisplayed();
    }

    @And("Telefon no kısmına scroll yap")
    public void telefonNoKısmınaScrollYap() {
        accountSettingPage.scrollToElement(Driver.getDriver(), accountSettingPage.scroll);
        delay(2);
    }

    @And("Telefon no ekle butonuna tıklanır")
    public void telefonNoEkleButonunaTıklanır() {
        accountSettingPage.phoneUpdateButtonClick();
        delay(2);
    }

    @And("Ülke numarası butonuna tıklanır")
    public void ulkeNumarasıButonunaTıklanır() {
        accountSettingPage.phoneCountryButtonClick();
        delay(2);
    }

    @And("Ülke no seçilir")
    public void ulkeNoSecilir() {
        accountSettingPage.choiseCountry();
    }

    @And("Telefon numarası girilir")
    public void telefonNumarasıGirilir() {
        accountSettingPage.phoneNumberInputText("5315649517");
    }

    @And("Ekle butonuna tıklanır")
    public void ekleButonunaTıklanır() {
        delay(2);
        accountSettingPage.submitPhoneNumberClick();
    }

    @And("Onaylandığı doğrulanır")
    public void onaylandıgıDogrulanır() {
        delay(2);
        accountSettingPage.phoneNumberConfirmIsDisplayed();
    }


}
