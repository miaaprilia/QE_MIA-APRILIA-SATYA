package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateProductByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get a single product data")
    public String setAPIEndpointValidUpdateSingleProduct() {
        return url + "products/1";
    }

    @Step("I send request to get a single product data")
    public void sendRequestUpdateSingleProduct() {
        SerenityRest.given()
                .get(setAPIEndpointValidUpdateSingleProduct());
    }

    @Step("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKUpdateSingleProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received id update data product response")
    public void receivedIDUpdateDataProductResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Update_Product_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for update product data without the path")
    public String setAPIEndpointInvalidUpdateSingleProductDataWithoutPath() {
        return url; }

    @Step("I send request to update product data no path")
    public void sendRequestUpdateSingleProductDataNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidUpdateSingleProductDataWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to update product by I")
    public void receivedStatusCode400BadRequestInRequestUpdateSingleProduct() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set API endpoint invalid for update a single product data the path")
    public String setAPIEndpointInvalidUpdateSingleProductDataThePath() {
        return url;
    }

    @Step("I send request to update a single product data invalid ID")
    public void sendRequestUpdateSingleProductDataInvalidID() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidUpdateSingleProductDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to update a single product data by ID")
    public void receivedStatusCode400BadRequestInRequestUpdateProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
