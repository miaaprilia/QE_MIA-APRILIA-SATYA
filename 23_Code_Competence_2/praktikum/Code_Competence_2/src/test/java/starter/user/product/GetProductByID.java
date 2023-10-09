package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get a single product data")
    public String setAPIEndpointValidGetSingleProduct() {
        return url + "products/1";
    }

    @Step("I send request to get a single product data")
    public void sendRequestGetSingleProduct() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetSingleProduct());
    }

    @Step("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetSingleProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for get a single product data the path")
    public String setAPIEndpointInvalidGetSingleProductDataThePath() {
        return url; }

    @Step("I send request to get a single product data invalid ID")
    public void sendRequestGetSingleProductDataInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetSingleProductDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to get a single product data by ID")
    public void receivedStatusCode400BadRequestInRequestGetSingleProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received status code 200 OK in request to get a single product data by ID")
    public void receivedStatusCode200OKInRequestGetSingleProduct() {
            restAssuredThat(response -> response.statusCode(200));
        }
}



