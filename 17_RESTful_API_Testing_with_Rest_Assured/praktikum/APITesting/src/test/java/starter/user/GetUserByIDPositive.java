package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserByIDPositive {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint valid for get user")
    public String setAPIEndpointPositive(){
        return url + "posts/1"; }

    @Step("I send request to get user with valid ID")
    public void sendGetUserValidRequest() {
        SerenityRest.given()
                .get(setAPIEndpointPositive());
    }

    @Step("I received status code 200")
    public void receivedStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for user")
    public void receivedValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Positive_Response_Schema);

        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
