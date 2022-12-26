package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Pages;
import utilities.Driver;

import java.util.List;

public class DashBoardModuleStepDef {

    Pages pages = new Pages();
    @When("Kullanici gecersiz username ve password girer")
    public void kullaniciGecersizUsernameVePasswordGirer() {
        pages.loginModulePage().userNameTextBox.sendKeys("Tinne");
        pages.loginModulePage().passwordTextBox.sendKeys("asdwq");
        pages.loginModulePage().loginButton.click();

    }

    @Then("Kullanici login sayfasini goruntulemelidir")
    public void kullaniciLoginSayfasiniGoruntulemelidir() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("login"));
    }

    @And("Kullanici No registered event has been found!! mesajini gormeli")
    public void kullaniciNoRegisteredEventHasBeenFoundMesajiniGormeli() throws InterruptedException {
        Assert.assertTrue(pages.dashBoardModulePage().noRegisteredEventMessage.isDisplayed());
        Thread.sleep(4000);
    }

    @Given("Kullanici eventi siler")
    public void kullaniciEventiSiler() {
        pages.dashBoardModulePage().deleteEventButton.click();
    }

    @Then("Kullanici eventi sildigini gorebilmeli")
    public void kullaniciEventiSildiginiGorebilmeli() {
        List<WebElement> eventsList = Driver.getDriver().findElements(By.xpath("//tr"));
        Assert.assertTrue(eventsList.isEmpty());
    }

    @And("Kullanici Participants butonuna basar")
    public void kullaniciParticipantsButonunaBasar() {
        pages.dashBoardModulePage().participantsButton.click();
    }

    @And("Kullanici Participants bilgilerini gorur")
    public void kullaniciParticipantsBilgileriniGorur() {
        Assert.assertTrue(pages.dashBoardModulePage().participantsTables.isDisplayed());
    }

    @And("Kullanici Event name, Event date, Participant name, lastname, contact text boxlari doldurur")
    public void kullaniciEventNameEventDateParticipantNameLastnameContactTextBoxlariDoldurur() throws InterruptedException {
        pages.eventModulePage().createEventFormPageEventNameTextBox.sendKeys("Birusk");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']")).click();
        Thread.sleep(2000);
        pages.dashBoardModulePage().createEventFormPageParticipantNameTextBox.sendKeys("Bahoz");
        Thread.sleep(2000);
        pages.dashBoardModulePage().createEventFormPageParticipantLastNameTextBox.sendKeys("Bahoz");
        Thread.sleep(2000);
        pages.dashBoardModulePage().createEventFormPageParticipantContactTextBox.sendKeys("Bahoz@b.com");
    }
}
