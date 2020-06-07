package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;

import java.io.IOException;

public class GreenCart extends Base {

    private Homepage hp;


    @Given("User is on Greencart landing page")
    public void userIsOnGreencartLandingPage() throws IOException {
        initializeDriver();


    }

    @When("User searched for {string} Vegetable")
    public void userSearchedForVegetable(String vegetable) throws InterruptedException {
        // //input[@type='search']
        hp = new Homepage(driver);
        hp.getSearch().sendKeys(vegetable);
        Thread.sleep(3000);
    }

    @Then("{string} results are displayed")
    public void resultsAreDisplayed(String vegetable) {
//        System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());

        Assert.assertTrue(
                          driver.findElement(By.cssSelector("h4.product-name")).getText().contains(vegetable)
                        );
    }

    @And("Added items to cart")
    public void addedItemsToCart() {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]")).click();

    }


}
