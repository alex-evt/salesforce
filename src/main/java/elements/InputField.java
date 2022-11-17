package elements;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class InputField {

    private final String label;

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public InputField(String label) {
        this.label = label;
    }

    protected void writeText(String xpath, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(xpath, label))))
                .sendKeys(text);
    }
}
