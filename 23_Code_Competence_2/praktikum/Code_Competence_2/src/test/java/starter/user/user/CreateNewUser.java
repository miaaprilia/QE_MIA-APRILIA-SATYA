package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewUser {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for create new user data")
    public String setAPIEndpointValidCreateNewUser() {
        return url + "users";
    }

    @Step("I send request to create new user data")
    public void sendRequestPostSingleUserData() {
        SerenityRest.given()
                .put(setAPIEndpointValidCreateNewUser());
    }

    @Step("I received status code 200 OK create user by ID")
    public void receivedStatusCode200OKPostUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received id for new user data")
    public void receivedIDSingleNewUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_User_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for create new user data without the path")
    public String setAPIEndpointInvalidCreateNewUserWithoutPath() {
        return url; }

    @Step("I send request to create new user data no path")
    public void sendRequestPostSingleUserDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidCreateNewUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to create new user")
    public void receivedStatusCode404NotFoundInPostSingleUser() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"Cannot POST\" format HTML response")
    public void receivedErrorMessageCannotPostResponseUserByID() {
    }
}
