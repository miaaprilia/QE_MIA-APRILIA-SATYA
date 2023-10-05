package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserByIDNegative {

    private static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set API endpoint invalid for get user")
    public String setAPIEndpointNegative()  {
        return url + "posts/1";
    }
    @Step("I send request to get all user with blank field")
    public void sendGetUserInvalidRequest() {
        SerenityRest.given()
                .get(setAPIEndpointNegative());
    }

    @Step("I receive status code 200 OK")
    public void receivedStatusCode200Ok() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all user data")
    public void receivedInvalidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Negative_Response_Schema);

        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
