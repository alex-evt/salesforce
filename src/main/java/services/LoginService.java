package services;

import model.User;
import pages.LoginPage;

public class LoginService {

    LoginPage loginPage = new LoginPage();

    public LoginPage login(User user) {
        loginPage.openPage(user.getUrl())
                .fillInUsername(user)
                .fillInPassword(user)
                .clickLogin();
        return new LoginPage();
    }

}
