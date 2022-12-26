package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EventModulePage;
import pages.Pages;
import utilities.Driver;

public class EventModuleStepDef {

    EventModulePage eventModulePage = new EventModulePage();

    @Given("Kullanici Create Event butonuna basar")
    public void kullaniciCreateEventButonunaBasar() throws InterruptedException {
        Thread.sleep(3000);
        eventModulePage.createEventButton.click();

    }

    @Then("Kullanici Create event formunu gormelidir")
    public void kullaniciCreateEventFormunuGormelidir() {
        Assert.assertTrue(eventModulePage.createEventFormPageHeader.isDisplayed());
    }

    @Given("Kullanici Create event page inde create event butıonuna basar")
    public void kullaniciCreateEventPageIndeCreateEventButıonunaBasar() {
        eventModulePage.createEventFormPageCreateEventButton.click();
    }

    @Then("Kullanici Event name field is required mesajini gormeli")
    public void kullaniciEventNameFieldIsRequiredMesajiniGormeli() {
        Assert.assertTrue(eventModulePage.createEventFormPageEventNameFieldRequiredMessage.isDisplayed());
    }

    @And("Kullanici Please choose a valid date mesajini gormeli")
    public void kullaniciPleaseChooseAValidDateMesajiniGormeli() {
        Assert.assertTrue(eventModulePage.createEventFormPageChooseValidDateMessage.isDisplayed());
    }

    @And("Kullanici Participant name is required mesajini gormeli")
    public void kullaniciParticipantNameIsRequiredMesajiniGormeli() {
        Assert.assertTrue(eventModulePage.createEventFormPageParticipantNameRequiredMessage.isDisplayed());
    }

    @And("Kullanici Participant last name is required mesajini gormeli")
    public void kullaniciParticipantLastNameIsRequiredMesajiniGormeli() {
        Assert.assertTrue(eventModulePage.createEventFormPageParticipantLastnameRequiredMessage.isDisplayed());
    }

    @And("Kullanici Please enter email or phone number mesajini gormeli")
    public void kullaniciPleaseEnterEmailOrPhoneNumberMesajiniGormeli() {
        Assert.assertTrue(eventModulePage.createEventFormPageEnterEmailOrPhoneNumberMessage.isDisplayed());
    }

    @Given("Kullanici add participant butonuna basar")
    public void kullaniciAddParticipantButonunaBasar() {
        eventModulePage.createEventFormPageAddParticipantButton.click();
    }

    @Then("Kullanici participant ekleme formunu gormelidir")
    public void kullaniciParticipantEklemeFormunuGormelidir() {
        Assert.assertTrue(eventModulePage.createEventFormPageAddNewParticipantRow.isDisplayed());
    }

    @Given("Kullanici tum participantlari siler")
    public void kullaniciTumParticipantlariSiler() throws InterruptedException {
        eventModulePage.createEventFormPageFirrstParticipantDeleteButton.click();
        Thread.sleep(2000);
        eventModulePage.createEventFormPageFirrstParticipantDeleteButton.click();
    }

    @Then("Kullanici Please add participant! meajini almali")
    public void kullaniciPleaseAddParticipantMeajiniAlmali() {
        Assert.assertTrue(eventModulePage.createEventFormPageAddParticipantMessage.isDisplayed());
    }

    @Given("Kullanici Event name, Event date, Participant name, lastname ve contact text boxlari doldurur")
    public void kullaniciEventNameEventDateParticipantNameLastnameVeContactTextBoxlariDoldurur() throws InterruptedException {
        eventModulePage.createEventFormPageEventNameTextBox.sendKeys("Birusk");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']")).click();
        Thread.sleep(2000);
        eventModulePage.createEventFormPageParticipantNameTextBox.sendKeys("Bahoz");
        Thread.sleep(2000);
        eventModulePage.createEventFormPageParticipantLastNameTextBox.sendKeys("Bahoz");
        Thread.sleep(2000);
        eventModulePage.createEventFormPageParticipantContactTextBox.sendKeys("Bahoz@b.com");

    }

    @And("Kullanici create event sayfasinda create event butonuna basar")
    public void kullaniciCreateEventSayfasindaCreateEventButonunaBasar() throws InterruptedException {
        eventModulePage.createEventFormPageCreateEventButton.click();
        Thread.sleep(2000);
    }

    @Then("Kullanici Event created successfully mesajini alir")
    public void kullaniciEventCreatedSuccessfullyMesajiniAlir() {
        Assert.assertTrue(eventModulePage.dashboardPageCreatedEventSuccessfullyMessage.isDisplayed());
    }

    @And("Kullanici dashboard sayfasina yonlenmeli")
    public void kullaniciDashboardSayfasinaYonlenmeli() throws InterruptedException {
        Thread.sleep(2000);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("dashboard"));
    }

    @Given("Kullanici edit event butonuna tiklar")
    public void kullaniciEditEventButonunaTiklar() {
        eventModulePage.dashboardPageEditEventButton.click();
    }

    @Then("Kullanici Edit Event sayfasina yonlenmelidir")
    public void kullaniciEditEventSayfasinaYonlenmelidir() {
        Assert.assertTrue(eventModulePage.editEventPageTitle.isDisplayed());
    }

    @And("Kullanici tum alanlaara erisim saglayabilmelidir")
    public void kullaniciTumAlanlaaraErisimSaglayabilmelidir() {
        Assert.assertTrue(eventModulePage.createEventFormPageEventNameTextBox.isEnabled());
        Assert.assertTrue(eventModulePage.editEventPageEventDescriptionTextBox.isEnabled());
        Assert.assertTrue(eventModulePage.editEventPageEventDateTextBox.isEnabled());
        Assert.assertTrue(eventModulePage.editEventPageParticipantFirstNameTextBox.isEnabled());
        Assert.assertTrue(eventModulePage.editEventPageParticipantLastNameTextBox.isEnabled());
        Assert.assertTrue(eventModulePage.editEventPageParticipantContactTextBox.isEnabled());
    }

    @Given("Kullanici Update Event butonuna tiklar")
    public void kullaniciUpdateEventButonunaTiklar() throws InterruptedException {
        eventModulePage.editEventPageUpdateEventButton.click();
        Thread.sleep(2000);
    }

    @Then("Kullanici guncellemenin basarili bir sekilde gerceklestirildigiini gosteren mesaj almali")
    public void kullaniciGuncellemeninBasariliBirSekildeGerceklestirildigiiniGosterenMesajAlmali() {
        Assert.assertTrue(eventModulePage.dashboardPageUpdatedEventSuccessfullyMessage.isEnabled());
    }
}
