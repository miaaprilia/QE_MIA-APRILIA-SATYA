package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.DeleteCartByID;

public class DeleteCartByIDSteps {
    @Steps
    DeleteCartByID deleteCartByID;

    @Given("I set API endpoint valid for delete a single cart data")
    public void setAPIEndpointValidDeleteSingleCartPath() {
        deleteCartByID.setAPIEndpointValidDeleteSingleCartPath();
    }

    @When("I send request to delete a single cart data")
    public void sendRequestDeleteSingleCartData() {
        deleteCartByID.sendRequestDeleteSingleCartData();
    }

    @Then("I received status code 200 OK delete cart by ID")
    public void receivedStatusCode200OKDeleteCartByID() {
        deleteCartByID.receivedStatusCode200OKDeleteCartByID();
    }

    @And("I received detail cart delete data response")
    public void receivedDetailCartDeleteDataResponse() {
        deleteCartByID.receivedDetailCartDeleteDataResponse();
    }

    @Given("I set API endpoint invalid for delete cart data without the path")
    public void setAPIEndpointInvalidDeleteCartDataWithoutPath() { deleteCartByID.setAPIEndpointInvalidDeleteCartDataWithoutPath();
    }

    @When("I send request to delete cart data no path")
    public void sendRequestDeleteCartDataNoPath() {
        deleteCartByID.sendRequestDeleteCartDataNoPath();
    }

    @Then("I received status code 404 Not Found in request to delete cart by ID")
    public void receivedStatusCode404NotfoundInRequestDeleteCartByID() {
        deleteCartByID.receivedStatusCode404NotfoundInRequestDeleteCartByID();
    }

    @Given("I set API endpoint invalid for delete a single cart data the path")
    public void setAPIEndpointInvalidDeleteSingleCartDataPath() { deleteCartByID.setAPIEndpointInvalidDeleteSingleCartDataPath();
    }

    @When("I send request to delete a single cart data invalid ID")
    public void sendRequestDeleteSingleCartDataInvalidID() {
        deleteCartByID.sendRequestDeleteSingleCartDataInvalidID();
    }

    @Then("I received status code 400 Bad Request in request to delete a single cart data by ID")
    public void receivedStatusCode400NotfoundInRequestDeleteSingleCartDataByID() {
        deleteCartByID.receivedStatusCode400NotfoundInRequestDeleteSingleCartDataByID();
    }

    @And("I received error message \"cart id should be provided\" response in request to delete cart data by ID")
    public void receivedErrorMessageInRequestDeleteCartByID() {
        deleteCartByID.receivedErrorMessageInRequestDeleteCartByID();
    }

    @Given("I set API endpoint invalid for delete cart data the path")
    public void setAPIEndpointInvalidDeleteCartDataThePath() { deleteCartByID.setAPIEndpointInvalidDeleteCartDataThePath();
    }

    @When("I send request to delete cart data invalid ID")
    public void sendRequestDeleteCartDataInvalidID() {
        deleteCartByID.sendRequestDeleteCartDataInvalidID();
    }

    @Then("I received status code 200 OK in request to delete cart data by ID")
    public void receivedStatusCode200OKInRequestDeleteCartByID() {
        deleteCartByID.receivedStatusCode200OKInRequestDeleteCartByID();
    }

    @And("I received message \"null\" response in request to delete cart data by ID")
    public void receivedErrorMessageNullResponseInRequestDeleteCartByID() {
        deleteCartByID.receivedErrorMessageNullResponseInRequestDeleteCartByID();
    }
}

