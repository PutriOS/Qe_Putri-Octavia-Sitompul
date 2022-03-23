package book;

import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class PostBooks {
    protected static String url = "https://demoqa.com/BookStore/v1/";

    /*VALID DATA*/
    @Step("I set an endpoint for POST new book")
    public String setAnEndpointForPOSTNewBook() {
        return url + "Books";
    }

    @Step("I request POST new valid data book")
    public void requestPOSTNewBookValid() {
        JSONObject requestData = new JSONObject();
        requestData.put("userId", "14bcec3c-8b87-4a70-bc8f-570b2a2a6aa3");
        requestData.put("isbn", "9781449325862");

        given()
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setAnEndpointForPOSTNewBook());
    }

    @Step("I validate the status code new book is 201")
    public void validateTheStatusCodeNewBookIs201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("validate new data book")
    public void validateNewDataBook(){
        then().body("isbn", equalTo("9781449325862"));
    }

    /*INVALID DATA*/
    @Step("I request POST new invalid data book")
    public void requestPOSTNewBookInvalid() {
        JSONObject requestData = new JSONObject();
        requestData.put("userId", "101");
        requestData.put("isbn", "9781449325862");

        given()
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setAnEndpointForPOSTNewBook());
    }

    @Step("I validate the status code is 401")
    public void validateTheStatusCodeIs401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
