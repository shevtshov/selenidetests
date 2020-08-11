package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement profileIcon = $(By.id("header-details-user-fullname"));

    public void profileIsPresent() {
        profileIcon.shouldBe(Condition.enabled);
    }


}
