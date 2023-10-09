package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.GetAllCarts;

public class GetAllCartsSteps {
    @Steps
    GetAllCarts getAllCarts;

    @Given("I set API endpoint valid for get all cart data")
    public void setAPIEndpointValidGetAllCartPath() {
        getAllCarts.setAPIEndpointValidGetAllCartPath();
    }

    @When("I send request to get all cart data")
    public void sendRequestGetAllCartData() {
        getAllCarts.sendRequestGetAllCartData();
    }

    @Then("I received status code 200 OK get all cart data")
    public void receivedStatusCode200OKGetAllCartData() {
        getAllCarts.receivedStatusCode200OKGetAllCartData();
    }

    @And("I received list valid data for all data cart response")
    public void receivedListAllDataCartResponse() {
        getAllCarts.receivedListAllDataCartResponse();
    }

    @Given("I set API endpoint for get all cart data without the path")
    public void setAPIEndpointInvalidGetAllCartDataWithoutPath() { getAllCarts.setAPIEndpointInvalidGetAllCartDataWithoutPath();
    }

    @When("I send request to get all cart data no path")
    public void sendRequestGetAllCartDataNoPath() {
        getAllCarts.sendRequestGetAllCartDataNoPath();
    }

    @Then("I received status code 200 OK in request to get all cart data")
    public void receivedStatusCode200OKInRequestGetAllCartData() {
        getAllCarts.receivedStatusCode200OKInRequestGetAllCartData();
    }

    @And("I received format HTML response get all carts")
    public void receivedFormatHTMLResponseInRequestGetAllCart() {
        getAllCarts.receivedFormatHTMLResponseInRequestGetAllCart();
    }
}
