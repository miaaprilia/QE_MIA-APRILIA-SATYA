package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.DeleteProductByID;

public class DeleteProductByIDSteps {
    @Steps
    DeleteProductByID deleteProductByID;

    @Given("I set API endpoint valid for delete a single product data")
    public void setAPIEndpointValidDeleteSingleProductData() {
        deleteProductByID.setAPIEndpointValidDeleteSingleProductData();
    }

    @When("I send request to delete a single product data")
    public void sendRequestDeleteSingleProductData() {
        deleteProductByID.sendRequestDeleteSingleProductData();
    }

    @Then("I received status code 200 OK delete product by ID")
    public void receivedStatusCode200OKDeleteProductByID() {
        deleteProductByID.receivedStatusCode200OKDeleteProductByID();
    }

    @And("I received detail product delete data response")
    public void receivedDetailProductDeleteDataResponse() {
        deleteProductByID.receivedDetailProductDeleteDataResponse();
    }

    @Given("I set API endpoint invalid for delete product data without the path")
    public void setAPIEndpointInvalidDeleteProductWithoutPath() { deleteProductByID.setAPIEndpointInvalidDeleteProductWithoutPath();}

    @When("I send request to delete product data no path")
    public void sendRequestDeleteProductDataNoPath() { deleteProductByID.sendRequestDeleteProductDataNoPath();}

    @Then("I received status code 404 Not Found in request to delete product by ID")
    public void receivedStatusCode404NotFoundInRequestDeleteProductByID() { deleteProductByID.receivedStatusCode404NotFoundInRequestDeleteProductByID();}

    @Given("I set API endpoint invalid for delete a single product data the path")
    public void setAPIEndpointValidDeleteSingleProductDataThePath() {
        deleteProductByID.setAPIEndpointValidDeleteSingleProductDataThePath();
    }

    @When("I send request to delete a single product data invalid ID")
    public void sendRequestDeleteSingleProductDataInvalidID() {
        deleteProductByID.sendRequestDeleteSingleProductDataInvalidID();
    }

    @Then("I received status code 400 Bad Request in request to delete a single product data by ID")
    public void receivedStatusCode400BadRequestDeleteSingleProduct() {
        deleteProductByID.receivedStatusCode400BadRequestDeleteSingleProduct();
    }

    @And("I received error message \"product id should be provided\" response in request to delete product data by ID")
    public void receivedErrorMessageResponseDeleteProductDataByID() {
        deleteProductByID.receivedErrorMessageResponseDeleteProductDataByID();
    }

}


