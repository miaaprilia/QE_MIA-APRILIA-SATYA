package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserByIDPositive;

public class GetUserByIDPositiveSteps {

    @Steps
    GetUserByIDPositive getUserByIDPositive;

    @Given("I set API endpoint valid for get user")
    public void setAPIEndpointPositive() {
        getUserByIDPositive.setAPIEndpointPositive();
    }

    @When("I send request to get user with valid ID")
    public void sendGetUserValidRequest() {
        getUserByIDPositive.sendGetUserValidRequest();
    }

    @Then("I received status code 200")
    public void receivedStatusCode200() {
        getUserByIDPositive.receivedStatusCode200();
    }

    @And("I received valid data for user")
    public void receivedValidUserData() {
        getUserByIDPositive.receivedValidUserData();
    }
}
