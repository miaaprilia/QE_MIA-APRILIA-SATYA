package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateUserByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step ("I set API endpoint valid for update user")
    public String setAPIEndpointValidUpdateUser(){
        return url + "posts/1"; }

    @Step("I send request to update user with valid path")
    public void sendRequestUpdateUserWithValidPath() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setAPIEndpointValidUpdateUser());
    }

    @Step("I received status code 200 OK for a update user")
    public void receivedStatusCode200OKForUpdateUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set API endpoint for update user with an invalid path")
    public String setAPIEndpointUpdateUserByIDWithInvalidPath(){
        return url + "posts"; }

    @Step("I send request to update user with invalid path")
    public void sendRequestUpdateUserByIDWithInvalidPath() {
        SerenityRest.given()
                .put(setAPIEndpointUpdateUserByIDWithInvalidPath());
    }

    @Step("I received status code 404 Not Found for a update user")
    public void receivedStatusCode404NotFoundRequestUpdateUser() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
