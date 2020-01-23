package Cucumber.Automantion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class driverUtil {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        //Creating a properties obj to access the properties from the properties file
        //And declare a global variable
         prop = new Properties();

        //Add the path of global.properties file
        String projpath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projpath+"/src/test/java/Cucumber/Automantion/global.properties");
        prop.load(fis);


        //setting up drivers to accessible from other classes
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;

    }
}
