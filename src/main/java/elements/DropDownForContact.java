package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownForContact extends BaseElement {

    private static final String DROP_DOWN_XPATH_FOR_CONTACT = "//*[text()='Salutation']//ancestor::div[contains(@class,'slds-form-element__row')]//button";
    private static final String SELECT_OPTION_XPATH_FOR_CONTACT = "//*[text()='Mr.']//ancestor::div[contains(@class, 'slds-listbox')]//span[contains(text(), '%s')]";

    public DropDownForContact(String label) {
        super(label);
    }

    public void selectOption(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_CONTACT, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_CONTACT, option))).click();
    }
}
