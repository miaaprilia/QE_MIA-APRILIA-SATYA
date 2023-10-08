package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsersPositive {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all users positive")
    public String setAPIEndpointAGetAllUsersPositive() {
        return url + "users";
    }

    @Step(" send request to get all user with valid path")
    public void sendRequestGetAllUserValidPath() {
        SerenityRest.given()
                .get(setAPIEndpointAGetAllUsersPositive());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all data user")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Users_Positive_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
