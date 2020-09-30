package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

import static com.codeborne.selenide.Selenide.*;

public class CreateIssuePopupPage {

    private SelenideElement createLinkButton = $(By.id("create_link"));
    private SelenideElement projectField = $(By.id("project-field"));
    private SelenideElement summaryField = $(By.id("summary"));
    private SelenideElement isueTypeField = $(By.id("summary"));
    private SelenideElement createIssueButton = $(By.id("create-issue-submit"));
    private SelenideElement cancelButton = $(By.xpath("//a[@class='cancel']"));


    public void clickOnCreateTicketButton() {
        createLinkButton.click();
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

    public void clickOnCreateIssueButton() {
        createIssueButton.click();
    }

    public void clickOnCancelButtonAndCheckPopU() {
        cancelButton.click();
        switchTo().alert().accept();
        createLinkButton.shouldBe(Condition.enabled);
    }
}
