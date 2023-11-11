package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUserByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step ("I set API endpoint valid for delete user by ID")
    public String setAPIEndpointValidDeleteUserByID(){
        return url + "posts/1"; }

    @Step("I send request to delete user with valid ID")
    public void sendRequestDeleteUserWithValidID() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .delete(setAPIEndpointValidDeleteUserByID());
    }

    @Step("I received status code of 200 OK for a delete user")
    public void receivedStatusCode200OKForDeleteUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set API endpoint for delete user by ID with an invalid path")
    public String setAPIEndpointDeletewUserByIDWithInvalidPath(){
        return url + "posts"; }

    @Step("I send request to delete user by ID with an invalid path")
    public void sendRequestDeleteUserByIDWithInvalidPath() {
        SerenityRest.given()
                .delete(setAPIEndpointDeletewUserByIDWithInvalidPath());
    }

    @Step("I received status code of 404 Not Found for a delete user")
    public void receivedStatusCode404NotFoundRequestDeleteUser() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
