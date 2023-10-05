package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserByIDNegative;

public class GetUserByIDNegativeSteps {

    @Steps
    GetUserByIDNegative getUserByIDNegative;

    @Given("I set API endpoint invalid for get user")
    public void setAPIEndpointNegative() {
        getUserByIDNegative.setAPIEndpointNegative();
    }

    @When("I send request to get all user with blank field")
    public void sendGetUserInvalidRequest() {
        getUserByIDNegative.sendGetUserInvalidRequest();
    }

    @Then("I receive status code 200 OK")
    public void receivedStatusCode200Ok() {
        getUserByIDNegative.receivedStatusCode200Ok();
    }

    @And("I receive valid data for all user data")
    public void receivedInvalidUserData() {
        getUserByIDNegative.receivedInvalidUserData();
    }
}
