package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EventModulePage {

    public EventModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@routerlink='/create-event']")
    public WebElement createEventButton;

    @FindBy(xpath = "//h1")
    public WebElement createEventFormPageHeader;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement createEventFormPageCreateEventButton;

    @FindBy(xpath = "//*[text()='Event name field is required']")
    public WebElement createEventFormPageEventNameFieldRequiredMessage;

    @FindBy(xpath = "//*[text()='Please choose a valid date']")
    public WebElement createEventFormPageChooseValidDateMessage;

    @FindBy(xpath = "//*[text()='Participant name is required']")
    public WebElement createEventFormPageParticipantNameRequiredMessage;

    @FindBy(xpath = "//*[text()='Participant last name is required']")
    public WebElement createEventFormPageParticipantLastnameRequiredMessage;

    @FindBy(xpath = "//*[text()='Please enter email or phone number']")
    public WebElement createEventFormPageEnterEmailOrPhoneNumberMessage;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base']")
    public WebElement createEventFormPageAddParticipantButton;

    @FindBy(xpath = "(//tr[@class='ng-star-inserted'])[2]")
    public WebElement createEventFormPageAddNewParticipantRow;

    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-icon-button mat-button-base mat-warn'])[1]")
    public WebElement createEventFormPageFirrstParticipantDeleteButton;

    @FindBy(xpath = "//p[text()='Please add participant!']")
    public WebElement createEventFormPageAddParticipantMessage;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement createEventFormPageEventNameTextBox;

    @FindBy(xpath = "//input[@id='mat-input-4']")
    public WebElement createEventFormPageEventDateTextBox;


    @FindBy(xpath = "//input[@data-placeholder='Enter first name']")
    public WebElement createEventFormPageParticipantNameTextBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter last name']")
    public WebElement createEventFormPageParticipantLastNameTextBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter email or phone']")
    public WebElement createEventFormPageParticipantContactTextBox;

    @FindBy(xpath = "//button[@title='Edit Event']")
    public WebElement dashboardPageEditEventButton;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement editEventPageEventDescriptionTextBox;

    @FindBy(xpath = "//input[@formcontrolname='date']")
    public WebElement editEventPageEventDateTextBox;

    @FindBy(xpath = "//input[@placeholder='Enter first name']")
    public WebElement editEventPageParticipantFirstNameTextBox;


    @FindBy(xpath = "//input[@placeholder='Enter last name']")
    public WebElement editEventPageParticipantLastNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Enter email or phone']")
    public WebElement editEventPageParticipantContactTextBox;

    @FindBy(xpath = "//*[text()='Event created successfully']")
    public WebElement dashboardPageCreatedEventSuccessfullyMessage;

    @FindBy(xpath = "//h1[@class='section-title']")
    public WebElement editEventPageTitle;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement editEventPageUpdateEventButton;

    @FindBy(xpath = "//*[@class='mat-simple-snackbar ng-star-inserted']")
    public WebElement dashboardPageUpdatedEventSuccessfullyMessage;




}
