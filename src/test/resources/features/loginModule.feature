@E2E
Feature: 1.	Login Module
  @dnm1
  Scenario: TC01 Kimligi dgrulanmamissa, kullanici oturum acma formunu gormelidir.
  Giris Formu, kullanici adi sifre ve giris butonunu icermelidir.
    Given Kullanici urlye gider
    Then  Kullanici Event Manager Login basligi altinda login formunu gormeli
    And   Kullanici userName text boxini gormeli
    And   Kullanici password text boxini gormeli
    And   Kullanici login butonunu gormeli


  Scenario: TC02 Kullanici giriş formunu doldurmadan login button’a basarsa onay hatasi almali
    Given Kullanici username ve passwordu doldurmadan login butonuna tiklar
    Then Kullanici username text box altinda Username field is required mesjini gormeli
    And  Kullanici password text box altinda Password  field is required mesjini gormeli
  @dnm1
  Scenario: TC03 Authenticate basarili ise kullanici kontrol paneline gittiginde hosgeldin mesajini gorur
    Given Kullanici gecerli username girer
    And   Kullanici gecerli password girer
    When  Kullanici login butonuna basar
    Then  Kullanici kontrol panelinde hosgeldin mesajini gorur
    And   Kullanici sayfayi kapatir

