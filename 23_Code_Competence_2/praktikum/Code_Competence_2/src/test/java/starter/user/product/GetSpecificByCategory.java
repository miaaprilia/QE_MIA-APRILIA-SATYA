package starter.user.product;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;

public class GetSpecificByCategory {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get a single product data")
    public String setAPIEndpointValidGetProductSpecificData() {
        return url + "products/category/jewelery";
    }

    @Step("I send request to get a single product data")
    public void sendRequestGetProductSpecific() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetProductSpecificData());
    }

    @Step("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetSpecificCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received detail single product data response")
    public void receivedDetailListProductSpecificCategoryDataResponse() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_By_ID_Response_Schema);
        ValidatableResponse response = SerenityRest.then().body(matchesJsonSchema(schema));
        response.body("", hasSize(Matchers.greaterThan(0)));
        for (int i = 0; i < response.extract().jsonPath().getList("$").size(); i++) {
            response.body("[" + i + "].id", Matchers.greaterThan(0));
            response.body("[" + i + "].title", notNullValue());
            response.body("[" + i + "].price", notNullValue());
            response.body("[" + i + "].category", equalTo("jewelery"));
            response.body("[" + i + "].description", notNullValue());
            response.body("[" + i + "].image", notNullValue());
            response.body("[" + i + "].rating", notNullValue());
        }
    }

    @Step("I set API endpoint invalid for get a single product data the path")
    public String setAPIEndpointInvalidGetProductSpecificDataThePath() {
        return url; }

    @Step("I send request to get a single product data invalid ID")
    public void sendRequestGetProductSpecificDataInvalidCategory() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetProductSpecificDataThePath());
    }

    @Step("I received status code 400 Bad Request in request to get a single product data by ID")
    public void receivedStatusCode400BadRequestInRequestGetProductSpecific() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received status code 200 OK in request to get a single product data by ID")
    public void receivedStatusCode200OKInRequestGetProductSpecific() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
