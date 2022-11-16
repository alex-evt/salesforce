package pages;

import elements.*;
import model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactPage extends BasePage {

    private static final String URL_CREATE_CONTACT = "https://tms9.lightning.force.com/lightning/o/Contact/new";


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
        new InputFieldContact("First Name").writeTextContact(contact.getFirstName());
        return this;
    }

    public NewContactPage fillInLastName(Contact contact) {
        new InputFieldContact("Last Name").writeTextContact(contact.getLastName());
        return this;
    }

    public NewContactPage selectSalutationOption(Contact contact) {
        new DropDownForContact("Salutation").selectOption(contact.getSalutation());
        return this;
    }

    public NewContactPage selectOptionForAccountName(Contact contact) {
        new DropDownForContactAccountName("Account Name").selectOption(contact.getAccountName());
        return this;
    }

}
