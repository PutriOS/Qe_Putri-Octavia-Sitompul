package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.user.Get;
import starter.user.Post;


public class stepdefinition{


    @Steps
    Get get;

    @Steps
    Post post;
    private String userId;


    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
        post.requestPostDetailUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs201(int arg0) {
        get.validateStatusCode(201);
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
        post.validateDataDetail();
    }

    @And("get userId for other request")
    public void getUserIdForOtherRequest() {
        this.userId = post.getUserId();
    }


    @When("I request post detail user with invalid password")
    public void iRequestPostDetailUserWithInvalidPassword() {
                post.requestDetailInvalidPassword();
    }


    @And("I validate the error message")
    public void iValidateTheErrorMessage() {
            post.validateErrorMess();
    }

    @Then("I validate the invalid status code is {int}")
    public void iValidateTheInvalidStatusCodeIs(int arg0) {
        get.validateStatusCode400(400);

    }

    @When("I request POST detail user with existing account")
    public void iRequestPOSTDetailUserWithExistingAccount() {

        post.requestPostDetailUser();
    }

    @Then("I validate the exist status code is {int}")
    public void iValidateTheExistStatusCodeIs(int arg0) {
        get.validateExistingStatusCode406(406);
    }

    @And("I validate the exist message")
    public void iValidateTheExistMessage() {
        post.validateExistMessage();
    }
}