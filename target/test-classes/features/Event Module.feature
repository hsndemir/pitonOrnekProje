@E2E
Feature: 2. Event Module

  Scenario:TC01 Kullanici Kontrol panelinde Create Event buttona tiklarsa Create event formu goruntulemelidir
    Given Kullanici urlye gider
    Given Kullanici gecerli username girer
    And   Kullanici gecerli password girer
    When  Kullanici login butonuna basar
    Then  Kullanici kontrol panelinde hosgeldin mesajini gorur
    Given Kullanici Create Event butonuna basar
    Then  Kullanici Create event formunu gormelidir
    And   Kullanici 2 saniye bekler

  Scenario:TC02 Kullanici etkinlik formunu doldurmadan, Etkinlik Olustur dugmesini tiklarsa dogrulama hatalarini gormelidir.
    Given Kullanici Create event page inde create event butıonuna basar
    And   Kullanici 2 saniye bekler
    Then  Kullanici Event name field is required mesajini gormeli
    And   Kullanici 2 saniye bekler
    And   Kullanici Please choose a valid date mesajini gormeli
    And   Kullanici 2 saniye bekler
    And   Kullanici Participant name is required mesajini gormeli
    And   Kullanici 2 saniye bekler
    And   Kullanici Participant last name is required mesajini gormeli
    And   Kullanici 2 saniye bekler
    And   Kullanici Please enter email or phone number mesajini gormeli
    And   Kullanici 2 saniye bekler

  Scenario: TC03 Kullanici add participant buttona bastiginda yeni participant eklemelidir
    Given Kullanici add participant butonuna basar
    And   Kullanici 2 saniye bekler
    Then  Kullanici participant ekleme formunu gormelidir
    And   Kullanici 2 saniye bekler

  Scenario: TC04 Kullanici  tum participants’i silerse hata mesaji gormeli
    Given Kullanici tum participantlari siler
    And   Kullanici 2 saniye bekler
    Then Kullanici Please add participant! meajini almali
    And   Kullanici 2 saniye bekler
    And   Kullanici add participant butonuna basar
    And   Kullanici 2 saniye bekler

  Scenario: TC05 Kullanici, gerekli tum alanlari doldurursa yeni event olusturabilmeli ve
  basarili mesaj olustur ile tekrar kontrol paneli sayfasina yonlenir
    Given Kullanici Event name, Event date, Participant name, lastname ve contact text boxlari doldurur
    And   Kullanici 2 saniye bekler
    And   Kullanici create event sayfasinda create event butonuna basar
    And   Kullanici 2 saniye bekler
    Then  Kullanici Event created successfully mesajini alir
    And   Kullanici 2 saniye bekler
    And   Kullanici dashboard sayfasina yonlenmeli
    And   Kullanici 2 saniye bekler

  Scenario: TC06 Kullanici eventi duzenleyebilmelidir. Kullanici edite tikladiginda
  tum olay alanlari duzenlenen olaya gore doldurulmalidir.
    Given Kullanici edit event butonuna tiklar
    And   Kullanici 2 saniye bekler
    Then  Kullanici Edit Event sayfasina yonlenmelidir
    And   Kullanici 2 saniye bekler
    And   Kullanici tum alanlaara erisim saglayabilmelidir
    And   Kullanici 2 saniye bekler

  Scenario: TC07 Kullanici, gerekli alanlar dolduruldugunda eventi guncelleyebilmeli ve
  guncelleme basarili mesaji ile kontrol paneli sayfasina yönlendir
    Given Kullanici Update Event butonuna tiklar
    And   Kullanici 2 saniye bekler
    Then  Kullanici guncellemenin basarili bir sekilde gerceklestirildigiini gosteren mesaj almali
    And   Kullanici 2 saniye bekler
    And   Kullanici dashboard sayfasina yonlenmeli
    And   Kullanici sayfayi kapatir







