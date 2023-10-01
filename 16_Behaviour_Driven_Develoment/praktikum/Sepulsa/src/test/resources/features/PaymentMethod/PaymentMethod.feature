Feature: Payment Method Page
  As a user
  I want to select payment method
  So I can complete the payment

#Scenario Negative
  Scenario: Login user - Failed product payment - Gopay payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Gopay payment method
    And I tap the Pay Now button
    And I does not make any payment for more than 15 minutes
    Then Then I make sure the transaction fails and the message "Page Not Found" appears on Sepulsa.com
    And I make sure the transaction goes to the failed transaction history page
    And I get a failed transaction message from email, transaction details regarding what product the user purchased

  Scenario: Login user - Failed product payment - Dana payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Dana payment method
    And I tap the Pay Now button
    And I does not make any payment for more than 15 minutes
    Then Then I make sure the transaction fails and the message "Page Not Found" appears on Sepulsa.com
    And I make sure the transaction goes to the failed transaction history page
    And I get a failed transaction message from email, transaction details regarding what product the user purchased

  Scenario: Login user - Failed product payment - Kredivo payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Kredivo payment method
    And I tap the Pay Now button
    And I does not make any payment for more than 15 minutes
    Then Then I make sure the transaction fails and the message "Page Not Found" appears on Sepulsa.com
    And I make sure the transaction goes to the failed transaction history page
    And I get a failed transaction message from email, transaction details regarding what product the user purchased

  Scenario: Login user - Failed product payment - ShopeePay payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the ShopeePay payment method
    And I tap the Pay Now button
    And I does not make any payment for more than 15 minutes
    Then Then I make sure the transaction fails and the message "Page Not Found" appears on Sepulsa.com
    And I make sure the transaction goes to the failed transaction history page
    And I get a failed transaction message from email, transaction details regarding what product the user purchased

  Scenario: Login user - Failed product payment - Virgo payment method
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Virgo payment method
    And I tap the Pay Now button
    And I does not make any payment for more than 15 minutes
    Then Then I make sure the transaction fails and the message "Page Not Found" appears on Sepulsa.com
    And I make sure the transaction goes to the failed transaction history page
    And I get a failed transaction message from email, transaction details regarding what product the user purchased

#Scenario Positive
  Scenario: Login user - Product payment successful - Gopay payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Gopay payment method
    And I tap the Pay Now button
    And I complete the payment on the payment page
    Then I successfully completed the product payment
    And I make sure Gopay balance is deducted according to price
    And I managed to get payment receipt from email, receipt details regarding what product the user purchased

  Scenario: Login user - Product payment successful - Dana payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the Dana payment method
    And I tap the Pay Now button
    And I complete the payment on the payment page
    Then I successfully completed the product payment
    And I make sure Dana balance is deducted according to price
    And I managed to get payment receipt from email, receipt details regarding what product the user purchased

  Scenario: Login user - Product payment successful - ShopeePay payment method
    Given I on the payment page and has selected the product
    When I enter an email address
    And I make sure the phone number is correct
    And I select the ShopeePay payment method
    And I tap the Pay Now button
    And I complete the payment on the payment page
    Then I successfully completed the product payment
    And I make sure ShopeePay balance is deducted according to price
    And I managed to get payment receipt from email, receipt details regarding what product the user purchased