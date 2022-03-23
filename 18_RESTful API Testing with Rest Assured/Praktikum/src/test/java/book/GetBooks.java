package book;

import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetBooks {
    protected static String url = "https://demoqa.com/BookStore/v1/";

    //GET - All Book
    @Step("I set an endpoint for GET all book")
    public String setAnEndpointForGETAllBook() {
        return url + "Books";
    }

    //GET - DETAIL Book
    @Step("I set an endpoint for GET detail book")
    public String setApiBookEndpoints() {
        return url + "Book?ISBN=9781449325862";
    }

    @Step("I request GET the book")
    public void sendGetBookHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiBookEndpoints());
    }

    @Step("I validate the status code is 200")
    public void validateBookHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("validate the data detail book")
    public void validateDataDetailBook(){
        SerenityRest.then().body("title", equalTo("Git Pocket Guide"));
        SerenityRest.then().body("author", equalTo("Richard E. Silverman"));
    }
}
