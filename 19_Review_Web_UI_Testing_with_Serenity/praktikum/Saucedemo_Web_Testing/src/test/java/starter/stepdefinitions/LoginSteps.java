package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class LoginSteps {

    @Steps
        LoginPage loginPage;

    @Steps
        ProductPage productPage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com/");
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void inputValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the product page")
    public void onTheProductPage() {
        Assertions.assertTrue(productPage.validateOnHomePage());
    }

    @When("I dont fill in username field")
    public void dontFillInUseranameField() { loginPage.inputUsername("");
    }

    @And("I dont fill in password field")
    public void dontFillInPasswordField() {
        loginPage.inputPassword("");
    }

    @Then("I see validation message error \"Username & Password is required\"")
    public void validationMessageErrorIdRequired() { loginPage.validateOnLoginPage(); }

    @When("I input invalid username")
    public void inputInvalidUsername() {
        loginPage.inputUsername("standard");
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("secret");
    }

    @Then("I see validation message error \"Username & Password do not match any user in this service\"")
    public void validationMessageErrorDoNotMatch() { loginPage.validateOnLoginPage(); }
}
