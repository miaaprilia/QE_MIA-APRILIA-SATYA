package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.CreateUser;

public class CreateUserSteps {
    @Steps
    CreateUser createUser;

    @Given ("I set API endpoint valid for create user")
    public void setAPIEndpointValidCreateUser() {
        createUser.setAPIEndpointValidCreateUser();
    }

    @When ("I send request to create user with valid path")
    public void sendRequestCreateUserWithValidPath() {
        createUser.sendRequestCreateUserWithValidPath();
    }

    @Then ("I received status code 201 Created for a create new user")
    public void receivedStatusCode201CreatedForCreateNewUser() {
        createUser.receivedStatusCode201CreatedForCreateNewUser();
    }

    @Given("I set API endpoint for create new user with an invalid path")
    public void setAPIEndpointCreateNewUserWithInvalidPath() {
        createUser.setAPIEndpointCreateNewUserWithInvalidPath();
    }

    @When("I send request to create user with invalid path")
    public void sendRequestCreateUserWithInvalidPath() {
        createUser.sendRequestCreateUserWithInvalidPath();
    }

    @Then("I received status code 404 Not Found for a create new user")
    public void receivedStatusCode404NotRequestCreateNewUser() {
        createUser.receivedStatusCode404NotRequestCreateNewUser();
    }
}
