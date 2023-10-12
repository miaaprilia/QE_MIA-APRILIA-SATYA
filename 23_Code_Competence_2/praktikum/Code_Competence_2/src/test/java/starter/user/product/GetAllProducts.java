package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get all product")
    public String setAPIEndpointValidGetAllProduct() {
        return url + "products";
    }

    @Step("I send request to get all product")
    public void sendRequestGetAllProduct() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllProduct());
    }

    @Step("I received status code 200 OK get all products")
    public void receivedStatusCode200OKGetAllProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list valid data for all product response")
    public void receivedListValidDataAllProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Products_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all product without the path")
    public String setAPIEndpointInvalidGetAllProductWithoutPath() {
        return url; }

    @Step("I send request to get all product no path")
    public void sendRequestGetAllProductNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllProductWithoutPath());
    }

    @Step("I received status code 200 OK in request to get all product")
    public void receivedStatusCode200OKInRequestGetAllProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received format HTML response get all products")
    public void receivedFormatHTMLResponseGetAllProducts() {
    }
}


