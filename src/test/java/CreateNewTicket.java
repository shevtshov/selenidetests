import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;


public class CreateNewTicket {

    private LoginPage loginPage;
    private MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "Chrome";
    }

    @Test
    public void CreateTicket() {
        //Login
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginPage.openJira();
        loginPage.enterLoginAndPassword();
        loginPage.loginButton.click();
        mainPage.profileIsPresent();
        //Create issue
  //      $(By.id("create_link")).click();
  //      $(By.id("project-field")).shouldBe(Condition.enabled);
  //      $(By.id("project-field")).setValue("Webinar (WEBINAR)").pressTab();
   //     $(By.id("issuetype-field")).setValue("Task").pressTab();
   //     $(By.id("summary")).setValue("Test ticket").pressTab();
   //     $(By.id("create-issue-submit")).click();
        $(By.id("aui-flag-container")).shouldBe(Condition.visible);
    }
}