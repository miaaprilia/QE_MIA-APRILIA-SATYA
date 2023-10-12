package starter.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.login.LoginUser;

public class LoginUserSteps {
    @Steps
    LoginUser loginUser;

    @Given("I set API endpoint valid for login user")
    public void setAPIEndpointValidLoginUserPath() {
        loginUser.setAPIEndpointValidLoginUserPath();
    }

    @When("I enter a valid email")
    public void enterValidEmail() {
        loginUser.enterValidEmail();
    }

    @And("I enter a valid password")
    public void enterValidPassword() {
        loginUser.enterValidPassword();
    }

    @And("I send request to login user")
    public void sendRequestValidLoginUser() {
        loginUser.sendRequestValidLoginUser();
    }

    @Then("I received status code 200 OK login user")
    public void receivedStatusCode200OKLoginUser() { loginUser.receivedStatusCode200OKLoginUser();}

    @And("I received token login user data response")
    public void receivedTokenLoginUserDataResponse() { loginUser.receivedTokenLoginUserDataResponse();}

    @Given("I set API endpoint invalid for login user without the path")
    public void setAPIEndpointInvalidLoginUserWithoutPath() { loginUser.setAPIEndpointInvalidLoginUserWithoutPath();}

    @When("I send request to login user no path")
    public void sendRequestLoginUserNoPath() { loginUser.sendRequestLoginUserNoPath();}

    @Then("I received status code 404 Not Found in request to login user")
    public void receivedStatusCode404NotFoundInRequestLoginUser() { loginUser.receivedStatusCode404NotFoundInRequestLoginUser();}

    @When("I am not to fill in the login request")
    public void notToFillInTheLoginRequest() { loginUser.notToFillInTheLoginRequest();}

    @And("I sent a request to the login user to fill in the username & password")
    public void sentRequestLoginUserToFillIn() { loginUser.sentRequestLoginUserToFillIn();}

    @Then("I received status code 400 Bad Request in request to login user")
    public void receivedStatusCode400BadRequestInRequestLoginUser() { loginUser.receivedStatusCode400BadRequestInRequestLoginUser();}

    @And("I received error message \"username and password are not provided in JSON format\" response")
    public void receivedErrorMessageJSONFormat() { loginUser.receivedErrorMessageJSONFormat();}

    @When("I fill in an invalid username")
    public void fillInAnInvalidUsername() { loginUser.fillInAnInvalidUsername();}

    @And("I filled in a valid password")
    public void filledInAValidPassword() { loginUser.filledInAValidPassword();}

    @And("I sent a request the login user")
    public void sendRequestInvalidLoginUser() { loginUser.sendRequestInvalidLoginUser();}

    @Then("I received status code 401 Unauthorized in request login user")
    public void receivedStatusCode401UnauthorizedRequestLoginUser() { loginUser.receivedStatusCode401UnauthorizedRequestLoginUser();}

    @And("I received an error message \"username or password is incorrect\" response")
    public void receivedErrorMessageIncorectCredentialsResponse() { loginUser.receivedErrorMessageIncorectCredentialsResponse();}

    @When("I filled in a valid username")
    public void filledInAValidUsername() { loginUser.filledInAValidUsername();}

    @And("I filled in an invalid password")
    public void filledInAnInvalidPassword() { loginUser.filledInAnInvalidPassword();}
}
