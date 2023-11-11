package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsers {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step ("I set API endpoint valid for get all users")
    public String setAPIEndpointValidGetAllUsers(){
        return url + "posts"; }

    @Step("I send request to get all user with valid path")
    public void sendRequestGetAllUserWithValidPath() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllUsers());
    }

    @Step("I received status code of 200 OK for a get all users")
    public void receivedStatusCode200OKGetAllUsers() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list data get all users response")
    public void receivedListDataGetAllUsersResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Users_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all users with an invalid path")
    public String setAPIEndpointGetAllUsersWithInvalidPath(){
        return url + "post"; }

    @Step("I send request to get all users with an invalid path")
    public void sendRequestGetAllUsersWithInvalidPath() {
        SerenityRest.given()
                .get(setAPIEndpointGetAllUsersWithInvalidPath());
    }

    @Step("I received status code 404 Not Found in request to get all users")
    public void receivedStatusCode404NotRequestGetAllUsers() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
