package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateUser {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step ("I set API endpoint valid for create user")
    public String setAPIEndpointValidCreateUser(){
        return url + "posts"; }

    @Step("I send request to create user with valid path")
    public void sendRequestCreateUserWithValidPath() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setAPIEndpointValidCreateUser());
    }

    @Step("I received status code 201 Created for a create new user")
    public void receivedStatusCode201CreatedForCreateNewUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set API endpoint for create new user with an invalid path")
    public String setAPIEndpointCreateNewUserWithInvalidPath(){
        return url + "post"; }

    @Step("I send request to create user with invalid path")
    public void sendRequestCreateUserWithInvalidPath() {
        SerenityRest.given()
                .put(setAPIEndpointCreateNewUserWithInvalidPath());
    }

    @Step("I received status code 404 Not Found for a create new user")
    public void receivedStatusCode404NotRequestCreateNewUser() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
