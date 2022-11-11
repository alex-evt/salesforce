package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown {

    private static final String DROP_DOWN_XPATH = "//*[text()='Industry']//ancestor::div[contains(@class,'uiInput ')]//a";
    private static final String SELECT_OPTION_XPATH = "//*[text()='Chemicals']//ancestor::div[@class='select-options']//a[contains(text(), '%s')]";

    private WebDriver driver;
    private String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();

    }

}
