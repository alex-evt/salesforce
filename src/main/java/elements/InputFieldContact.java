package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputFieldContact extends BaseElement {

    private static final String INPUT_XPATH_CONTACT = "//*[@placeholder='%s']";


    public InputFieldContact(String label) {
        super(label);
    }

    public void writeTextContact(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH_CONTACT, label))))
                .sendKeys(text);
    }
}
