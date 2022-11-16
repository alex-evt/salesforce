package tests;


import model.Account;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import services.LoginService;
import services.NewAccountService;


public class AccountTest extends BaseTest {

    private static final String expectedAlert = "Account \"Account1\" was created.";

    @BeforeClass
    public void openMainPage() {
        User user = new User();
        LoginService loginService = new LoginService();
        loginService.login(user);
    }

    @Test
    public void createAccountTest() {
        Account account = new Account("Account1", "www.onliner.by", "Apparel");
        NewAccountService accountService = new NewAccountService();

        accountService
                .createNewAccount(account);
        String actualAlert = accountService.getAlertText();
        Assert.assertEquals(actualAlert, expectedAlert);
    }


}
