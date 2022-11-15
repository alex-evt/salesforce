package services;

import model.Contact;
import pages.NewContactPage;

public class NewContactService {

    NewContactPage newContactPage = new NewContactPage();

    public void createContact(Contact contact){
        newContactPage.openPage()
                .createNewContact(contact)
                .clickSave();
    }

    public String getAlertText(){
        return newContactPage.getAlertText();
    }
}
