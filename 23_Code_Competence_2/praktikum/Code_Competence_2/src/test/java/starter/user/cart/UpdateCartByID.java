package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateCartByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for update a single cart data")
    public String setAPIEndpointValidUpdateSingleCartDataPath() {
        return url + "carts/1";
    }

    @Step("I send request to update a single cart data")
    public void sendRequestUpdateSingleCartData() {
        SerenityRest.given()
                .put(setAPIEndpointValidUpdateSingleCartDataPath());
    }

    @Step("I received status code 200 OK update cart by ID")
    public void receivedStatusCode200OKUpdateCartByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received id update cart data response")
    public void receivedIdUpdateCartDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Cart_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for update cart data without the path")
    public String setAPIEndpointInvalidUpdateCartDataWithoutThePath() {
        return url; }

    @Step("I send request to update cart data no path")
    public void sendRequestUpdateCartDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidUpdateCartDataWithoutThePath());
    }

    @Step("I received status code 404 Not Found in request to update cart by ID")
    public void receivedStatusCode404NotFoundRequestUpdateCartByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set API endpoint invalid for update a single cart data the path")
    public String setAPIEndpointInvalidUpdateSingleCartDataThePath() {
        return url; }

    @Step("I send request to update a single cart data invalid ID")
    public void sendRequestUpdateSingleCartDataInvalidUserID() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidUpdateSingleCartDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to update a single cart data by ID")
    public void receivedStatusCode400BadRequestRequestUpdateSingleCartData() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"something went wrong! check your sent data\" response in request to update cart data by ID")
    public void receivedErrorMessageResponseInRequestUpdateCartByID() {
    }

}

