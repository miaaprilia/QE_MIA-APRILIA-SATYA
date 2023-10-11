package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.ProductPage;

public class CartSteps {

    @Steps
    ProductPage productPage;

    @When("I add item to the cart")
    public void addItemToTheCart() {
        Assertions.assertTrue(productPage.addToCartButtonIsDisplayed());
        productPage.clickAddToCartButton();
    }

    @Then("Item is added to the cart")
    public void itemIsAddedToTheCart() {
        Assertions.assertTrue(productPage.validateCartCounterIsDisplayed());
        Assertions.assertTrue(productPage.validateCartCounter());
    }
}
