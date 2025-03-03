Feature: Kitapyurdu Login
  Scenario: Login_001 - Geçerli E-posta ve Şifre ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular

  Scenario: Login_002 - Beni hatırla Seçeneği ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Beni hatırla seçeneği seçilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular


  Scenario: Login_003 - Sadece E-posta Hesabı ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir


  Scenario: Login_004 - Geçerli E-posta ve Yanlış Şifre ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre alanına yanlış bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir

  Scenario: Login_005 - Geçerli Şifre ve Yanlış E-posta ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına yanlış bir e-posta girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir

  Scenario: Login_006 - Boş Kullanıcı Alanı ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanı boş bırakılır
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir

  Scenario: Login_007 - E-posta Önde ve Arkada Boşluk ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta text önüne ve arkasına boşluk bırakılır
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    And Kullanıcı hesaba başaralı bir şekilde girdiğini doğrular


  Scenario: Login_008 - E-posta Adresine Özel Karakterler Yazarak Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına özel karakterler girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir

  Scenario: Login_009 - Şifre Önde ve Arkada Boşluk ile Login
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına geçerli bir e-posta girilir
    And Şifre önüne ve arkasına boşluk koyularak girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir

  Scenario: Login_010 - E-posta alanına fazla karakter girilmesi
    Given Kullanıcı ana sayfaya gider
    When Ana sayfa yüklendiği doğrulanır
    And Kullanıcı Ana Sayfada Giriş Yap Butonunu Bulur ve Tıklar
    And Giriş sayfasına girdiği doğrulanır
    And E-posta alanına fazla karakter girilir
    And Şifre alanına geçerli bir şifre girilir
    And Kullanıcı Giriş Yap butonuna tıklar
    Then Uyarı mesajı kontrol edilir


























