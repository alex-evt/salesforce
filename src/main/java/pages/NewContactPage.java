package pages;

import elements.*;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BasePage {

    private static final String URL_CREATE_CONTACT = "https://tms9.lightning.force.com/lightning/o/Contact/new";
    private static final String FIRST_NAME_LABEL = "First Name";
    private static final String LAST_NAME_LABEL = "Last Name";
    private static final String SALUTATION_LABEL = "Salutation";
    private static final String ACCOUNT_NAME_LABEL = "Account Name";


    @FindBy(xpath = "//button[@name='SaveEdit']")
    private WebElement saveButton;


    @FindBy(xpath = "//span[contains(@class, 'toastMessage')]")
    private WebElement alert;


    public String getAlertText() {
        return alert.getText();
    }

    public void clickSave() {
        saveButton.click();
        waitVisibilityOf(alert);
    }


    public NewContactPage openPage() {
        driver.get(URL_CREATE_CONTACT);
        return this;
    }

    public NewContactPage fillInFirstName(Contact contact) {
        new InputFieldContact(FIRST_NAME_LABEL).writeText(contact.getFirstName());
        return this;
    }

    public NewContactPage fillInLastName(Contact contact) {
        new InputFieldContact(LAST_NAME_LABEL).writeText(contact.getLastName());
        return this;
    }

    public NewContactPage selectSalutationOption(Contact contact) {
        new DropDownContact(SALUTATION_LABEL).selectOption(contact.getSalutation());
        return this;
    }

    public NewContactPage selectOptionForAccountName(Contact contact) {
        new DropDownContactAccountName(ACCOUNT_NAME_LABEL).selectOption(contact.getAccountName());
        return this;
    }

}
