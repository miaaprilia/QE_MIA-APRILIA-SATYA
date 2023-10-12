package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.GetUserByID;

public class GetUserByIDSteps {
    @Steps
    GetUserByID getUsersByID;

    @Given("I set API endpoint valid for get a single user data")
    public void setAPIEndpointValidSingleUserPath() {
        getUsersByID.setAPIEndpointValidSingleUserPath();
    }

    @When("I send request to get a single user data")
    public void sendRequestGetSingleUserData() {
        getUsersByID.sendRequestGetSingleUserData();
    }

    @Then("I received status code 200 OK get user by ID")
    public void receivedStatusCode200OKGetUserByID() {
        getUsersByID.receivedStatusCode200OKGetUserByID();
    }

    @And("I received detail single user data response")
    public void receivedDetailValidSingleDataUser() {
        getUsersByID.receivedDetailValidSingleDataUser();
    }

    @Given("I set API endpoint invalid for get a single user data the path")
    public void setAPIEndpointInvalidSingleUserPath() { getUsersByID.setAPIEndpointInvalidSingleUserPath();}

    @When("I send request to get a single user data invalid ID")
    public void sendRequestGetSingleUserInvalidID() { getUsersByID.sendRequestGetSingleUserInvalidID();}

    @Then("I received status code 400 Bad Request in request to get a single user data by ID")
    public void receivedStatusCode400BadRequestInGetSingleUser() { getUsersByID.receivedStatusCode400BadRequestInGetSingleUser();}

    @And("I received error message \"user id should be provided\" response")
    public void receivedErrorMessageResponseGetUserByID() { getUsersByID.receivedErrorMessageResponseGetUserByID();}

    @Then("I received status code 200 OK in request to get a single user data by ID")
    public void receivedStatusCode200OKInRequestGetSingleUser() { getUsersByID.receivedStatusCode200OKInRequestGetSingleUser();}

    @And("I received message \"null\" response")
    public void receivedMessageNullResponse() { getUsersByID.receivedMessageNullResponse();}
}
