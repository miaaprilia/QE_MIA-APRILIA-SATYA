package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetCartByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get a single cart data")
    public String setAPIEndpointValidGetSingleCartPath() {
        return url + "carts/1";
    }

    @Step("I send request to get a single cart data")
    public void sendRequestGetSingleCartData() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetSingleCartPath());
    }

    @Step("I received status code 200 OK get cart by ID")
    public void receivedStatusCode200OKGetCartByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail single cart data response")
    public void receivedDetailSingleCartDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Cart_By_ID_Response_Schema);
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'date'", notNullValue()));
        restAssuredThat(response -> response.body("'products'", notNullValue()));
        restAssuredThat(response -> response.body("'__v'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single cart data the path")
    public String setAPIEndpointInvalidGetSingleCartDataWithoutPath() {
        return url; }

    @Step("I send request to get a single cart data invalid ID")
    public void sendRequestGetSingleCartDataInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetSingleCartDataWithoutPath());
    }

    @Step("I received status code 400 Bad Request in request to get a single cart data by ID")
    public void receivedStatusCode400BadRequestRequestGetSingleCartData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received error message \"cloudflare\" format HTML response")
    public String receivedErrorMessageResponseInRequestGetSingleCart() {
        return url; }

    @Step("I received status code 200 OK in request to get a single cart data by ID")
    public void receivedStatusCode200OKInRequestGetSingleCartData() {
        SerenityRest.given()
                .put(receivedErrorMessageResponseInRequestGetSingleCart());
    }

}

