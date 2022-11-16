package tests;

import model.Contact;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.LoginService;
import services.NewContactService;

public class ContactTest extends BaseTest {

    private static final String expectedAlert = "Contact \"Dr. Antony Wheel\" was created.";

    @BeforeClass
    public void openMainPage() {
        User user = new User();
        LoginService loginService = new LoginService();
        loginService.login(user);
    }

    @Test
    public void createContactTest() {
        Contact contact = new Contact("Dr.", "Antony", "Wheel", "Account1");

        NewContactService contactService = new NewContactService();
        contactService.createContact(contact);

        String actualAlert = contactService.getAlertText();
        Assert.assertEquals(actualAlert, expectedAlert);
    }
}
