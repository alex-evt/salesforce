package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown {

    private static final String DROP_DOWN_XPATH_FOR_ACCOUNT = "//*[text()='Industry']//ancestor::div[contains(@class,'uiInput ')]//a";
    private static final String SELECT_OPTION_XPATH_FOR_ACCOUNT = "//*[text()='Chemicals']//ancestor::div[@class='select-options']//a[contains(text(), '%s')]";

    private static final String DROP_DOWN_XPATH_FOR_CONTACT = "//*[text()='Salutation']//ancestor::div[contains(@class,'slds-form-element__row')]//button";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT = "//*[text()='Mr.']//ancestor::div[contains(@class, 'slds-listbox')]//span[contains(text(), '%s')]";

    private static final String DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Account Name']//ancestor::span[contains(@class, 'slds-size_1-of-1')]//input";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Recent Accounts']//ancestor::ul//span[@title='%s']";


    private WebDriver driver;
    private String label;

    public DropDown(String label) {
        driver = DriverSingleton.getInstance().getDriver();
        this.label = label;
    }

    public void selectOption(String option){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_ACCOUNT, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_ACCOUNT, option))).click();
    }

    public void selectOptionForContact(String option){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT, option))).click();
    }

    public void selectOptionForContactAccountName(String option){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME, option))).click();
    }

}
