package starter.feedpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class postSteps {
    @Given("I am in feed page")
    public void go_to_home_page(){
        System.out.println("I am in feed page");
    }

    @When("I click Start a post button")
    public void click_Start_post_button(){
        System.out.println("click Start a post button");
    }

    @And("click photo icon to upload photo")
    public void click_photo_icon(){
        System.out.println("click photo icon");
        System.out.println("select photo");
    }

    @And("click done button")
    public void click_done_button(){
        System.out.println("click done button");
    }

    @And("click post button")
    public void click_post_button(){
        System.out.println("click post button");
    }

    @Then("the photo uploaded successfully is displayed")
    public void the_photo_uploaded_successfully(){
        System.out.println("the photo uploaded successfully is displayed");
    }

    @And("click vidio icon to upload vidio")
    public void click_vidio_icon(){
        System.out.println("click vidio icon");
        System.out.println("select vidio");
    }

    @Then("the vidio uploaded successfully is displayed")
    public void the_vidio_uploaded_successfully(){
        System.out.println("the vidio uploaded successfully");
    }

    @And("click document icon to upload document")
    public void click_document_icon(){
        System.out.println("click document icon");
        System.out.println("select document");
    }

    @Then("the document uploaded successfully is displayed")
    public void the_document_uploaded_successfully(){
        System.out.println("the document uploaded successfully");
    }
}
