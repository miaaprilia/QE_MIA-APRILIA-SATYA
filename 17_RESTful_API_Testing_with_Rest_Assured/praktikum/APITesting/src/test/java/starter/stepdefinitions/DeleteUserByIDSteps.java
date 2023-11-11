package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteUserByID;

public class DeleteUserByIDSteps {
    @Steps
    DeleteUserByID deleteUserByID;

    @Given ("I set API endpoint valid for delete user by ID")
    public void setAPIEndpointValidDeleteUserByID() {
        deleteUserByID.setAPIEndpointValidDeleteUserByID();
    }

    @When ("I send request to delete user with valid ID")
    public void sendRequestDeleteUserWithValidID() {
        deleteUserByID.sendRequestDeleteUserWithValidID();
    }

    @Then ("I received status code of 200 OK for a delete user")
    public void receivedStatusCode200OKForDeleteUser() {
        deleteUserByID.receivedStatusCode200OKForDeleteUser();
    }

    @Given("I set API endpoint for delete user by ID with an invalid path")
    public void setAPIEndpointDeletewUserByIDWithInvalidPath() {
        deleteUserByID.setAPIEndpointDeletewUserByIDWithInvalidPath();
    }

    @When("I send request to delete user by ID with an invalid path")
    public void sendRequestDeleteUserByIDWithInvalidPath() {
        deleteUserByID.sendRequestDeleteUserByIDWithInvalidPath();
    }

    @Then("I received status code of 404 Not Found for a delete user")
    public void receivedStatusCode404NotFoundRequestDeleteUser() {
        deleteUserByID.receivedStatusCode404NotFoundRequestDeleteUser();
    }
}
