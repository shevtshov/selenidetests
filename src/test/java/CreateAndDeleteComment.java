import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreateAndDeleteComment {
    @BeforeMethod()
    public void setUp() {
        com.codeborne.selenide.Configuration.browser = "chrome";
    }

    @Test()
    public void CreateAndDelete() {
        //Login and open ticket
        open("https://jira.hillel.it/secure/Dashboard.jspa");
        $(By.id("login-form-username")).setValue("webinar5");
        $(By.id("login-form-password")).setValue("webinar5");
        $("#login").click();
        $(By.id("header-details-user-fullname")).shouldBe(Condition.enabled);
        open("https://jira.hillel.it/browse/WEBINAR-12311");
        $(By.xpath("//a[contains(text(),'WEBINAR-12311')]")).shouldBe(Condition.visible);
        $(By.id("footer-comment-button")).click();
        $(By.id("comment")).setValue("Test Comment");
        $(By.id("issue-comment-add-submit")).click();
        $(By.xpath("//*[contains(text(),'Just now')]")).shouldBe(Condition.visible);
        $(By.xpath("//*[@title='Delete']")).click();
        $(By.id("comment-delete-submit")).click();
        $(By.xpath("//*[contains(text(),'There are no comments yet on this issue.')]")).shouldBe(Condition.visible);
    }
}
