package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.user.GetUserByID;

public class GetUserByIDSteps {

    @Steps
    GetUserByID getUserByID;

    @Given("I set API endpoint valid for get user by ID")
    public void setAPIEndpointValidGetUserByID() {
        getUserByID.setAPIEndpointValidGetUserByID();
    }

    @When("I send request to get user with valid ID")
    public void sendRequestGetUserWithValidID() {
        getUserByID.sendRequestGetUserWithValidID();
    }

    @Then("I received status code of 200 OK for a get user by ID")
    public void receivedStatusCode200OKGetUserByID() {
        getUserByID.receivedStatusCode200OKGetUserByID();
    }

    @And("I received data get user by ID response")
    public void receivedDataGetUserByIDResponse() {
        getUserByID.receivedDataGetUserByIDResponse();
    }

    @Given("I set API endpoint invalid for get a single user data the path character")
    public void setAPIEndpointInvalidGetSingleUserDataThePathCharacter() {
        getUserByID.setAPIEndpointInvalidGetSingleUserDataThePathCharacter();
    }

    @When("I send request to get a single user data invalid ID character")
    public void sendRequestGetSingleUserDataInvalidIDCharacter() {
        getUserByID.sendRequestGetSingleUserDataInvalidIDCharacter();
    }

    @Then("I received status code 404 Not Request in request to get user by ID")
    public void receivedStatusCode404NotRequestGetUserByID() {
        getUserByID.receivedStatusCode404NotRequestGetUserByID();
    }

    @Given("I set API endpoint invalid for get a single user data the path exist in the database")
    public void setAPIEndpointInvalidGetSingleUserDataThePathExistInTheDatabase() {
        getUserByID.setAPIEndpointInvalidGetSingleUserDataThePathExistInTheDatabase();
    }

    @When("I send request to get a single user data invalid ID exist in the database")
    public void sendRequestGetSingleUserDataInvalidIDExistInTheDatabase() {
        getUserByID.sendRequestGetSingleUserDataInvalidIDExistInTheDatabase();
    }
}
