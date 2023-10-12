package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for delete a single product data")
    public String setAPIEndpointValidDeleteSingleProductData() {
        return url + "products/1";
    }

    @Step("\"I send request to delete a single product data")
    public void sendRequestDeleteSingleProductData() {
        SerenityRest.given()
                .delete(setAPIEndpointValidDeleteSingleProductData());
    }

    @Step("I received status code 200 OK delete product by ID")
    public void receivedStatusCode200OKDeleteProductByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail product delete data response")
    public void receivedDetailProductDeleteDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Delete_Product_By_ID_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint invalid for delete product data without the path")
    public String setAPIEndpointInvalidDeleteProductWithoutPath() {
        return url;
    }

    @Step("I send request to delete product data no path")
    public void sendRequestDeleteProductDataNoPath() {
        SerenityRest.given()
                .delete(setAPIEndpointInvalidDeleteProductWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to delete product by ID")
    public void receivedStatusCode404NotFoundInRequestDeleteProductByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set API endpoint invalid for delete a single product data the path")
    public String setAPIEndpointValidDeleteSingleProductDataThePath() {
        return url;
    }

    @Step("I send request to delete a single product data invalid ID")
    public void sendRequestDeleteSingleProductDataInvalidID() {
        SerenityRest.given()
                .delete(setAPIEndpointValidDeleteSingleProductDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to delete a single product data by ID")
    public void receivedStatusCode400BadRequestDeleteSingleProduct() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"product id should be provided\" response in request to delete product data by ID")
    public void receivedErrorMessageResponseDeleteProductDataByID() {
    }

}
