import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.TicketPage;


public class CreateAndDeleteComment {


    private LoginPage loginPage;
    private MainPage mainPage;
    private TicketPage ticketPage;


    @BeforeMethod()
    public void setUp() {
        Configuration.browser = "Chrome";
    }

    @Test()
    public void CreateAndDelete() {
        //Login
        loginPage = new LoginPage();
        mainPage = new MainPage();
        ticketPage = new TicketPage();
        loginPage.openJira();
        loginPage.enterLoginAndPassword();
        loginPage.loginButton.click();
        mainPage.profileIsPresent();
        //Open ticket
        ticketPage.OpenTicket();
        ticketPage.TicketNumberIsPresent();
        //Add comment
        ticketPage.ClickOnAddCommentButton();
        ticketPage.EnterComment();
        ticketPage.ClickOnAddCommentSubmit();
        ticketPage.messageCheckAdded();
        //Delete comment
        ticketPage.clickOnDeleteCommentButton();
        ticketPage.deleteComment();
        ticketPage.checkDeletedMessage();
    }
}