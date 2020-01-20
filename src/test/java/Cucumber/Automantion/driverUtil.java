package Cucumber.Automantion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverUtil {

    public static WebDriver driver;

    public static WebDriver getDriver(){

        //setting up drivers to accessible from other classes
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}
