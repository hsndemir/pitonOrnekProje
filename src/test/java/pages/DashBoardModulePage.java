package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashBoardModulePage {

    public DashBoardModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='mat-card-content']")
    public WebElement noRegisteredEventMessage;

    @FindBy(xpath = "//button[@title='Delete Event']")
    public WebElement deleteEventButton;

    @FindBy(xpath = "//button[@title='Participants']")
    public WebElement participantsButton;

    @FindBy(xpath = "//table[@class='participant-table']")
    public WebElement participantsTables;

    @FindBy(xpath = "//input[@id='mat-input-17']")
    public WebElement createEventFormPageParticipantNameTextBox;

    @FindBy(xpath = "//input[@id='mat-input-18']")
    public WebElement createEventFormPageParticipantLastNameTextBox;

    @FindBy(xpath = "//input[@id='mat-input-19']")
    public WebElement createEventFormPageParticipantContactTextBox;




}
