package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;


public class Get {

    @Step
            ("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }


    @Step("I validate the status code is {int}")
    public void validateStatusCode400(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("I validate the exist status code is {int}")
    public void validateExistingStatusCode406 (int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }


}
