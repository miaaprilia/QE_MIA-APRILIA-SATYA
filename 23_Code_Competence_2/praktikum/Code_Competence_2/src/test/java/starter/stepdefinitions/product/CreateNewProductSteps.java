package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.CreateNewProduct;

public class CreateNewProductSteps {
    @Steps
    CreateNewProduct createNewProduct;

    @Given("I set API endpoint for create new product data")
    public void setAPIEndpointValidCreateNewProduct() {
        createNewProduct.setAPIEndpointValidCreateNewProduct();
    }

    @When("I send request to create new product data")
    public void sendRequestCreateNewProductData() {
        createNewProduct.sendRequestCreateNewProductData();
    }

    @Then("I received status code 200 OK create new product")
    public void receivedStatusCode200OKCreateNewProduct() {
        createNewProduct.receivedStatusCode200OKCreateNewProduct();
    }

    @And("I received id for new product data")
    public void receivedIDSingleNewProductData() {
        createNewProduct.receivedIDSingleNewProductData();
    }

    @Given("I set API endpoint for create new product data without the path")
    public void setAPIEndpointInvalidCreateNewProductWithoutPath() { createNewProduct.setAPIEndpointInvalidCreateNewProductWithoutPath();}

    @When("I send request to create new product data no path")
    public void sendRequestCreateNewProductDataNoPath() { createNewProduct.sendRequestCreateNewProductDataNoPath();}

    @Then("I received status code 404 Not Found in request to create new product")
    public void receivedStatusCode404NotFoundInRequestCreateNewProduct() { createNewProduct.receivedStatusCode404NotFoundInRequestCreateNewProduct();}
}

