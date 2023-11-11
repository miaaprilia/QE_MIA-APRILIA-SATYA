package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.UpdateUserByID;

public class UpdateUserByIDSteps {
    @Steps
    UpdateUserByID updateUserByID;

    @Given ("I set API endpoint valid for update user")
    public void setAPIEndpointValidUpdateUser() {
        updateUserByID.setAPIEndpointValidUpdateUser();
    }

    @When ("I send request to update user with valid path")
    public void sendRequestUpdateUserWithValidPath() {
        updateUserByID.sendRequestUpdateUserWithValidPath();
    }

    @Then ("I received status code 200 OK for a update user")
    public void receivedStatusCode200OKForUpdateUser() {
        updateUserByID.receivedStatusCode200OKForUpdateUser();
    }

    @Given("I set API endpoint for update user with an invalid path")
    public void setAPIEndpointUpdateUserByIDWithInvalidPath() {
        updateUserByID.setAPIEndpointUpdateUserByIDWithInvalidPath();
    }

    @When("I send request to update user with invalid path")
    public void sendRequestUpdateUserByIDWithInvalidPath() {
        updateUserByID.sendRequestUpdateUserByIDWithInvalidPath();
    }

    @Then("I received status code 404 Not Found for a update user")
    public void receivedStatusCode404NotFoundRequestUpdateUser() {
        updateUserByID.receivedStatusCode404NotFoundRequestUpdateUser();
    }
}
