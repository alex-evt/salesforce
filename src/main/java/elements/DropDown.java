package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class DropDown {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final String label;

    public DropDown(String label) {
        this.label = label;
    }

    public void selectOption(String dropdownXpath, String optionXpath, String option) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(dropdownXpath, label))))
                .click();
        driver.findElement(By.xpath(String.format(optionXpath, option))).click();
    }


}
