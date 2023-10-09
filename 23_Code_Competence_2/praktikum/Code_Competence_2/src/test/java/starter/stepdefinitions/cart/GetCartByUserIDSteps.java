package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.GetCartByUserID;

public class GetCartByUserIDSteps {
    @Steps
    GetCartByUserID getCartByUserID;

    @Given("I set API endpoint valid for get cart specific data")
    public void setAPIEndpointValidGetCartSpecificDataPath() {
        getCartByUserID.setAPIEndpointValidGetCartSpecificDataPath();
    }

    @When("I send request to get cart specific data")
    public void sendRequestGetCartSpecificData() {
        getCartByUserID.sendRequestGetCartSpecificData();
    }

    @Then("I received status code 200 OK get cart by user ID")
    public void receivedStatusCode200OKGetCartByUserID() {
        getCartByUserID.receivedStatusCode200OKGetCartByUserID();
    }

    @And("I received detail list cart in specific user id data response")
    public void receivedDetailListCartSpecificUserIDDataResponse() {
        getCartByUserID.receivedDetailListCartSpecificUserIDDataResponse();
    }

    @Given("I set API endpoint invalid for get cart specific data the path")
    public void setAPIEndpointInvalidGetCartSpecificDataThePath() { getCartByUserID.setAPIEndpointInvalidGetCartSpecificDataThePath();
    }

    @When("I send request to get cart specific data invalid User ID")
    public void sendRequestGetCartSpecificDataInvalidUserID() {
        getCartByUserID.sendRequestGetCartSpecificDataInvalidUserID();
    }

    @Then("I received status code 400 Bad Request in request to get cart specific data by User ID")
    public void receivedStatusCode400BadRequestRequestGetCartSpecificData() {
        getCartByUserID.receivedStatusCode400BadRequestRequestGetCartSpecificData();
    }

    @And("I received error message \"cart id should be provided\" response in request to get cart data by User ID")
    public void receivedErrorMessageResponseInRequestGetCartByUserID() {
        getCartByUserID.receivedErrorMessageResponseInRequestGetCartByUserID();
    }

    @Then("I received status code 200 OK in request to get cart specific data by User ID")
    public void receivedStatusCode200OKInRequestGetCartSpecificData() {
        getCartByUserID.receivedStatusCode200OKInRequestGetCartSpecificData();
    }
}
