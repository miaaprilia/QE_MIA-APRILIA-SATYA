package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.GetAllUsersPositive;

public class GetAllUsersPositiveSteps {
    @Steps
    GetAllUsersPositive getAllUsersPositive;

    @Given("I set API endpoint for get all users positive")
    public void setAPIEndpointAGetAllUsersPositive() {
        getAllUsersPositive.setAPIEndpointAGetAllUsersPositive();
    }

    @When("I send request to get all user with valid path")
    public void sendRequestGetAllUserValidPath() {
        getAllUsersPositive.sendRequestGetAllUserValidPath();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getAllUsersPositive.receiveStatusCode200();
    }

    @And("I receive valid data for all data user")
    public void receiveValidData() {
        getAllUsersPositive.receiveValidData();
    }
}
