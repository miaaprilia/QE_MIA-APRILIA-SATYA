package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.DeleteUserByID;


public class DeleteUserByIDSteps {
    @Steps
    DeleteUserByID deleteUserByID;

    @Given("I set API endpoint valid for delete user data")
    public void setAPIEndpointValidDeleteUserPath() {
        deleteUserByID.setAPIEndpointValidDeleteUserPath();
    }

    @When("I send request to delete user data")
    public void sendRequestDeleteUserData() {
        deleteUserByID.sendRequestDeleteUserData();
    }

    @Then("I received status code 200 OK delete user by ID")
    public void receivedStatusCode200OKDeleteUserByID() {
        deleteUserByID.receivedStatusCode200OKDeleteUserByID();
    }

    @And("I received detail user data response")
    public void receivedDetailUserDataResponse() {
        deleteUserByID.receivedDetailUserDataResponse();
    }

    @Given("I set API endpoint invalid for delete user data without the path")
    public void setAPIEndpointInvalidDeleteUserWithoutPath() { deleteUserByID.setAPIEndpointInvalidDeleteUserWithoutPath();
    }

    @When("I send request to delete user data no path")
    public void sendRequestDeleteUserDataNoPath() {
        deleteUserByID.sendRequestDeleteUserDataNoPath();
    }

    @Then("I received status code 404 Not Found in request to delete user by ID")
    public void receivedStatusCode404NotfoundInRequestDeleteUserByID() {
        deleteUserByID.receivedStatusCode404NotfoundInRequestDeleteUserByID();
    }

    @And("I received error message \"Cannot DELETE\" format HTML response")
    public void receivedErrorMessageCannotDELETEResponseUserByID() {
        deleteUserByID.receivedErrorMessageCannotDELETEResponseUserByID();
    }

    @Given("I set API endpoint invalid for delete user data the path")
    public void setAPIEndpointInvalidDeleteUserPath() {
        deleteUserByID.setAPIEndpointInvalidDeleteUserPath();
    }

    @When("I send request to delete user data invalid ID")
    public void sendRequestDeleteUserDataInvalidID() {
        deleteUserByID.sendRequestDeleteUserDataInvalidID();
    }

    @Then("I received status code 400 Bad Request in request to delete user data by ID")
    public void receivedStatusCode400BadRequestInRequestDeleteUserByID() {
        deleteUserByID.receivedStatusCode400BadRequestInRequestDeleteUserByID();
    }

    @And("I received error message \"user id should be provided\" response in request to delete data by ID")
    public void receivedErrorMessageSomethingWentWrong() {
        deleteUserByID.receivedErrorMessageSomethingWentWrong();
    }

    @Then("I received status code 200 OK in request to delete user data by ID")
    public void receivedStatusCode200OKInRequestDeleteSingleUser() {
        deleteUserByID.receivedStatusCode200OKInRequestDeleteSingleUser();
    }

    @And("I received message \"null\" response in request to delete data by ID")
    public void receivedErrorMessageNullResponseDeleteUserByID() {
        deleteUserByID.receivedErrorMessageNullResponseDeleteUserByID();
    }
}