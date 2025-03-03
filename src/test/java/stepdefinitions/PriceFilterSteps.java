package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BooksPage;
import pages.HomePage;

public class PriceFilterSteps {
    HomePage homePage = new HomePage();
    BooksPage booksPage =new BooksPage();
    @And("Minimum değer girilir")
    public void minimumDegerGirilir() {
        booksPage.setMinTextBox("50");
    }

    @And("Maximum değer girilir")
    public void maximumDegerGirilir() {
        booksPage.setMaxTextBox("250");
    }

    @And("Güncelle butonuna tıklanır")
    public void guncelleButonunaTıklanır() {
        booksPage.clickUpdateButton();
    }

    @And("Kitaplar Ucuzdan Pahalıya sıralanır")
    public void kitaplarUcuzdanPahalıyaSıralanır() {
        booksPage.listingDropDownFromCheapToExpensive();
    }

    @And("Listelenen kitapların belirlenen aralıkta olduğu doğrulanır")
    public void listelenenKitaplarınBelirlenenAralıktaOlduguDogrulanır() {
        booksPage.getfirstBookPriceMin(50.0,250.0);
    }

    @And("Kitaplar Pahalıdan Ucuza sıralanır")
    public void kitaplarPahalıdanUcuzaSıralanır() {
        booksPage.listingDropDownFromExpensiveToCheap();
    }

    @And("İlk listelenen ilk kitap isminin değişmediği doğrulanır")
    public void ılkListelenenIlkKitapIsmininDegismedigiDogrulanır() {
        booksPage.checkFirstBookName();
    }

    @And("Beş yıldız rating seçeneği tıklanır")
    public void yıldızRatingSecenegiTıklanır() {
        booksPage.clickRatingElement();
    }

    @And("Tıklanma sonrası rating butonunun kaybolduğu doğrulanır")
    public void tıklanmaSonrasıRatingButonununKaybolduguDogrulanır() {
        booksPage.ratingElementIsDisplayed();
    }

    @And("Kullanıcı arama kutusuna george orwell yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaGeorgeOrwellYazarEnterTusunaBasar() {
        homePage.setSearch_Input("george orwell");
    }

    @And("Min değer girilir")
    public void minDegerGirilir() {
        booksPage.setMinTextBox("1");
    }

    @Then("Kitap bulunamadı hata mesajı doğrulanır")
    public void kitapBulunamadıHataMesajıDogrulanır() {
        booksPage.bookNotFoundMessageIsDisplayed();
    }

    @And("Max değere büyük bir değer girilir")
    public void maxDegereBuyukBirDegerGirilir() {
        booksPage.setMaxTextBox("2000");
    }

    @And("Max değer girilir")
    public void maxDegerGirilir() {
        booksPage.setMaxTextBox("3");
    }

    @And("Listelenen kitapların sıfır ve iki bin aralıkta olduğu doğrulanır")
    public void listelenenKitaplarınSıfırVeIkiBinAralıktaOlduguDogrulanır() {
        booksPage.verifyAllBooksPriceExceptFirstThree(0.0,2000.0);
    }
}
