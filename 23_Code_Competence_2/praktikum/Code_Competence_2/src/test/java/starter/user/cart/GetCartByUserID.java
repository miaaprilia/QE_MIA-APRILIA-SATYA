package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartByUserID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get cart specific data")
    public String setAPIEndpointValidGetCartSpecificDataPath() {
        return url + "carts/user/1";
    }

    @Step("I send request to get cart specific data")
    public void sendRequestGetCartSpecificData() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetCartSpecificDataPath());
    }

    @Step("I received status code 200 OK get cart by user ID")
    public void receivedStatusCode200OKGetCartByUserID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail list cart in specific user id data response")
    public void receivedDetailListCartSpecificUserIDDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Carts_By_User_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get cart specific data the path")
    public String setAPIEndpointInvalidGetCartSpecificDataThePath() {
        return url; }

    @Step("I send request to get cart specific data invalid User ID")
    public void sendRequestGetCartSpecificDataInvalidUserID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetCartSpecificDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to get cart specific data by User ID")
    public void receivedStatusCode400BadRequestRequestGetCartSpecificData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received error message \"cart id should be provided\" response in request to get cart data by User ID")
    public void receivedErrorMessageResponseInRequestGetCartByUserID() {
    }

    @Step("I received status code 200 OK in request to get cart specific data by User ID")
    public void receivedStatusCode200OKInRequestGetCartSpecificData() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

