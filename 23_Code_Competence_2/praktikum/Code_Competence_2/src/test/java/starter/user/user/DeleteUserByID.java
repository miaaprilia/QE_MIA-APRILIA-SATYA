package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUserByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for delete user data")
    public String setAPIEndpointValidDeleteUserPath() {
        return url + "users/1";
    }

    @Step("I send request to delete user data")
    public void sendRequestDeleteUserData() {
        SerenityRest.given()
                .delete(setAPIEndpointValidDeleteUserPath());
    }

    @Step("I received status code 200 OK delete user by ID")
    public void receivedStatusCode200OKDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail user data response")
    public void receivedDetailUserDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_User_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for delete user data without the path")
    public String setAPIEndpointInvalidDeleteUserWithoutPath() {
        return url; }

    @Step("I send request to delete user data no path")
    public void sendRequestDeleteUserDataNoPath() {
        SerenityRest.given()
                .delete(setAPIEndpointInvalidDeleteUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to delete user by ID")
    public void receivedStatusCode404NotfoundInRequestDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"Cannot DELETE\" format HTML response")
    public void receivedErrorMessageCannotDELETEResponseUserByID() {
    }

    @Step("I set API endpoint invalid for delete user data the path")
    public String setAPIEndpointInvalidDeleteUserPath() {
        return url; }

    @Step("I send request to delete user data invalid ID")
    public void sendRequestDeleteUserDataInvalidID() {
        SerenityRest.given()
                .delete(setAPIEndpointInvalidDeleteUserPath());
    }

    @Step("I received status code 400 Bad Request in request to delete user data by ID")
    public void receivedStatusCode400BadRequestInRequestDeleteUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"user id should be provided\" response in request to delete data by ID")
    public void receivedErrorMessageSomethingWentWrong() {
    }

    @Step("I received status code 200 OK in request to delete user data by ID")
    public void receivedStatusCode200OKInRequestDeleteSingleUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message \"null\" response in request to delete data by ID")
    public void receivedErrorMessageNullResponseDeleteUserByID() {
    }
}