package elements;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class BaseElement {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    protected String label;

    public BaseElement(String label) {
        this.label = label;
    }
}
