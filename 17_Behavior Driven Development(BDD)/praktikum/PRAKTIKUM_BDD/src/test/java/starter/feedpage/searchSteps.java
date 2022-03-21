package starter.feedpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
    @Given("I go to feed page")
    public void iGoToHomePage(){
        System.out.println("I am in feed page");
    }

    @When("Enter name into the Search text box field")
    public void enter_name_into_the_Search_textbox_field(){
        System.out.println("input name Putri");
    }

    @And("Search with enter keyword")
    public void click_login_button(){
        System.out.println("Press Enter in the keyword");
    }

    @Then("all names will be displayed")
    public void all_names_will_be_displayed(){
        System.out.println("all names Putri will be displayed");
    }

}
