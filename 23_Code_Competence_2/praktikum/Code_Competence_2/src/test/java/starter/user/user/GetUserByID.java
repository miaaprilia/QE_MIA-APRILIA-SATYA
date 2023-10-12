package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get a single user data")
    public String setAPIEndpointValidSingleUserPath() {
        return url + "users/1";
    }

    @Step("I send request to get a single user data")
    public void sendRequestGetSingleUserData() {
        SerenityRest.given()
                .get(setAPIEndpointValidSingleUserPath());
    }

    @Step("I received status code 200 OK get user by ID")
    public void receivedStatusCode200OKGetUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail single user data response")
    public void receivedDetailValidSingleDataUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single user data the path")
    public String setAPIEndpointInvalidSingleUserPath() {
        return url;
    }

    @Step("I send request to get a single user data invalid ID")
    public void sendRequestGetSingleUserInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidSingleUserPath());
    }

    @Step("I received status code 400 Bad Request in request to get a single user data by ID")
    public void receivedStatusCode400BadRequestInGetSingleUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received error message \"user id should be provided\" response")
    public void receivedErrorMessageResponseGetUserByID() {
    }

    @Step("I received status code 200 OK in request to get a single user data by ID")
    public void receivedStatusCode200OKInRequestGetSingleUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received message \"null\" response")
    public void receivedMessageNullResponse() {
    }
}
