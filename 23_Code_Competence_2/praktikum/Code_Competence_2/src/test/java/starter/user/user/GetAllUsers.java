package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsers {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for get all user data")
    public String setAPIEndpointValidPath() {
        return url + "users";
    }

    @Step("I send request to get all user data")
    public void sendRequestGetAllUserData() {
        SerenityRest.given()
                .get(setAPIEndpointValidPath());
    }

    @Step("I received status code 200 OK get all user")
    public void receivedStatusCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received list valid data for all data user response")
    public void receivedListValidDataAllUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Users_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set API endpoint for get all user data without the path")
    public String setAPIEndpointWithoutThePath() { return url; }

    @Step("I send request to get all user data no path")
    public void sendRequestGetAllUserDataNoPath() {
        SerenityRest.given()
                .get(setAPIEndpointWithoutThePath());
    }

    @Step("I received status code 200 OK in request to get all user data")
    public void receivedStatusCode200OKInRequestGetAllUser() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received format HTML response get all userse")
    public void receivedFormatHTMLResponseInRequestGetAllUser() {
    }
}
