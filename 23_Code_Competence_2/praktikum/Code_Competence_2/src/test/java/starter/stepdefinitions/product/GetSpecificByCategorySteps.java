package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetSpecificByCategory;

public class GetSpecificByCategorySteps {
    @Steps
    GetSpecificByCategory getSpecificByCategory;

    @Given("I set API endpoint valid for get product specific data")
    public void setAPIEndpointValidGetProductSpecificData() {
        getSpecificByCategory.setAPIEndpointValidGetProductSpecificData();
    }

    @When("I send request to get product specific data")
    public void sendRequestGetProductSpecific() {
        getSpecificByCategory.sendRequestGetProductSpecific();
    }

    @Then("I received status code 200 OK get specific by category")
    public void receivedStatusCode200OKGetSpecificCategory() {
        getSpecificByCategory.receivedStatusCode200OKGetSpecificCategory();
    }

    @And("I received detail list product in specific category data response")
    public void receivedDetailListProductSpecificCategoryDataResponse() {
        getSpecificByCategory.receivedDetailListProductSpecificCategoryDataResponse();
    }

    @Given("I set API endpoint invalid for get product specific data the path")
    public void setAPIEndpointInvalidGetProductSpecificDataThePath() { getSpecificByCategory.setAPIEndpointInvalidGetProductSpecificDataThePath();}

    @When("I send request to get product specific data invalid category")
    public void sendRequestGetProductSpecificDataInvalidCategory() { getSpecificByCategory.sendRequestGetProductSpecificDataInvalidCategory();}

    @Then("I received status code 400 Bad Request in request to get product specific data by category")
    public void receivedStatusCode400BadRequestInRequestGetProductSpecific() { getSpecificByCategory.receivedStatusCode400BadRequestInRequestGetProductSpecific();}

    @Then("I received status code 200 OK in request to get product specific data by category")
    public void receivedStatusCode200OKInRequestGetProductSpecific() { getSpecificByCategory.receivedStatusCode200OKInRequestGetProductSpecific();}
}




