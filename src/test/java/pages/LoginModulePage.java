package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginModulePage {

    public LoginModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='login-header']")
    public WebElement loginHeader;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    public WebElement loginButton;

    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement userNameFielRequiredAlert;

    @FindBy(xpath = "//mat-error[@id='mat-error-1']")
    public WebElement passwordFielRequiredAlert;

    @FindBy(xpath = "//mat-card[@id='welcomeUserMessage']")
    public WebElement welcomeMessageInDashboard;






}
