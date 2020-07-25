package utils;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void createInstance(String browserName) {

        DesiredCapabilities capability = null;
        WebDriver driver = null;

        if (browserName.toLowerCase().contains("firefox")) {
            WebDriverManager.firefoxdriver().setup(); // Аналог - System.setProperty("webdriver.chrome.driver","D:\List_of_Jar\chromedriver.exe"); и руками не кладем фафлик в папку
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().contains("internet")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.toLowerCase().contains("chrome")) {
//      WebDriverManager.chromedriver().version("78.0.3904.70").setup();
            WebDriverManager.chromedriver().setup();
//            capability.setAcceptInsecureCerts();
            driver = new ChromeDriver();

        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        webDriver = driver;
    }

//  public static void setWebDriver(WebDriver driver) {
//    webDriver = driver;
//  }
//
//  public static void closeDriver() {
//    webDriver.quit();
//  }



}