package pages;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public NewAccountPage createNewAccount(Account account) {
        new InputField("Account Name").writeText(account.getAccountName());
        new InputField("Website").writeText(account.getWebSite());
        new DropDown("Industry").selectOption(account.getIndustry());
        return this;
    }


}
