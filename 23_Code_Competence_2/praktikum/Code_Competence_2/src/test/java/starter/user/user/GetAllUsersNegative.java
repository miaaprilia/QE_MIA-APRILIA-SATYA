package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsersNegative {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all users negative")
    public String setAPIEndpointAGetAllUsersNegative() {
        return url + "users";
    }

    @Step("I send request to get all user with blank field")
    public void sendRequestGetAllUserBlankField() {
        SerenityRest.given().get(setAPIEndpointAGetAllUsersNegative());
    }

    @Step("I receive status code 200 Ok")
    public void receiveStatusCode200Ok() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all user data")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Users_Negative_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
