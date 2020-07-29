
import com.codeborne.selenide.Configuration;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;


public class LoginToJira {

    private LoginPage loginPage;
    private MainPage mainPage;


    @BeforeMethod()
    public void setUp() {
        Configuration.browser = "Chrome";
    }

    @Test()
    public void Login() {
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginPage.openJira();
        loginPage.enterLoginAndPassword();
        loginPage.loginButton.click();
        mainPage.profileIsPresent();
    }
}