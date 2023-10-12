package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllCategories;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategories getAllCategories;

    @Given("I set API endpoint valid for get all category")
    public void setAPIEndpointValidGetAllCategory() {
        getAllCategories.setAPIEndpointValidGetAllCategory();
    }

    @When("I send request to get all category")
    public void sendRequestGetAllCategory() {
        getAllCategories.sendRequestGetAllCategory();
    }

    @Then("I received status code 200 OK get all categories")
    public void receivedStatusCode200OKGetAllCategory() {
        getAllCategories.receivedStatusCode200OKGetAllCategory();
    }

    @And("I received list valid data for all category response")
    public void receivedListValidDataAllCategory() {
        getAllCategories.receivedListValidDataAllCategory();
    }

    @Given("I set API endpoint for get all category without the path")
    public void setAPIEndpointInvalidGetAllCategoryWithoutPath() { getAllCategories.setAPIEndpointInvalidGetAllCategoryWithoutPath();}

    @When("I send request to get all category no path")
    public void sendRequestGetAllCategoryNoPath() { getAllCategories.sendRequestGetAllCategoryNoPath();}

    @Then("I received status code 200 OK in request to get all category")
    public void receivedStatusCode200OKInRequestGetAllCategory() { getAllCategories.receivedStatusCode200OKInRequestGetAllCategory();}

    @And("I received format HTML response get all Categories")
    public void receivedFormatHTMLResponseGetAllCategories() {
        getAllCategories.receivedFormatHTMLResponseGetAllCategories();
    }

}


