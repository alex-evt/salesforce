package services;

import model.User;
import pages.LoginPage;

public class LoginService {

    LoginPage loginPage = new LoginPage();

    public LoginPage login(User user){
        loginPage.openPage(user.getUrl())
                .fillInUsername(user.getUsername())
                .fillInPassword(user.getPassword())
                .clickLogin();
        return new LoginPage();
    }

}
