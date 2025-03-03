Feature: Kitapyurdu BookSearch
  Scenario: BookSearch_001 - Geçerli Kitap ile Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır


  Scenario: BookSearch_002 - Kitap Adı Tam Girilmeden Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sef yazar Enter tuşuna basar
    Then Listenen kitapların başlığında Sef ve Şef olduğu doğrulanır

  Scenario: BookSearch_003 - Geçersiz veya Alakasız Bir Arama Terimi ile Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna asldlkşsa yazar Enter tuşuna basar
    Then Listeleme Ekranı Uyarı mesajı kontrol edilir


  Scenario: BookSearch_004 - Yazar İsmi ile Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Orhan Pamuk yazar Enter tuşuna basar
    Then Listelenen kitapların yazar ve kitap isimleri Orhan Pamuk içeriyormu doğrulanır


  Scenario: BookSearch_005 - Kategori ile Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Roman yazar Enter tuşuna basar
    Then Listelenen kitap isimleri Roman içeriyormu doğrulanır


  Scenario: BookSearch_006 - Yayınevi ile Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna ithaki yayınları yazar Enter tuşuna basar
    Then Listelenen kitap yayın evleri ithaki yayınları içeriyormu doğrulanır


  Scenario: BookSearch_007 - Farklı Dillerde Kitap Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna The lord of the ring yazar Enter tuşuna basar
    Then Listelenen ilk kitap The lord of the ring içeriyormu doğrulanır

  Scenario: BookSearch_008 - Arama Çubuğu Boşken Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusunu boş bırakır ve Enter tuşuna basar
    Then Arama yapılmadığı doğrulanır

  Scenario: BookSearch_009 - Özel Karakterler ile Arama Yapma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna ☐☐☐☐ yazar Enter tuşuna basar
    Then Listeleme Ekranı Uyarı mesajı kontrol edilir

  Scenario: CartAdd_001 - Geçerli Ürünü Sepete Ekleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Sepete ekle butonuna tıklanır
    And Sepete eklendiği doğrulanır







