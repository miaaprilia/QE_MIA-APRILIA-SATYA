package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.UpdateProductByID;

public class UpdateProductByIDSteps {
    @Steps
    UpdateProductByID updateProductByID;

    @Given("I set API endpoint valid for update a single product data")
    public void setAPIEndpointValidUpdateSingleProduct() {
        updateProductByID.setAPIEndpointValidUpdateSingleProduct();
    }

    @When("I send request to update a single product data")
    public void sendRequestUpdateSingleProduct() {
        updateProductByID.sendRequestUpdateSingleProduct();
    }

    @Then("I received status code 200 OK update product by ID")
    public void receivedStatusCode200OKUpdateSingleProduct() {
        updateProductByID.receivedStatusCode200OKUpdateSingleProduct();
    }

    @And("I received id update data product response")
    public void receivedIDUpdateDataProductResponse() {
        updateProductByID.receivedIDUpdateDataProductResponse();
    }

    @Given("I set API endpoint invalid for update product data without the path")
    public void setAPIEndpointInvalidUpdateSingleProductDataWithoutPath() { updateProductByID.setAPIEndpointInvalidUpdateSingleProductDataWithoutPath();}

    @When("I send request to update product data no path")
    public void sendRequestUpdateSingleProductDataNoPath() { updateProductByID.sendRequestUpdateSingleProductDataNoPath();}

    @Then("I received status code 404 Not Found in request to update product by ID")
    public void receivedStatusCode400BadRequestInRequestUpdateSingleProduct() { updateProductByID.receivedStatusCode400BadRequestInRequestUpdateSingleProduct();}

    @Given("I set API endpoint invalid for update a single product data the path")
    public void setAPIEndpointInvalidUpdateSingleProductDataThePath() { updateProductByID.setAPIEndpointInvalidUpdateSingleProductDataThePath();}

    @When("I send request to update a single product data invalid ID")
    public void sendRequestUpdateSingleProductDataInvalidID() { updateProductByID.sendRequestUpdateSingleProductDataInvalidID();}

    @Then("I received status code 400 Bad Request in request to update a single product data by ID")
    public void receivedStatusCode400BadRequestInRequestUpdateProductByID() { updateProductByID.receivedStatusCode400BadRequestInRequestUpdateProductByID();}
}
