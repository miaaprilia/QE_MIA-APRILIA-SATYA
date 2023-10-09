package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.GetAllUsers;

public class GetAllUsersSteps {
    @Steps
    GetAllUsers getAllUsers;

    @Given("I set API endpoint valid for get all user data")
    public void setAPIEndpointValidPath() {
        getAllUsers.setAPIEndpointValidPath();
    }

    @When("I send request to get all user data")
    public void sendRequestGetAllUserData() {
        getAllUsers.sendRequestGetAllUserData();
    }

    @Then("I received status code 200 OK get all user")
    public void receivedStatusCode200OK() {
        getAllUsers.receivedStatusCode200OK();
    }

    @And("I received list valid data for all data user response")
    public void receivedListValidDataAllUser() {
        getAllUsers.receivedListValidDataAllUser();
    }

    @Given("I set API endpoint for get all user data without the path")
    public void setAPIEndpointWithoutThePath() { getAllUsers.setAPIEndpointWithoutThePath();}

    @When("I send request to get all user data no path")
    public void sendRequestGetAllUserDataNoPath() { getAllUsers.sendRequestGetAllUserDataNoPath();}

    @Then("I received status code 200 OK in request to get all user data")
    public void receivedStatusCode200OKInRequestGetAllUser() { getAllUsers.receivedStatusCode200OKInRequestGetAllUser();}

    @And("I received format HTML response get all users")
    public void receivedFormatHTMLResponseInRequestGetAllUser() { getAllUsers.receivedFormatHTMLResponseInRequestGetAllUser();}
}
