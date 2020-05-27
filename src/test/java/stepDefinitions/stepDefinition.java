package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("User is on Netbanking landing page");
    }

    @Given("User is on loan landing page")
    public void user_is_on_loan_landing_page() {
        System.out.println("user is on loan landing page");

    }

    @When("User login into application with {string} and {string}")
    public void userLoginIntoApplicationWithAnd(String username, String password) {
        System.out.println(username + ", " + password);
    }



    @Then("Homepage is populated")
    public void homepageIsPopulated() {
        System.out.println("homepage is populated");
    }

    @And("Cards are Displayed")
    public void cardsAreDisplayed() {
        System.out.println("Cards are Displayed");
    }


}
