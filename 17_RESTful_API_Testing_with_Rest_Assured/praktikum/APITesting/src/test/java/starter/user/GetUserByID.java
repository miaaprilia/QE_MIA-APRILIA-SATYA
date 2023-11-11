package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint valid for get user by ID")
    public String setAPIEndpointValidGetUserByID(){
        return url + "posts/1"; }

    @Step("I send request to get user with valid ID")
    public void sendRequestGetUserWithValidID() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetUserByID());
    }

    @Step("I received status code of 200 OK for a get user by ID")
    public void receivedStatusCode200OKGetUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received data get user by ID response")
    public void receivedDataGetUserByIDResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_By_ID_Response_Schema);

        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single user data the path character")
    public String setAPIEndpointInvalidGetSingleUserDataThePathCharacter(){
        return url + "posts/1Mn*6hk"; }

    @Step("I send request to get a single user data invalid ID character")
    public void sendRequestGetSingleUserDataInvalidIDCharacter() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetSingleUserDataThePathCharacter());
    }

    @Step("I received status code 404 Not Request in request to get user by ID")
    public void receivedStatusCode404NotRequestGetUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set API endpoint invalid for get a single user data the path exist in the database")
    public String setAPIEndpointInvalidGetSingleUserDataThePathExistInTheDatabase(){
        return url + "posts/110000"; }

    @Step("I send request to get a single user data invalid ID exist in the database")
    public void sendRequestGetSingleUserDataInvalidIDExistInTheDatabase() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetSingleUserDataThePathExistInTheDatabase());
    }
}
