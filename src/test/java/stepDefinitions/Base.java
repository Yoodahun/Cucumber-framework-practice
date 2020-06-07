package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    protected static WebDriver driver;

    public void initializeDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/yoodahun/Documents/Github/Java/Cucumber with Java-Build Automation Framework in lesser code/chromedriver");
        driver = new ChromeDriver();

        Properties prop = new Properties();
        prop.load(new FileInputStream("src/test/java/automation/global.properties"));

        driver.get(prop.getProperty("url"));



    }
}
