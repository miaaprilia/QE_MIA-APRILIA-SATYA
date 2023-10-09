package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewCart {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for create new cart data")
    public String setAPIEndpointValidCreateNewCartPath() {
        return url + "carts";
    }

    @Step("I send request to create new cart data")
    public void sendRequestCreateNewCartData() {
        SerenityRest.given()
                .put(setAPIEndpointValidCreateNewCartPath());
    }

    @Step("I received status code 200 OK create cart data")
    public void receivedStatusCode200OKCreateCartData() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received id for new cart data")
    public void receivedIDCartDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Cart_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for create new cart data without the path")
    public String setAPIEndpointInvalidCreateCartUserWithoutPath() {
        return url; }

    @Step("I send request to create new cart data no path")
    public void sendRequestCreateNewCartDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidCreateCartUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to create new cart")
    public void receivedStatusCode404NotfoundInRequestCreateNewCart() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
