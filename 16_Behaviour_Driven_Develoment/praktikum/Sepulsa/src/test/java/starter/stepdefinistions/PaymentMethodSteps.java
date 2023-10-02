package starter.stepdefinistions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentMethodSteps {
    @Given("I on the payment page and has selected the product")
    public void onThePaymentPage() {
    }
    @When("I enter an email address")
    public void enterEmailAddress() {
    }
    @And("I make sure the phone number is correct")
    public void correctPhoneNumber() {
    }
    @And("I select the Gopay payment method")
    public void gopayPaymentMethod() {
    }
    @And("I tap the Pay Now button")
    public void tapButtonPayNow() {
    }
    @And("I does not make any payment for more than 15 minutes")
    public void doesntMakeAnyPayment() {
    }
    @Then("Then I make sure the transaction fails and the message \"Page Not Found\" appears on Sepulsa.com")
    public void pageNotFound() {
    }
    @And("I make sure the transaction goes to the failed transaction history page")
    public void failedTransactionHistoryPage() {
    }
    @And("I get a failed transaction message from email, transaction details regarding what product the user purchased")
    public void getFailedTransactionMessage() {
    }
    @And("I select the Dana payment method")
    public void danaPaymentMethod() {
    }
    @And("I select the Kredivo payment method")
    public void kredivoPaymentMethod() {
    }
    @And("I select the ShopeePay payment method")
    public void shopeepayPaymentMethod() {
    }
    @And("I select the Virgo payment method")
    public void virgoPaymentMethod() {
    }
    @And("I complete the payment on the payment page")
    public void completePayment() {
    }
    @Then("I successfully completed the product payment")
    public void successfullyCompletedProduct() {
    }
    @And("I make sure Gopay balance is deducted according to price")
    public void gopayBalanceisDeducted() {
    }
    @And("I managed to get payment receipt from email, receipt details regarding what product the user purchased")
    public void getPaymentReceipt() {
    }
    @And("I make sure Dana balance is deducted according to price")
    public void danaBalanceisDeducted() {
    }
    @And("I make sure ShopeePay balance is deducted according to price")
    public void shopeepayBalanceisDeducted() {
    }


}
