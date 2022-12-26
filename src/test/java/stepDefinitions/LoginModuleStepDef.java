package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginModulePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class LoginModuleStepDef {

    LoginModulePage page = new LoginModulePage();

    @Given("Kullanici urlye gider")
    public void kullaniciUrlyeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("assessmentPitonUrl"));
        Driver.getDriver().manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(page.loginHeader));
    }

    @Then("Kullanici Event Manager Login basligi altinda login formunu gormeli")
    public void kullaniciEventManagerLoginBasligiAltindaLoginFormunuGormeli() {
        Assert.assertTrue(page.loginHeader.isDisplayed());
    }

    @And("Kullanici userName text boxini gormeli")
    public void kullaniciUserNameTextBoxiniGormeli() {
        Assert.assertTrue(page.userNameTextBox.isDisplayed());
    }

    @And("Kullanici password text boxini gormeli")
    public void kullaniciPasswordTextBoxiniGormeli() {
        Assert.assertTrue(page.passwordTextBox.isDisplayed());
    }

    @And("Kullanici login butonunu gormeli")
    public void kullaniciLoginButonunuGormeli() {
        Assert.assertTrue(page.passwordTextBox.isDisplayed());
    }


    @Given("Kullanici username ve passwordu doldurmadan login butonuna tiklar")
    public void kullaniciUsernameVePassworduDoldurmadanLoginButonunaTiklar() {
        page.loginButton.click();
    }

    @Then("Kullanici username text box altinda Username field is required mesjini gormeli")
    public void kullaniciUsernameTextBoxAltindaUsernameFieldIsRequiredMesjiniGormeli() {
        Assert.assertTrue(page.userNameFielRequiredAlert.isDisplayed());
    }

    @And("Kullanici password text box altinda Password  field is required mesjini gormeli")
    public void kullaniciPasswordTextBoxAltindaPasswordFieldIsRequiredMesjiniGormeli() throws InterruptedException {
        Assert.assertTrue(page.passwordFielRequiredAlert.isDisplayed());
        Thread.sleep(3000);
    }

    @Given("Kullanici gecerli username girer")
    public void kullaniciGecerliUsernameGirer() throws InterruptedException {
        Thread.sleep(3000);
        page.userNameTextBox.clear();
        page.userNameTextBox.sendKeys(ConfigReader.getProperty("userName"));
    }

    @And("Kullanici gecerli password girer")
    public void kullaniciGecerliPasswordGirer() throws InterruptedException {
        Thread.sleep(3000);
        page.passwordTextBox.clear();
        page.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
       Thread.sleep(3000);
    }

    @When("Kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() throws InterruptedException {
        page.loginButton.click();
        Thread.sleep(2000);
    }

    @Then("Kullanici kontrol panelinde hosgeldin mesajini gorur")
    public void kullaniciKontrolPanelindeHosgeldinMesajiniGorur() {
        Assert.assertTrue(page.welcomeMessageInDashboard.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int bekle) {
        try {
            Thread.sleep(bekle*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
