@E2E
Feature: 3. Dashboard Module
@dnm2
  Scenario: TC01 Kimligi dogrulanmissa kullanici kontrol panelini görüntülemelidir
    Given Kullanici urlye gider
    When Kullanici gecerli username girer
    And  Kullanici gecerli password girer
    And  Kullanici login butonuna basar
    And Kullanici sayfayi kapatir

 Scenario: TC02 Kimligi dogrulanmamissa kullanici login sayfasına yönlenmeli
   Given Kullanici urlye gider
   When Kullanici gecersiz username ve password girer
   And  Kullanici login butonuna basar
   Then Kullanici login sayfasini goruntulemelidir
   And  Kullanici sayfayi kapatir

 Scenario: TC03 Event baska sekilde olusturulmussa, kullanici olaylarin listesini gormelidir.
 kullanici, kayitli bir event bulunmadigini bildiren bildirim mesajini görüntülemelidir
   Given Kullanici urlye gider
   When Kullanici gecerli username girer
   And  Kullanici gecerli password girer
   And  Kullanici login butonuna basar
   Then Kullanici dashboard sayfasina yonlenmeli
   And  Kullanici No registered event has been found!! mesajini gormeli
   And  Kullanici 3 saniye bekler

 Scenario: TC04 Kullanici edit event butonuna tikladiginda edit evente gidebilmeli
   Given Kullanici Create Event butonuna basar
   And   Kullanici 2 saniye bekler
   And   Kullanici Event name, Event date, Participant name, lastname ve contact text boxlari doldurur
   And   Kullanici 2 saniye bekler
   And   Kullanici create event sayfasinda create event butonuna basar
   And   Kullanici 2 saniye bekler
   And   Kullanici edit event butonuna tiklar
   And   Kullanici 2 saniye bekler
   And   Kullanici Update Event butonuna tiklar
   And   Kullanici 2 saniye bekler

 Scenario: TC05 Kullanici delete butonuna bastiginda eventi silebilmeli
   Given Kullanici eventi siler
   Then Kullanici eventi sildigini gorebilmeli
   And   Kullanici 2 saniye bekler

 Scenario: TC06 Kullanici event participant ( etkinlik katilimcilari ) goruntuleyebilmeelidir
   Given Kullanici Create Event butonuna basar
   And   Kullanici 2 saniye bekler
   And   Kullanici Event name, Event date, Participant name, lastname, contact text boxlari doldurur
   And   Kullanici 2 saniye bekler
   And   Kullanici create event sayfasinda create event butonuna basar
   And   Kullanici 2 saniye bekler
   And   Kullanici Participants butonuna basar
   And   Kullanici 2 saniye bekler
   And   Kullanici Participants bilgilerini gorur
   And   Kullanici sayfayi kapatir
