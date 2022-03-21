package starter.jobspage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
    @Given("I go to jobs page")
    public void iGoToJobsPage(){
        System.out.println("I am in jobs page");
    }

    @When("Enter jobs and location into the Search text box field")
    public void enter_jobs_and_location_into_the_Search_textbox_field(){
        System.out.println("input the job name analyst");
        System.out.println("input location in jakarta");
    }

    @And("Click button search")
    public void click_search_button(){
        System.out.println("Click button search");
    }

    @Then("All jobs according to location will be displayed")
    public void all_jobs_will_be_displayed(){
        System.out.println("all jobs as analyst in jakarta will be shown");
    }

}
