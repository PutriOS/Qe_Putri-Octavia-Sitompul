package starter.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("I am in login page")
    public void iam_in_login_page(){
        System.out.println("I am in login page");
    }
    @When("I input valid username and password")
    public void input_valid_username_and_password(){
        System.out.println("input valid username");
        System.out.println("input valid password");
    }

    @And("Click login button")
    public void Click_login_button(){
        System.out.println("Click login button");
    }

    @Then("I can access my homepage")
    public void can_access_my_homepage(){
        System.out.println("I can access my homepage");
    }

    @When("I input valid username and wrong password")
    public void input_valid_username_and_wrong_password(){
        System.out.println("input valid username");
        System.out.println("input wrong password");
    }

    @Then("I can't access my homepage")
    public void cannot_access_my_homepage(){
        System.out.println("I can't access my homepage");
    }
}
