Feature: Kitapyurdu UserProfileManagement
  Scenario:UserManagement_001 - Profil Bilgilerini Ad Soyad Güncelleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular
    And Hesap Ayarları butonuna tıklanır
    And Üyelik Bilgilerim butonuna tıklanır
    And Yeni Ad bilgisi girilir
    And Yeni Soyad bilgisi girilir
    And Kaydet butonuna tıklanır
    And Mesaj ekranı doğrulanır

  Scenario:UserManagement_002 - Uygunsuz Şifre ile Güncelleme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular
    And Hesap Ayarları butonuna tıklanır
    And Şifre Değiştir butonuna tıklanır
    And Mevcut şifre girilir
    And Yeni Şifre girilir
    And Şifre Tekrarı girilir
    And Şifre Güncelle butonuna tıklanır
    And Alert Window doğrulanır


  Scenario:UserManagement_003 - Yeni Şifre Tekrarını Yanlış Yazma
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular
    And Hesap Ayarları butonuna tıklanır
    And Şifre Değiştir butonuna tıklanır
    And Mevcut şifre girilir
    And Yeni Şifre girilir
    And Şifre tekrarı yanlış girilir
    And Şifre Güncelle butonuna tıklanır
    And Şifre tekrarı eşit olmalıdır uyarı mesajı doğrulanır

  Scenario:UserManagement_004 - Adres Bilgilerini Silme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular
    And Hesap Ayarları butonuna tıklanır
    And Adreslerim butonuna tıklanır
    And Adresi Sil butonuna tıklanır
    And Adres silme için Evet butonuna tıklanır
    And Silindiği doğrulanır


  Scenario:UserManagement_005 - Adres Bilgilerini Silme
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular
    And Hesap Ayarları butonuna tıklanır
    And Üyelik Bilgilerim butonuna tıklanır
    And Telefon no kısmına scroll yap
    And Telefon no ekle butonuna tıklanır
    And Ülke numarası butonuna tıklanır
    And Ülke no seçilir
    And Telefon numarası girilir
    And Ekle butonuna tıklanır
    And Onaylandığı doğrulanır






