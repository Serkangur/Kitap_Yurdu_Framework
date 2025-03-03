Feature: Kitapyurdu NewUserRegistration
  Scenario: NewUser_001 - Geçerli Bilgiler ile Başaralı Yeni Kullanıcı Kaydı
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Ücretsiz üye ol butonuna tıklanır
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And FakerJava ile E-posta textbox'u doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And Başarılı şekilde kayıt yapıldığı doğrulanır

  Scenario: NewUser_002 - Geçersiz E-posta ile Yeni Kullanıcı Kaydı
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And E-posta textbox'u geçersiz mail ile doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And inValid uyarı ekranı doğrulanır

  Scenario: NewUser_003 - Kısa Şifre ile Yeni Kullanıcı Kaydı
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And FakerJava ile E-posta textbox'u doldurulur
    And Şifre textbox'u kısa şifre ile doldurulur
    And Şifre Tekrarı textbox'u kısa şifre ile doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And Şifre hata mesajı doğrulanır

  Scenario: NewUser_004 - Eksik Bilgiler ile Yeni Kullanıcı Kaydı
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And Mail hata mesajı doğrulanır

  Scenario: NewUser_005 - Daha Önceden Kullanılmış E-posta ile Yeni Kullanıcı Kaydı
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And E-posta textbox'u doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And Aynı hesap ile kayıt hata mesajı doğrulanır

  Scenario: NewUser_006 - Gizlilik Politikası ve Kullanım Koşullarını Kabul Etmeden Kayıt Olma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And FakerJava ile E-posta textbox'u doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u doldurulur
    And Üye ol butonuna tıklanır
    And Kvk hata mesajı doğrulanır

  Scenario: NewUser_007 - Şifre Tekrarını Yanlış Yazma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Üye Ol butonuna tıklar
    Then Üye ol sayfasına girdiği doğrulanır
    And Ad textbox'u doldurulur
    And Soyad textbox'u doldurulur
    And FakerJava ile E-posta textbox'u doldurulur
    And Şifre textbox'u doldurulur
    And Şifre Tekrarı textbox'u yanlış şifre ile doldurulur
    And Kvk checkbox tıklanır
    And Üye ol butonuna tıklanır
    And Farklı şifre girildiği hata mesajı doğrulanır






