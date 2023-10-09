package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get all category")
    public String setAPIEndpointValidGetAllCategory() {
        return url + "products/categories";
    }

    @Step("I send request to get all category")
    public void sendRequestGetAllCategory() {
        SerenityRest.given()
                .get(setAPIEndpointValidGetAllCategory());
    }

    @Step("I received status code 200 OK get all categories")
    public void receivedStatusCode200OKGetAllCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list valid data for all category response")
    public void receivedListValidDataAllCategory() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Categories_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all category without the path")
    public String setAPIEndpointInvalidGetAllCategoryWithoutPath() {
        return url; }

    @Step("I send request to get all category no path")
    public void sendRequestGetAllCategoryNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointInvalidGetAllCategoryWithoutPath());
    }

    @Step("I received status code 200 OK in request to get all category")
    public void receivedStatusCode200OKInRequestGetAllCategory() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received format HTML response get all Categories")
    public void receivedFormatHTMLResponseGetAllCategories() {
    }
}


