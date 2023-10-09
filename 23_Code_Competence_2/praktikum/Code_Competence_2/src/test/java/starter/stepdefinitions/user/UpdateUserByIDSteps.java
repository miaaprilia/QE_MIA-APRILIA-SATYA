package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.UpdateUserByID;

public class UpdateUserByIDSteps {
    @Steps
    UpdateUserByID updateUserByID;

    @Given("I set API endpoint valid for update user data")
    public void setAPIEndpointValidUpdateUserPath() {
        updateUserByID.setAPIEndpointValidUpdateUserPath();
    }

    @When("I send request to update user data")
    public void sendRequestUpdateUserData() {
        updateUserByID.sendRequestUpdateUserData();
    }

    @Then("I received status code 200 OK update user by ID")
    public void receivedStatusCode200OKUpdateUserByID() {
        updateUserByID.receivedStatusCode200OKUpdateUserByID();
    }

    @And("I received empty data response")
    public void receivedEmptyDataResponse() {
        updateUserByID.receivedEmptyDataResponse();
    }

    @Given("I set API endpoint invalid for update user data without the path")
    public void setAPIEndpointInvalidUpdateUserWithoutPath() { updateUserByID.setAPIEndpointInvalidUpdateUserWithoutPath();}

    @When("I send request to update user data no path")
    public void sendRequestUpdateUserDataNoPath() { updateUserByID.sendRequestUpdateUserDataNoPath();}

    @Then("I received status code 404 Not Found in request to update user by ID")
    public void receivedStatusCode404NotfoundInRequestUpdateUserByID() { updateUserByID.receivedStatusCode404NotfoundInRequestUpdateUserByID();}

    @And("I received error message \"Cannot PUT\" format HTML response")
    public void receivedErrorMessageCannotPUTResponseUserByID() { updateUserByID.receivedErrorMessageCannotPUTResponseUserByID();}

    @Given("I set API endpoint invalid for update user data the path")
    public void setAPIEndpointInvalidUpdateUserPath() { updateUserByID.setAPIEndpointInvalidUpdateUserPath();}

    @When("I send request to update user data invalid ID")
    public void sendRequestUpdateUserDataInvalidID() { updateUserByID.sendRequestUpdateUserDataInvalidID();}

    @Then("I received status code 400 Bad Request in request to update user data by ID")
    public void receivedStatusCode400BadRequestInRequestUpdateUserByID() { updateUserByID.receivedStatusCode400BadRequestInRequestUpdateUserByID();}

    @And("I received error message \"something went wrong! check your sent data\" response")
    public void receivedErrorMessageSomethingWentWrong() { updateUserByID.receivedErrorMessageSomethingWentWrong();}

    @Then("I received status code 200 OK in request to update user data by ID")
    public void receivedStatusCode200OKInRequestUpdateSingleUser() { updateUserByID.receivedStatusCode200OKInRequestUpdateSingleUser();}
}