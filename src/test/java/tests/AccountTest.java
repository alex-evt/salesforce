package tests;


import model.Account;
import model.User;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.NewAccountPage;


public class AccountTest extends BaseTest {

    @Test
    public void createAccountTest(){
        User user = new User();
        Account account = new Account("Account1", "www.onliner.by", "Apparel");


        driver.get(user.getUrl());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.getLogin());
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(user.getPassword());
        driver.findElement(By.xpath("//input[@id='Login']")).click();

        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.openPage().createNewAccount(account);
    }
}
