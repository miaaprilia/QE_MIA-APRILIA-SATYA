package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCarts {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get all cart data")
    public String setAPIEndpointValidGetAllCartPath() {
        return url + "carts";
    }

    @Step("I send request to get all cart data")
    public void sendRequestGetAllCartData() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllCartPath());
    }

    @Step("I received status code 200 OK get all cart data")
    public void receivedStatusCode200OKGetAllCartData() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list valid data for all data cart response")
    public void receivedListAllDataCartResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Carts_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all cart data without the path")
    public String setAPIEndpointInvalidGetAllCartDataWithoutPath() {
        return url; }

    @Step("I send request to get all cart data no path")
    public void sendRequestGetAllCartDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidGetAllCartDataWithoutPath());
    }

    @Step("I received status code 200 OK in request to get all cart data")
    public void receivedStatusCode200OKInRequestGetAllCartData() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received format HTML response get all carts")
    public void receivedFormatHTMLResponseInRequestGetAllCart() {
    }


}

