package pages;

import elements.InputFieldLogin;
import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    private static final String USERNAME_ID = "username";
    private static final String PASSWORD_ID = "password";

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(User user) {
        new InputFieldLogin(USERNAME_ID).writeText(user.getUsername());
        return this;
    }

    public LoginPage fillInPassword(User user) {
        new InputFieldLogin(PASSWORD_ID).writeText(user.getPassword());
        return this;
    }

    public void clickLogin() {
        loginButton.click();
    }
}
