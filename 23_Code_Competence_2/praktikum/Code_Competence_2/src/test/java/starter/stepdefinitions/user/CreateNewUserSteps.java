package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.CreateNewUser;

public class CreateNewUserSteps {
    @Steps
    CreateNewUser createNewUser;

    @Given("I set API endpoint for create new user data")
    public void setAPIEndpointValidCreateNewUser() {
        createNewUser.setAPIEndpointValidCreateNewUser();
    }

    @When("I send request to create new user data")
    public void sendRequestPostSingleUserData() {
        createNewUser.sendRequestPostSingleUserData();
    }

    @Then("I received status code 200 OK create user by ID")
    public void receivedStatusCode200OKPostUserByID() {
        createNewUser.receivedStatusCode200OKPostUserByID();
    }

    @And("I received id for new user data")
    public void receivedIDSingleNewUserData() {
        createNewUser.receivedIDSingleNewUserData();
    }

    @Given("I set API endpoint for create new user data without the path")
    public void setAPIEndpointInvalidCreateNewUserWithoutPath() { createNewUser.setAPIEndpointInvalidCreateNewUserWithoutPath();}

    @When("I send request to create new user data no path")
    public void sendRequestPostSingleUserDataNoPath() { createNewUser.sendRequestPostSingleUserDataNoPath();}

    @Then("I received status code 404 Not Found in request to create new user")
    public void receivedStatusCode404NotFoundInPostSingleUser() { createNewUser.receivedStatusCode404NotFoundInPostSingleUser();}

    @And("I received error message \"Cannot POST\" format HTML response")
    public void receivedErrorMessageCannotPostResponseUserByID() { createNewUser.receivedErrorMessageCannotPostResponseUserByID();}
}
