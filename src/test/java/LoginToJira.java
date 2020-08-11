
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.LoginPage;

import pages.MainPage;


public class LoginToJira {

    private LoginPage loginPage;
    private MainPage mainPage;

    @BeforeMethod()
    public void setUp(){
        Configuration.browser = "Chrome";
        Configuration.reportsFolder = "screenshots";
    }

    @Test()
    public void Login() throws ATUTestRecorderException {
        ATUTestRecorder recorder = new ATUTestRecorder("screenshots", "TestVideo", false);
        recorder.start();
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginPage.openJira();
        loginPage.enterLoginAndPassword();
        loginPage.loginButton.click();
        mainPage.profileIsPresent();
        recorder.stop();
    }
}