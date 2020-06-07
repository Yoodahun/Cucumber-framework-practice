package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class stepDefinition extends Base{

    @Given("Validate the browser")
    public void validateTheBrowser() {
        System.out.println("validate the browser");

    }

    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("browser is triggered");

    }

    @Then("Check if browser is started")
    public void checkIfBrowserIsStarted() {
        System.out.println("Browser is Displayed");
        System.out.println("Background keyword done ----------------");
    }

    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("User is on Netbanking landing page");
    }

    @Given("User is on loan landing page")
    public void user_is_on_loan_landing_page() {
        System.out.println("user is on loan landing page");

    }

    @Then("Homepage is populated")
    public void homepageIsPopulated() {
        System.out.println("homepage is populated");
    }


    @And("Cards Displayed are {string}")
    public void cardsDisplayedAre(String isDisplayed) {
        if("true".equals(isDisplayed)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable table) {
        List<List<String>> obj = table.asLists();
        for(String str : obj.get(0))
        System.out.println(str);

    }

    @When("User login into application with {string} and {string}")
    public void userLoginIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println(username + ", " + password);
    }

    @And("User proceeded to Checkout page for purchase")
    public void userProceededToCheckoutPageForPurchase() {
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();

    }

    @Then("Verify selected {string} items are displayed in checkout page")
    public void verifySelectedItemsAreDisplayedInCheckoutPage(String vegetable) {
        Assert.assertTrue(
                driver.findElement(By.cssSelector("p.product-name")).getText().contains(vegetable)
        );

    }





}
