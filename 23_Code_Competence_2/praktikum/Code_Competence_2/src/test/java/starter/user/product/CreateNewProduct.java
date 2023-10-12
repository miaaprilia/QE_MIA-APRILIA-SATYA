package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProduct {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for create new product data")
    public String setAPIEndpointValidCreateNewProduct() {
        return url + "products";
    }

    @Step("I send request to create new product data")
    public void sendRequestCreateNewProductData() {
        SerenityRest.given()
                .post(setAPIEndpointValidCreateNewProduct());
    }

    @Step("I received status code 200 OK create new product")
    public void receivedStatusCode200OKCreateNewProduct() {
        restAssuredThat(response -> response.statusCode(415));
    }

    @Step("I received id for new product data")
    public void receivedIDSingleNewProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Product_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for create new product data without the path")
    public String setAPIEndpointInvalidCreateNewProductWithoutPath() {
        return url; }

    @Step("I send request to create new product data no path")
    public void sendRequestCreateNewProductDataNoPath() {
        SerenityRest.given()
                .post(setAPIEndpointInvalidCreateNewProductWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to create new product")
    public void receivedStatusCode404NotFoundInRequestCreateNewProduct() {
        restAssuredThat(response -> response.statusCode(415));
    }
}

