package book;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class PutBooks {

    protected static String url = "https://demoqa.com/BookStore/v1/";

    /*VALID DATA*/
    @Step("I set PUT api endpoints")
    public String iSetPUTApiEndpoints() {
        return url + "Books/9781449325862";
    }

    @Step("I send PUT HTTP valid data request")
    public void sendPUTHTTPValidDataRequest() {
        JSONObject requestData = new JSONObject();
        requestData.put("userId", "14bcec3c-8b87-4a70-bc8f-570b2a2a6aa3");
        requestData.put("isbn", "11319051"); /*ubah isbn*/

        given()
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(iSetPUTApiEndpoints());
    }

    @Step("I receive valid data for updated book")
    public void receiveValidDataForUpdatedBook() {
        then().body("books.isbn", equalTo("11319051"));
    }

    /*INVALID DATA*/
    @Step("I send PUT HTTP Invalid data request")
    public void sendPUTHTTPInvalidDataRequest() {
        JSONObject requestData = new JSONObject();
        requestData.put("userId", "14bcec3c-8b87-4a70-bc8f-570b2a2a6aa3");
        requestData.put("isbn", 11319051); /*ubah isbn dengan angka*/

        given()
                .header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(iSetPUTApiEndpoints());
    }

    @Step("I validate the status code is 400")
    public void validateTheStatusCodeIs400() {
        restAssuredThat(response -> response.statusCode(400));
    }

}
