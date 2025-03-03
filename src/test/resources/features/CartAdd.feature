Feature: Kitapyurdu CardAdd
  Scenario: CartAdd_001 - Geçerli Ürünü Sepete Ekleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Sepete ekle butonuna tıklanır
    And Sepete eklendiği doğrulanır

  Scenario: CartAdd_002 - Stokta Olmayan Ürünü Sepete Ekleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna The Lord of the  Rings - The Two Towers yazar Enter tuşuna basar
    And Listelenen kitaplar arasından stokta olmayan tıklanır
    Then Stokda olmadığı doğrulanır

  Scenario: CartAdd_003 - Sepete Aynı Ürünü Tekrar Ekleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Sefiller kitabına tıklanır
    And İki kez sepete ekle butonuna tıklanır
    And Sepete doğru eklendiği doğrulanır

  Scenario: CartAdd_004 - Sepette kitap miktarını arttırma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Sefiller kitabına tıklanır
    And Ürün sepete eklenir
    And Sepete butonuna tıklanarak sepete gidilir
    And Kitap miktarı arttırılır
    And Miktar artışı doğrulanır


  Scenario: CartAdd_005 - Sepetten kitap silme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Listelenen kitaplardan bir tanesi sepete eklenir
    And Sepete butonuna tıklanarak sepete gidilir
    And Sepet içerisindekiler boşaltılır
    And Sepetin boş olduğu doğrulanır

  Scenario: CartAdd_006 - Boş sepetle siparişi tamamlama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Sepet boş bıraklır
    And Sepete gidilir
    And Sepetin boş olduğu kontrol edilir ve doğrulanır

  Scenario: CartAdd_007 - Sepette kitap miktarını azaltma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Sefiller kitabına tıklanır
    And İki kez sepete ekle butonuna tıklanır
    And Sepete butonuna tıklanarak sepete gidilir
    And Ürün miktarı azaltılır
    And Ürün miktarı azaltıldığı doğrulanır























