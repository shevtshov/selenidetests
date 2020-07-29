package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement profileIcon = $(By.id("header-details-user-fullname"));
 //   private SelenideElement createLinkButton = $(By.id("create_link");
    private SelenideElement projectField = $(By.id("project-field"));
    private SelenideElement summaryField = $(By.id("summary"));
    private SelenideElement isueTypeField = $(By.id("summary"));
    private SelenideElement createIssueButton = $(By.id("create-issue-submit"));


    public void profileIsPresent() {
        profileIcon.shouldBe(Condition.enabled);
    }

    public void projectFieldIsEnabled() {
        projectField.shouldBe(Condition.enabled);
    }

    public void inputProjectField() {
        projectField.setValue("Webinar (WEBINAR)").pressTab();
    }

    public void inputSummary() {
        summaryField.setValue("Test ticket").pressTab();
    }

    public void inputIssuedType() {
        isueTypeField.setValue("Task");
    }
    public void clickOnCreateIssueButton(){
        createIssueButton.click();
    }

}
