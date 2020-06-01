package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart {

    private WebDriver driver;

    @Given("User is on Greencart landing page")
    public void userIsOnGreencartLandingPage() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/yoodahun/Documents/Github/Java/Cucumber with Java-Build Automation Framework in lesser code/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }

    @When("User searched for {string} Vegetable")
    public void userSearchedForVegetable(String vegetable) throws InterruptedException {
        // //input[@type='search']
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(vegetable);
        Thread.sleep(3000);
    }

    @Then("{string} results are displayed")
    public void resultsAreDisplayed(String vegetable) {
//        System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());

        Assert.assertTrue(
                          driver.findElement(By.cssSelector("h4.product-name")).getText().contains(vegetable)
                        );
    }
}
