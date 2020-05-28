package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class stepDefinition {

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
            Assert.assertTrue(true);
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


}
