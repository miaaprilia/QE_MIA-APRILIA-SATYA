package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.UpdateCartByID;

public class UpdateCartByIDSteps {
    @Steps
    UpdateCartByID updateCartByID;

    @Given("I set API endpoint valid for update a single cart data")
    public void setAPIEndpointValidUpdateSingleCartDataPath() {
        updateCartByID.setAPIEndpointValidUpdateSingleCartDataPath();
    }

    @When("I send request to update a single cart data")
    public void sendRequestUpdateSingleCartData() {
        updateCartByID.sendRequestUpdateSingleCartData();
    }

    @Then("I received status code 200 OK update cart by ID")
    public void receivedStatusCode200OKUpdateCartByID() {
        updateCartByID.receivedStatusCode200OKUpdateCartByID();
    }

    @And("I received id update cart data response")
    public void receivedIdUpdateCartDataResponse() {
        updateCartByID.receivedIdUpdateCartDataResponse();
    }

    @Given("I set API endpoint invalid for update cart data without the path")
    public void setAPIEndpointInvalidUpdateCartDataWithoutThePath() { updateCartByID.setAPIEndpointInvalidUpdateCartDataWithoutThePath();
    }

    @When("I send request to update cart data no path")
    public void sendRequestUpdateCartDataNoPath() {
        updateCartByID.sendRequestUpdateCartDataNoPath();
    }

    @Then("I received status code 404 Not Found in request to update cart by ID")
    public void receivedStatusCode404NotFoundRequestUpdateCartByID() {
        updateCartByID.receivedStatusCode404NotFoundRequestUpdateCartByID();
    }

    @Given("I set API endpoint invalid for update a single cart data the path")
    public void setAPIEndpointInvalidUpdateSingleCartDataThePath() { updateCartByID.setAPIEndpointInvalidUpdateSingleCartDataThePath();
    }

    @When("I send request to update a single cart data invalid ID")
    public void sendRequestUpdateSingleCartDataInvalidUserID() {
        updateCartByID.sendRequestUpdateSingleCartDataInvalidUserID();
    }

    @Then("I received status code 400 Bad Request in request to update a single cart data by ID")
    public void receivedStatusCode400BadRequestRequestUpdateSingleCartData() {
        updateCartByID.receivedStatusCode400BadRequestRequestUpdateSingleCartData();
    }

    @And("I received error message \"something went wrong! check your sent data\" response in request to update cart data by ID")
    public void receivedErrorMessageResponseInRequestUpdateCartByID() {
        updateCartByID.receivedErrorMessageResponseInRequestUpdateCartByID();
    }
}

