package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputField extends BaseElement {

    private static final String INPUT_XPATH = "//*[text()='%s']//ancestor::div[contains(@class,'uiInput ')]//input";

    public InputField(String label) {
        super(label);
    }

//    private WebDriver driver = DriverSingleton.getInstance().getDriver();
//    private String label;

//    public InputField(String label) {
//        this.label = label;
//    }

    public void writeText(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH, label))))
                .sendKeys(text);
    }


}
