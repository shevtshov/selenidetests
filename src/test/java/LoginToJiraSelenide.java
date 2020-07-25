import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginToJiraSelenide {


    @BeforeMethod()
    public void setUp() {
        com.codeborne.selenide.Configuration.browser = "chrome";
    }

    @Test()
    public void simpleTest() {
        open("https://jira.hillel.it/secure/Dashboard.jspa");
        $(By.id("login-form-username")).setValue("webinar5");
        $(By.id("login-form-password")).setValue("webinar5");
        $("#login").click();
        $(By.id("header-details-user-fullname")).shouldBe(Condition.enabled);
    }
}
