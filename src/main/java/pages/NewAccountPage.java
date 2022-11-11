package pages;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage{

    private static final String SAVE_BUTTON_XPATH = "//button[@title='Save']";





    public NewAccountPage(WebDriver driver) {
        super(driver);
    }


    public NewAccountPage openPage(){
        driver.get("https://tms9.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    public void createNewAccount(Account account){
    new InputField(driver, "Account Name").writeText(account.getAccountName());
    new InputField(driver, "Website").writeText(account.getWebSite());
    new DropDown(driver, "Industry").selectOption(account.getIndustry());
    }

    public void clickSave(){
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
