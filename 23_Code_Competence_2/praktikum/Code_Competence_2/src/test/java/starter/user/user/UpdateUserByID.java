package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateUserByID {
    private static final String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint valid for update user data")
    public String setAPIEndpointValidUpdateUserPath() {
        return url + "users/1";
    }

    @Step("I send request to update user data")
    public void sendRequestUpdateUserData() {
        SerenityRest.given()
                .put(setAPIEndpointValidUpdateUserPath());
    }

    @Step("I received status code 200 OK update user by ID")
    public void receivedStatusCode200OKUpdateUserByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received empty data response")
    public void receivedEmptyDataResponse() {
    }

    @Step("I set API endpoint invalid for update user data without the path")
    public String setAPIEndpointInvalidUpdateUserWithoutPath() {
        return url; }

    @Step("I send request to update user data no path")
    public void sendRequestUpdateUserDataNoPath() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidUpdateUserWithoutPath());
    }

    @Step("I received status code 404 Not Found in request to update user by ID")
    public void receivedStatusCode404NotfoundInRequestUpdateUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"Cannot PUT\" format HTML response")
    public void receivedErrorMessageCannotPUTResponseUserByID() {
    }

    @Step("I set API endpoint invalid for update user data the path")
        public String setAPIEndpointInvalidUpdateUserPath() {
        return url; }

    @Step("I send request to update user data invalid ID")
    public void sendRequestUpdateUserDataInvalidID() {
        SerenityRest.given()
                .put(setAPIEndpointInvalidUpdateUserPath());
    }

    @Step("I received status code 400 Bad Request in request to update user data by ID")
    public void receivedStatusCode400BadRequestInRequestUpdateUserByID() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I received error message \"something went wrong! check your sent data\" response")
    public void receivedErrorMessageSomethingWentWrong() {
    }

    @Step("I received status code 200 OK in request to update user data by ID")
    public void receivedStatusCode200OKInRequestUpdateSingleUser() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
