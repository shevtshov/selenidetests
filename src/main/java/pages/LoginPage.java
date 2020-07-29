package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {


   private SelenideElement loginField = $(By.id("login-form-username"));
   private SelenideElement passwordField = $(By.id("login-form-password"));
   public SelenideElement loginButton = $(By.id("login"));



    public void enterLoginAndPassword() {
        loginField.setValue("webinar5");
        passwordField.setValue("webinar5");
    }

    public void openJira(){
        open("https://jira.hillel.it/secure/Dashboard.jspa");
    }
}
