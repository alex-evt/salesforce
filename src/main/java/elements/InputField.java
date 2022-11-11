package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputField {

    private static final String INPUT_XPATH = "//*[text()='%s']//ancestor::div[contains(@class,'uiInput ')]//input";

    private WebDriver driver;
    private String label;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH, label))))
                .sendKeys(text);
    }
}
