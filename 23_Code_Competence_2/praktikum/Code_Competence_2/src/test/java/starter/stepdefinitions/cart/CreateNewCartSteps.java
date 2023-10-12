package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.CreateNewCart;

public class CreateNewCartSteps {
    @Steps
    CreateNewCart createNewCart;

    @Given("I set API endpoint for create new cart data")
    public void setAPIEndpointValidCreateNewCartPath() {
        createNewCart.setAPIEndpointValidCreateNewCartPath();
    }

    @When("I send request to create new cart data")
    public void sendRequestCreateNewCartData() {
        createNewCart.sendRequestCreateNewCartData();
    }

    @Then("I received status code 200 OK create cart data")
    public void receivedStatusCode200OKCreateCartData() {
        createNewCart.receivedStatusCode200OKCreateCartData();
    }

    @And("I received id for new cart data")
    public void receivedIDCartDataResponse() {
        createNewCart.receivedIDCartDataResponse();
    }

    @Given("I set API endpoint for create new cart data without the path")
    public void setAPIEndpointInvalidCreateCartUserWithoutPath() { createNewCart.setAPIEndpointInvalidCreateCartUserWithoutPath();
    }

    @When("I send request to create new cart data no path")
    public void sendRequestCreateNewCartDataNoPath() {
        createNewCart.sendRequestCreateNewCartDataNoPath();
    }

    @Then("I received status code 404 Not Found in request to create new cart")
    public void receivedStatusCode404NotfoundInRequestCreateNewCart() {
        createNewCart.receivedStatusCode404NotfoundInRequestCreateNewCart();
    }
}
