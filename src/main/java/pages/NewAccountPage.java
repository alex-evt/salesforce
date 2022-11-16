package pages;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage {

    private static final String URL_CREATE_ACCOUNT = "https://tms9.lightning.force.com/lightning/o/Account/new";


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
        new InputField("Account Name").writeText(account.getAccountName());
        return this;
    }

    public NewAccountPage fillInWebsite(Account account) {
        new InputField("Website").writeText(account.getWebSite());
        return this;
    }

    public NewAccountPage selectOptionForIndustry(Account account) {
        new DropDown("Industry").selectOption(account.getIndustry());
        return this;
    }
}
