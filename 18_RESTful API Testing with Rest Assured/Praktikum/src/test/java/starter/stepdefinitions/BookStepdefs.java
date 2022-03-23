package starter.stepdefinitions;

import book.DeleteBooks;
import book.GetBooks;
import book.PostBooks;
import book.PutBooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Steps;

public class BookStepdefs {

    @Steps
    GetBooks getBooks;

    @Steps
    PostBooks postBooks;

    @Steps
    PutBooks putBooks;

    @Steps
    DeleteBooks deleteBooks;

    @Given("I set an endpoint for GET all book")
    public void iSetAnEndpointForGETAllBook() {
        getBooks.setAnEndpointForGETAllBook();
    }

    @Given("I set an endpoint for GET detail book")
    public void iSetAnEndpointForGETDetailBook() {
        getBooks.setApiBookEndpoints();
    }

    @When("I request GET the book")
    public void iRequestGETDetailBook() {
        getBooks.sendGetBookHttpRequest();
    }

    @Then("I validate the status code is 200")
    public void iValidateTheStatusCodeIs200() {
        getBooks.validateBookHttpResponseCode200();
    }

    @And("validate the data detail book")
    public void validateTheDataDetailBook() {
        getBooks.validateDataDetailBook();
    }


    @Given("I set an endpoint for POST new book")
    public void iSetAnEndpointForPOSTNewBook() {
        postBooks.setAnEndpointForPOSTNewBook();
    }

    @When("I request POST new valid data book")
    public void iRequestPOSTNewBookValid() {
        postBooks.requestPOSTNewBookValid();
    }

    @Then("I validate the status code new book is 201")
    public void iValidateTheStatusCodeNewBookIs201(){
        postBooks.validateTheStatusCodeNewBookIs201();
    }

    @And("validate new data book")
    public void validateNewDataBook() {
        postBooks.validateNewDataBook();
    }

    @When("I request POST new invalid data book")
    public void iRequestPOSTNewBookInvalid() {
        postBooks.requestPOSTNewBookInvalid();
    }

    @Then("I validate the status code is 401")
    public void iValidateTheStatusCodeIs401() {
        postBooks.validateTheStatusCodeIs401();
    }

    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        putBooks.iSetPUTApiEndpoints();
    }

    @When("I send PUT HTTP valid data request")
    public void iSendPUTHTTPValidDataRequest() {
        putBooks.sendPUTHTTPValidDataRequest();
    }

    @And("I receive valid data for updated book")
    public void iReceiveValidDataForUpdatedBook() {
        putBooks.receiveValidDataForUpdatedBook();
    }

    @When("I send PUT HTTP Invalid data request")
    public void iSendPUTHTTPInvalidDataRequest() {
        putBooks.sendPUTHTTPInvalidDataRequest();
    }

    @Then("I validate the status code is 400")
    public void iValidateTheStatusCodeIs400() {
        putBooks.validateTheStatusCodeIs400();
    }

    @Given("I set Delete api endpoints valid")
    public void iSetDeleteApiEndpointsValid() {
        deleteBooks.setDeleteApiEndpointsValid();
    }

    @When("I send Delete HTTP data request")
    public void iSendDeleteHTTPValidDataRequest() {
        deleteBooks.sendDeleteHTTPDataRequest();
    }

    @Then("I validate the status code is 204")
    public void iValidateTheStatusCodeIs204() {
        deleteBooks.validateTheStatusCodeIs204();
    }

    @Given("I set Delete api endpoints invalid")
    public void iSetDeleteApiEndpointsInvalid() {

    }
}
