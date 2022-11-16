package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownForContactAccountName extends BaseElement {

    private static final String DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Account Name']//ancestor::span[contains(@class, 'slds-size_1-of-1')]//input";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME = "//*[text()='Recent Accounts']//ancestor::ul//span[@title='%s']";

    public DropDownForContactAccountName(String label) {
        super(label);
    }

    public void selectOption(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT_ACCOUNT_NAME, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT_ACCOUNT_NAME, option))).click();
    }
}
