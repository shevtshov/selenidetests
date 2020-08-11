package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TicketPage {

    private SelenideElement ticketNumber = $(By.xpath("//a[contains(text(),'WEBINAR-12311')]"));
    private SelenideElement addCommentButton = $(By.id("footer-comment-button"));
    private SelenideElement commentField = $(By.id("comment"));
    private SelenideElement addCommentSubmit = $(By.id("issue-comment-add-submit"));
    private SelenideElement deleteCommentButton =  $(By.xpath("//*[@title='Delete']"));
    private SelenideElement commentDeleteSubmit = $(By.id("comment-delete-submit"));


    public void OpenTicket() {
        open("https://jira.hillel.it/browse/WEBINAR-12311");
    }

    public void TicketNumberIsPresent() {
        ticketNumber.shouldBe(Condition.visible);
    }

    public void ClickOnAddCommentButton() {
        addCommentButton.click();
    }

    public void EnterComment() {
        commentField.setValue("Test comment");
    }
    public void ClickOnAddCommentSubmit(){
        addCommentSubmit.click();
    }
    public void messageCheckAdded(){
        $(By.xpath("//*[contains(text(),'Just now')]")).shouldBe(Condition.visible);
    }
    public void clickOnDeleteCommentButton(){
        deleteCommentButton.click();
    }
    public void deleteComment(){
        commentDeleteSubmit.click();
    }
    public void checkDeletedMessage(){
        $(By.xpath("//*[contains(text(),'There are no comments yet on this issue.')]")).shouldBe(Condition.exist);
    }
}
