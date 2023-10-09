package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllProducts;

public class GetAllProductsSteps {
    @Steps
    GetAllProducts getAllProducts;

    @Given("I set API endpoint valid for get all product")
    public void setAPIEndpointValidGetAllProduct() {
        getAllProducts.setAPIEndpointValidGetAllProduct();
    }

    @When("I send request to get all product")
    public void sendRequestGetAllProduct() {
        getAllProducts.sendRequestGetAllProduct();
    }

    @Then("I received status code 200 OK get all products")
    public void receivedStatusCode200OKGetAllProduct() {
        getAllProducts.receivedStatusCode200OKGetAllProduct();
    }

    @And("I received list valid data for all product response")
    public void receivedListValidDataAllProduct() {
        getAllProducts.receivedListValidDataAllProduct();
    }

    @Given("I set API endpoint for get all product without the path")
    public void setAPIEndpointInvalidGetAllProductWithoutPath() { getAllProducts.setAPIEndpointInvalidGetAllProductWithoutPath();}

    @When("I send request to get all product no path")
    public void sendRequestGetAllProductNoPath() { getAllProducts.sendRequestGetAllProductNoPath();}

    @Then("I received status code 200 OK in request to get all product")
    public void receivedStatusCode200OKInRequestGetAllProduct() { getAllProducts.receivedStatusCode200OKInRequestGetAllProduct();}

    @And("I received format HTML response get all products")
    public void receivedFormatHTMLResponseGetAllProducts() {
        getAllProducts.receivedFormatHTMLResponseGetAllProducts();
    }

}

