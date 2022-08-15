Feature:

  Background:
    Given Kullanici  "medunnaUrl" anasayfaya gider
    When giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar

  @login1
  Scenario Outline:TC01 Giriş yapmak geçerli bir kullanıcı adı ve şifre girmek
    And username olarak "<username>" girer
    And password olarak "<password>" girer
    And SignIn butonuna tiklar
    Then kullanici uygulamaya "<username>" olarak giris yapar
    And uygulamayi kapatir
    Examples:
      | username  | password       |
      | hastaAdil | Alperenadil72. |



  @login2
  Scenario:TC02 Kullanıcının beni hatirla,sifremi unuttum,yeni kayit olustur seçeneği olmalıdır
    Then  beni hatirla secenegini gorur
    And   Did you forget your password secenegini gorur
    And  Register a new Account secenegini gorur
    And  Cancel buttonunu gorur
    And uygulamayi kapatir


    @loginNegatif1
    Scenario: TC03 negatif
      When username olarak " " girer
      And password olarak "Alperenadil72." girer
      And SignIn butonuna tiklar
      Then "Failed to sign in! Please check your credentials and try again." mesajini gorur


  @loginNegatif2
  Scenario: TC03 negatif
    When username olarak " " girer
    And password olarak " " girer
    And SignIn butonuna tiklar
    Then "Failed to sign in! Please check your credentials and try again." mesajini gorur










