package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.GetAllUsersNegative;

public class GetAllUsersNegativeSteps {

    @Steps
    GetAllUsersNegative getAllUsersNegative;

    @Given("I set API endpoint for get all users negative")
    public void setAPIEndpointAGetAllUsersNegative() {
        getAllUsersNegative.setAPIEndpointAGetAllUsersNegative();
    }

    @When("I send request to get all user with blank field")
    public void sendRequestGetAllUserBlankField() {
        getAllUsersNegative.sendRequestGetAllUserBlankField();
    }

    @Then("I receive status code 200 OK")
    public void receiveStatusCode200Ok() {
        getAllUsersNegative.receiveStatusCode200Ok();
    }

    @And("I receive valid data for all user data")
    public void receiveValidUserData() {
        getAllUsersNegative.receiveValidUserData();
    }

}
