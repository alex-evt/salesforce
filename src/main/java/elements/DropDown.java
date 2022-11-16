package elements;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown extends BaseElement {

    private static final String DROP_DOWN_XPATH_FOR_ACCOUNT = "//*[text()='Industry']//ancestor::div[contains(@class,'uiInput ')]//a";
    private static final String SELECT_OPTION_XPATH_FOR_ACCOUNT = "//*[text()='Chemicals']//ancestor::div[@class='select-options']//a[contains(text(), '%s')]";


    public DropDown(String label) {
        super(label);
    }

//    private WebDriver driver;
//    private String label;
//
//    public DropDown(String label) {
//        driver = DriverSingleton.getInstance().getDriver();
//        this.label = label;
//    }

    public void selectOption(String option) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH_FOR_ACCOUNT, label))))
                .click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH_FOR_ACCOUNT, option))).click();
    }


}
