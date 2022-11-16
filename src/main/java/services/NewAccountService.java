package services;

import model.Account;
import pages.NewAccountPage;

public class NewAccountService {


    protected NewAccountPage newAccountPage = new NewAccountPage();


    public void createNewAccount(Account account) {
        newAccountPage
                .openPage()
                .fillInAccountName(account)
                .fillInWebsite(account)
                .selectOptionForIndustry(account)
                .clickSave();
    }

    public String getAlertText() {
        return newAccountPage.getAlertText();
    }
}
