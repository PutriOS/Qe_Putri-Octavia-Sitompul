package book;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteBooks {

    protected static String url = "https://demoqa.com/BookStore/v1/";

    @Step("I set Delete api endpoints valid")
    public String setDeleteApiEndpointsValid() {
        return url + "Books?UserId=14bcec3c-8b87-4a70-bc8f-570b2a2a6aa3";
    }

    @Step("I send Delete HTTP data request")
    public void sendDeleteHTTPDataRequest() {
        SerenityRest.given().delete(setDeleteApiEndpointsValid());
    }

    @Step("I validate the status code is 204")
    public void validateTheStatusCodeIs204() {
        restAssuredThat(response -> response.statusCode(204));
    }

    @Step("I set Delete api endpoints invalid")
    public String iSetDeleteApiEndpointsInvalid() {
        return url + "Books?UserId=111111111111111";
    }
}
