package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCartByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for delete a single cart data")
    public String setAPIEndpointValidDeleteSingleCartPath() {
        return url + "carts/1";
    }

    @Step("I send request to delete a single cart data")
    public void sendRequestDeleteSingleCartData() {
        SerenityRest.given()
                .put(setAPIEndpointValidDeleteSingleCartPath());
    }

    @Step("I received status code 200 OK delete cart by ID")
    public void receivedStatusCode200OKDeleteCartByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail cart delete data response")
    public void receivedDetailCartDeleteDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_Cart_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for delete cart data without the path")
    public String setAPIEndpointInvalidDeleteCartDataWithoutPath() {
        return url; }

    @Step("I send request to delete cart data no path")
    public void sendRequestDeleteCartDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidDeleteCartDataWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to delete cart by ID")
    public void receivedStatusCode404NotfoundInRequestDeleteCartByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set API endpoint invalid for delete a single cart data the path")
    public String setAPIEndpointInvalidDeleteSingleCartDataPath() {
        return url; }

    @Step("I send request to delete a single cart data invalid ID")
    public void sendRequestDeleteSingleCartDataInvalidID() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidDeleteSingleCartDataPath());
    }

    @Step("I received status code 400 Bad Request in request to delete a single cart data by ID")
    public void receivedStatusCode400NotfoundInRequestDeleteSingleCartDataByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"cart id should be provided\" response in request to delete cart data by ID")
    public void receivedErrorMessageInRequestDeleteCartByID() {
    }

    @Step("I set API endpoint invalid for delete cart data the path")
    public String setAPIEndpointInvalidDeleteCartDataThePath() {
        return url; }

    @Step("I send request to delete cart data invalid ID")
    public void sendRequestDeleteCartDataInvalidID() {
        SerenityRest.given()
                .delete(setAPIEndpointInvalidDeleteCartDataThePath());
    }

    @Step("I received status code 200 OK in request to delete cart data by ID")
    public void receivedStatusCode200OKInRequestDeleteCartByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received message \"null\" response in request to delete cart data by ID")
    public void receivedErrorMessageNullResponseInRequestDeleteCartByID() {
    }


}
