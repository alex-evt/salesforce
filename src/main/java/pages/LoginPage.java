package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        loginButton.click();
    }
}
