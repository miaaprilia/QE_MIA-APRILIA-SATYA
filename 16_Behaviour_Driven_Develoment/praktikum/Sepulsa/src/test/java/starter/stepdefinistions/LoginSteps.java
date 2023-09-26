package starter.stepdefinistions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void onTheLoginPage() {
    }
    @When("I not to fill in the login form")
    public void notFillLoginForm() {
    }
    @And("I tap the login button")
    public void tapLoginButton() {
    }
    @Then("I couldn't log in")
    public void userCouldntLogin() {
    }
    @And("I see login button is innactive")
    public void seeLoginButtonInnactive() {
    }
    @When("I enter invalid email")
    public void canEnterInvalidEmail() {
    }
    @And("I enter invalid password")
    public void canEnterInvalidPassword() {
    }
    @And("I see the message \"Try to remember your e-mail address mobile number and password again appears. Something is still wrong\"")
    public void seeMessageError() {
    }
    @And("I see the input form displays a warning icon")
    public void seeDisplayWarningIcon(){
    }
    @When("I enter a invalid email")
    public void canEnterInvalidemail(){
    }
    @And("I enter an valid password")
    public void canEnterValidPassword(){
    }
    @And("I see the message \"Try to remember your e-mail address mobile number and password again appears. Something is still wrong.\"")
    public void seeMessageErrorInvalidEmail(){
    }
    @When("I enter a valid email")
    public void canEnterValidEmail(){
    }
    @And("I enter an invalid password")
    public void canEnterInvalidpassword() {
    }
    @And("I enter n valid password")
    public void EnterValidPassword(){
    }
    @Then("I successfully login")
    public void SuccessfullyLogin(){
    }
    @And("I successfully redirected to home page")
    public void SuccessfullyRedirected(){
    }
}

