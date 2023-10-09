package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.GetCartByID;

public class GetCartByIDSteps {
    @Steps
    GetCartByID getCartByID;

    @Given("I set API endpoint valid for get a single cart data")
    public void setAPIEndpointValidGetSingleCartPath() {
        getCartByID.setAPIEndpointValidGetSingleCartPath();
    }

    @When("I send request to get a single cart data")
    public void sendRequestGetSingleCartData() {
        getCartByID.sendRequestGetSingleCartData();
    }

    @Then("I received status code 200 OK get cart by ID")
    public void receivedStatusCode200OKGetCartByID() {
        getCartByID.receivedStatusCode200OKGetCartByID();
    }

    @And("I received detail single cart data response")
    public void receivedDetailSingleCartDataResponse() {
        getCartByID.receivedDetailSingleCartDataResponse();
    }

    @Given("I set API endpoint invalid for get a single cart data the path")
    public void setAPIEndpointInvalidGetSingleCartDataWithoutPath() { getCartByID.setAPIEndpointInvalidGetSingleCartDataWithoutPath();
    }

    @When("I send request to get a single cart data invalid ID")
    public void sendRequestGetSingleCartDataInvalidID() {
        getCartByID.sendRequestGetSingleCartDataInvalidID();
    }

    @Then("I received status code 400 Bad Request in request to get a single cart data by ID")
    public void receivedStatusCode400BadRequestRequestGetSingleCartData() {
        getCartByID.receivedStatusCode400BadRequestRequestGetSingleCartData();
    }

    @And("I received error message \"cloudflare\" format HTML response")
    public void receivedErrorMessageResponseInRequestGetSingleCart() {
        getCartByID.receivedErrorMessageResponseInRequestGetSingleCart();
    }

    @Then("I received status code 200 OK in request to get a single cart data by ID")
    public void receivedStatusCode200OKInRequestGetSingleCartData() {
        getCartByID.receivedStatusCode200OKInRequestGetSingleCartData();
    }
}
