package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BookDetailPage;
import pages.BooksPage;
import pages.CartPage;
import pages.HomePage;
import utilities.Driver;

import static utilities.ReusableMethods.delay;

public class CartAddSteps {
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();
    BookDetailPage bookDetailPage = new BookDetailPage();
    CartPage cartPage = new CartPage();

    @And("Sepete ekle butonuna tıklanır")
    public void sepeteEkleButonunaTıklanır() {
        booksPage.clickCartAddButton();
        delay(2);
    }

    @And("Kullanıcı arama kutusuna Paravatan yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaParavatanYazarEnterTusunaBasar() {
        homePage.setSearch_Input("Paravatan");
    }

    @And("Sepete eklendiği doğrulanır")
    public void sepeteEklendigiDogrulanır() {
        booksPage.popUpIsDisplayed();
    }

    @And("Kullanıcı arama kutusuna The Lord of the  Rings - The Two Towers yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaTheLordOfTheRingsTheTwoTowersYazarEnterTusunaBasar() {
        homePage.setSearch_Input("The Lord of the  Rings - The Two Towers");
    }

    @And("Listelenen kitaplar arasından stokta olmayan tıklanır")
    public void listelenenKitaplarArasındanStoktaOlmayanTıklanır() {
        booksPage.bookClick();
    }

    @Then("Stokda olmadığı doğrulanır")
    public void stokdaOlmadıgıDogrulanır() {
        bookDetailPage.stockTextIsDisplayed();
    }

    @And("Sefiller kitabına tıklanır")
    public void sefillerKitabınaTıklanır() {
        booksPage.bookClick();
    }

    @And("İki kez sepete ekle butonuna tıklanır")
    public void ıkiKezSepeteEkleButonunaTıklanır() {
        bookDetailPage.addCart(2);
        delay(3);
    }

    @And("Sepete doğru eklendiği doğrulanır")
    public void sepeteDogruEklendigiDogrulanır() {
        bookDetailPage.popUpCheck();
    }

    @And("Ürün sepete eklenir")
    public void urunSepeteEklenir() {
        bookDetailPage.addCart(1);
    }

    @And("Sepete butonuna tıklanarak sepete gidilir")
    public void sepeteButonunaTıklanarakSepeteGidilir() {
        bookDetailPage.goToCartPlace();
        delay(1);
    }

    @And("Kitap miktarı arttırılır")
    public void kitapMiktarıArttırılır() {
        cartPage.valueAdd();
    }

    @And("Miktar artışı doğrulanır")
    public void miktarArtısıDogrulanır() {
        cartPage.addPopUpIsDisplayed();
    }

    @And("Listelenen kitaplardan bir tanesi sepete eklenir")
    public void listelenenKitaplardanBirTanesiSepeteEklenir() {
        booksPage.cartAddButton();
        delay(3);
    }



    @And("Sepetteki ürün miktarı doğrulanır")
    public void sepettekiUrunMiktarıDogrulanır() {
        booksPage.getCartText();
    }

    @And("Sepet içerisindekiler boşaltılır")
    public void sepetIcerisindekilerBosaltılır() {
        cartPage.cleanCart();
    }

    @And("Sepetin boş olduğu doğrulanır")
    public void sepetinBosOlduguDogrulanır() {
        cartPage.cartClearIsDisplayed();
    }

    @And("Sepet boş bıraklır")
    public void sepetBosBıraklır() {
    }

    @And("Sepete gidilir")
    public void sepeteGidilir() {
        bookDetailPage.goToCartEmpty();
        delay(1);
    }

    @And("Sepetin boş olduğu kontrol edilir ve doğrulanır")
    public void sepetinBosOlduguKontrolEdilirVeDogrulanır() {
        bookDetailPage.cartEmptyIsDisplayed();
    }

    @And("Ürün miktarı azaltılır")
    public void urunMiktarıAzaltılır() {
        cartPage.valueSubtract();
    }

    @And("Ürün miktarı azaltıldığı doğrulanır")
    public void urunMiktarıAzaltıldıgıDogrulanır() {
        cartPage.addPopUpIsDisplayed();
    }






}
