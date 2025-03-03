Feature: Kitapyurdu PriceFilter
  Scenario:PriceFilter_001 - Geçerli Fiyat Aralığı ile Ürün Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Minimum değer girilir
    And Maximum değer girilir
    And Güncelle butonuna tıklanır
    And Kitaplar Ucuzdan Pahalıya sıralanır
    And Listelenen kitapların belirlenen aralıkta olduğu doğrulanır
    And Kitaplar Pahalıdan Ucuza sıralanır
    And Listelenen kitapların belirlenen aralıkta olduğu doğrulanır


  Scenario:PriceFilter_002 - Minimum Fiyat Olmadan Ürün Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Maximum değer girilir
    And Güncelle butonuna tıklanır
    And Kitaplar Pahalıdan Ucuza sıralanır
    And Listelenen kitapların belirlenen aralıkta olduğu doğrulanır

  Scenario:PriceFilter_003 - Maksimum Fiyat Olmadan Ürün Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Minimum değer girilir
    And Güncelle butonuna tıklanır
    And Kitaplar Ucuzdan Pahalıya sıralanır
    And Listelenen kitapların belirlenen aralıkta olduğu doğrulanır

  Scenario:PriceFilter_004 - Boş Fiyat Aralığı ile Ürün Arama
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Güncelle butonuna tıklanır
    And İlk listelenen ilk kitap isminin değişmediği doğrulanır

  Scenario:PriceFilter_005 - Fiyat Aralığı Filtresi ile Diğer Filtrelerin Birlikte Kullanılması
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Minimum değer girilir
    And Maximum değer girilir
    And Güncelle butonuna tıklanır
    And Beş yıldız rating seçeneği tıklanır
    And Tıklanma sonrası rating butonunun kaybolduğu doğrulanır

  Scenario:PriceFilter_006 - Fiyat Aralığı Filtrelemesi Sonrasında Sıralama Seçeneklerinin Kullanılması
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Minimum değer girilir
    And Maximum değer girilir
    And Güncelle butonuna tıklanır
    And Kitaplar Ucuzdan Pahalıya sıralanır
    And Listelenen kitapların belirlenen aralıkta olduğu doğrulanır


  Scenario:PriceFilter_007 - Fiyat Filtresi ile Uygun Ürün Bulunamaması Durumu
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna george orwell yazar Enter tuşuna basar
    And Min değer girilir
    And Max değer girilir
    And Güncelle butonuna tıklanır
    Then Kitap bulunamadı hata mesajı doğrulanır

  Scenario:PriceFilter_008 - Fiyat Aralığı Filtrelemesi Sonrasında Sıralama Seçeneklerinin Kullanılması
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı arama kutusuna Sefiller yazar Enter tuşuna basar
    Then Sefiller listelendiği doğrulanır
    And Max değere büyük bir değer girilir
    And Güncelle butonuna tıklanır
    And Listelenen kitapların sıfır ve iki bin aralıkta olduğu doğrulanır






