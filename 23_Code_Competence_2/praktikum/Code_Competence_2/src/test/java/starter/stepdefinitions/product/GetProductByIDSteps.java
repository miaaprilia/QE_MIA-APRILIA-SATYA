package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductByID;

public class GetProductByIDSteps {
    @Steps
    GetProductByID getProductByID;

    @Given("I set API endpoint valid for get a single product data")
    public void setAPIEndpointValidGetSingleProduct() {
        getProductByID.setAPIEndpointValidGetSingleProduct();
    }

    @When("I send request to get a single product data")
    public void sendRequestGetSingleProduct() {
        getProductByID.sendRequestGetSingleProduct();
    }

    @Then("I received status code 200 OK get product by ID")
    public void receivedStatusCode200OKGetSingleProduct() {
        getProductByID.receivedStatusCode200OKGetSingleProduct();
    }

    @And("I received detail single product data response")
    public void receivedDetailSingleProductDataResponse() {
        getProductByID.receivedDetailSingleProductDataResponse();
    }

    @Given("I set API endpoint invalid for get a single product data the path")
    public void setAPIEndpointInvalidGetSingleProductDataThePath() { getProductByID.setAPIEndpointInvalidGetSingleProductDataThePath();}

    @When("I send request to get a single product data invalid ID")
    public void sendRequestGetSingleProductDataInvalidID() { getProductByID.sendRequestGetSingleProductDataInvalidID();}

    @Then("I received status code 400 Bad Request in request to get a single product data by ID")
    public void receivedStatusCode400BadRequestInRequestGetSingleProduct() { getProductByID.receivedStatusCode400BadRequestInRequestGetSingleProduct();}

    @Then("I received status code 200 OK in request to get a single product data by ID")
    public void receivedStatusCode200OKInRequestGetSingleProduct() { getProductByID.receivedStatusCode200OKInRequestGetSingleProduct();}
    }




