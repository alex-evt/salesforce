package pages;

import elements.DropDownAccount;
import elements.InputFieldAccount;
import model.Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage {

    private static final String URL_CREATE_ACCOUNT = "https://tms9.lightning.force.com/lightning/o/Account/new";
    private static final String ACCOUNT_NAME_LABEL = "Account Name";
    private static final String WEBSITE_LABEL = "Website";
    private static final String INDUSTRY_LABEL = "Industry";


    @FindBy(xpath = "//button[@title='Save']")
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

    public NewAccountPage openPage() {
        driver.get(URL_CREATE_ACCOUNT);
        return this;
    }

    public NewAccountPage fillInAccountName(Account account) {
        new InputFieldAccount(ACCOUNT_NAME_LABEL).writeText(account.getAccountName());
        return this;
    }

    public NewAccountPage fillInWebsite(Account account) {
        new InputFieldAccount(WEBSITE_LABEL).writeText(account.getWebSite());
        return this;
    }

    public NewAccountPage selectOptionForIndustry(Account account) {
        new DropDownAccount(INDUSTRY_LABEL).selectOption(account.getIndustry());
        return this;
    }
}
