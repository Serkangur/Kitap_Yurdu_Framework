package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BooksPage;
import pages.HomePage;

import static utilities.ReusableMethods.delay;

public class BookSearchSteps {
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();
    @And("Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaSefillerYazarEnterTusunaBasar() {
        homePage.setSearch_Input("Sefiller");
    }


    @Then("Sefiller listelendiği doğrulanır")
    public void sefillerListelendigiDogrulanır() {
        booksPage.bookListingCheck("sefiller");
        delay(2);
    }

    @And("Kullanıcı arama kutusuna Sef yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaSefYazarEnterTusunaBasar() {
        homePage.setSearch_Input("Sef");
    }

    @Then("Listenen kitapların başlığında Sef ve Şef olduğu doğrulanır")
    public void listenenKitaplarınBaslıgındaSefVeSefOlduguDogrulanır() {
        booksPage.bookListingCheckDouble("Şef","Sef");
    }

    @And("Kullanıcı arama kutusuna asldlkşsa yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaAsldlkssaYazarEnterTusunaBasar() {
        homePage.setSearch_Input("asldlkşsa");
    }

    @Then("Listeleme Ekranı Uyarı mesajı kontrol edilir")
    public void listelemeEkranıUyarıMesajıKontrolEdilir() {
        booksPage.errorTextCheck();
    }

    @And("Kullanıcı arama kutusuna Orhan Pamuk yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaOrhanPamukYazarEnterTusunaBasar() {
        homePage.setSearch_Input("Orhan Pamuk");
    }

    @Then("Listelenen kitapların yazar ve kitap isimleri Orhan Pamuk içeriyormu doğrulanır")
    public void listelenenKitaplarınYazarVeKitapIsimleriOrhanPamukIceriyormuDogrulanır() {
        booksPage.verifyValuesContainDouble("orhan pamuk","Orhan Pamuk yazarlar ve kitaplarda bulunamadı!");

    }

    @And("Kullanıcı arama kutusuna Roman yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaRomanYazarEnterTusunaBasar() {
        homePage.setSearch_Input("Roman");
    }

    @Then("Listelenen kitap isimleri Roman içeriyormu doğrulanır")
    public void listelenenKitapIsimleriRomanIceriyormuDogrulanır() {
        booksPage.verifyValuesContain(booksPage.allBooksNameValue,"roman","Roman anahtar kelimesi kitaplarda bulunamadı!");
    }

    @And("Kullanıcı arama kutusuna ithaki yayınları yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaIthakiYayınlarıYazarEnterTusunaBasar() {
        homePage.setSearch_Input("ithaki yayınları");
    }

    @Then("Listelenen kitap yayın evleri ithaki yayınları içeriyormu doğrulanır")
    public void listelenenKitapYayınEvleriIthakiYayınlarıIceriyormuDogrulanır() {
        booksPage.verifyValuesContain(booksPage.PublisingHouse,"ithaki yayınları","İthaki Yayınları bulunamadı!");
    }

    @And("Kullanıcı arama kutusuna The lord of the ring yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaTheLordOfTheRingYazarEnterTusunaBasar() {
        homePage.setSearch_Input("The lord of the ring");
    }

    @Then("Listelenen ilk kitap The lord of the ring içeriyormu doğrulanır")
    public void listelenenIlkKitapTheLordOfTheRingIceriyormuDogrulanır() {
        booksPage.differentLangueageSearchCheck("the lord of the ring");
    }

    @And("Kullanıcı arama kutusunu boş bırakır ve Enter tuşuna basar")
    public void kullanıcıAramaKutusunuBosBırakırVeEnterTusunaBasar() {
        homePage.setSearch_Input("");
    }

    @Then("Arama yapılmadığı doğrulanır")
    public void aramaYapılmadıgıDogrulanır() {
        booksPage.urlCheck("https://www.kitapyurdu.com/");
    }

    @And("Kullanıcı arama kutusuna ☐☐☐☐ yazar Enter tuşuna basar")
    public void kullanıcıAramaKutusunaYazarEnterTusunaBasar() {
        homePage.setSearch_Input("☐☐☐☐");
    }



}
