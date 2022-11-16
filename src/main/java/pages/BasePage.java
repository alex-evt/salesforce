package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private static final int TIMEOUT = 8;

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement waitVisibilityOf(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
    }
}
