package pages;

import elements.DropDown;
import elements.InputField;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BasePage{

    private static final String URL_CREATE_CONTACT = "https://tms9.lightning.force.com/lightning/o/Contact/new";



    @FindBy(xpath = "//button[@name='SaveEdit']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@name='SaveAndNew']")
    private WebElement saveAndNewButton;

    @FindBy(xpath = "//span[contains(@class, 'toastMessage')]")
    private WebElement alert;


    public String getAlertText() {
        return alert.getText();
    }

    public void clickSave(){
        saveButton.click();
        waitVisibilityOf(alert);
    }

    public void clickSaveAndNew(){
        saveAndNewButton.click();
    }


    public NewContactPage openPage(){
        driver.get(URL_CREATE_CONTACT);
        return this;
    }

    public NewContactPage createNewContact(Contact contact){
        new InputField("First Name").writeTextContact(contact.getFirstName());
        new InputField("Last Name").writeTextContact(contact.getLastName());
        new DropDown("Salutation").selectOptionForContact(contact.getSalutation());
        new DropDown("Account Name").selectOptionForContactAccountName(contact.getAccountName());
        return this;
    }
}
