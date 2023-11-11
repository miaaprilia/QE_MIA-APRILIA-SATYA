package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllUsers;

public class GetAllUsersSteps {
    @Steps
    GetAllUsers getAllUsers;

    @Given ("I set API endpoint valid for get all users")
    public void setAPIEndpointValidGetAllUsers() {
        getAllUsers.setAPIEndpointValidGetAllUsers();
    }

    @When ("I send request to get all user with valid path")
    public void sendRequestGetAllUserWithValidPath() {
        getAllUsers.sendRequestGetAllUserWithValidPath();
    }

    @Then ("I received status code of 200 OK for a get all users")
    public void receivedStatusCode200OKGetAllUsers() {
        getAllUsers.receivedStatusCode200OKGetAllUsers();
    }

    @And ("I received list data get all users response")
    public void receivedListDataGetAllUsersResponse() {
        getAllUsers.receivedListDataGetAllUsersResponse();
    }

    @Given("I set API endpoint for get all users with an invalid path")
    public void setAPIEndpointGetAllUsersWithInvalidPath() {
        getAllUsers.setAPIEndpointGetAllUsersWithInvalidPath();
    }

    @When("I send request to get all users with an invalid path")
    public void sendRequestGetAllUsersWithInvalidPath() {
        getAllUsers.sendRequestGetAllUsersWithInvalidPath();
    }

    @Then("I received status code 404 Not Found in request to get all users")
    public void receivedStatusCode404NotRequestGetAllUsers() {
        getAllUsers.receivedStatusCode404NotRequestGetAllUsers();
    }
}
