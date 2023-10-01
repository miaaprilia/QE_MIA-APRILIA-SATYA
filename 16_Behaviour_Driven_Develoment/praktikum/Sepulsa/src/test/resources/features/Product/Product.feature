Feature: Product Page
  As a user
  I want to login
  So that I can access dashboard page

#Scenario Positive
  Scenario: The user has logged in - Tap the telecommunication tab - Data Package Products - Valid telephone number
    Given I am on the telecommunication tab
    When I choose data package product
    And I enter a valid phone number
    And I tap the text link 'See More'
    And I tap close on the pop up
    Then I see available details data packages

  Scenario: The user has logged in - Tap the bill paying tab - PLN Electricity Products - Valid telephone number
    Given I am on the bill paying tab
    When I select a PLN electricity product
    And I choose 1 type of electricity meter Prepaid or Postpaid
    And I input a valid PLN ID meter number
    And I tap continue button
    Then I users are redirected to the payment page
    And I see active continue button
    And I see 2 types of PLN electricity meter forms

  Scenario: The user has logged in - Tap the buy voucher tab - Game voucher product - Valid telephone number
    Given I am on the buy voucher tab
    When I select a game voucher product
    And I select 1 purchase item from one of the voucher or topup tabs
    And I enter a valid phone number
    And I tap voucher nominal
    Then I see available details data packages

  Scenario: The user has logged in - Tap the finance tab - Electronic money products - Valid telephone number
    Given I am on the finance tab
    When I choose an emoney product
    And I select 1 purchase item
    And I enter a valid phone number
    And I tap on the voucher nominal
    Then I see available details data packages

  Scenario: The user has logged in - Tap the social funds tab - Sepulsa Berkah product - Valid phone number
    Given I am on the social funds tab
    When I choose a sepulsa berkah product
    And I choose 1 donation item
    And I enter a valid donation form
    And I tap the 'continue' button
    And I tap the confirmation tick "I have read the intention"
    And I tap the 'continue' button the confirmation form
    Then I was directed to confirm the total payment details

#Scenario Negative
  Scenario: The user has logged in - Tap the telecommunication tab - Data Package Products - Invalid telephone number
    Given I am on the telecommunication tab
    When I select a data package product
    And I enter an invalid phone number
    Then I make sure the process cannot continue
    And I make sure the message appears "The cellphone number is overdone. Maximum 13 digits, OK?"

  Scenario: The user has logged in - Tap the bill payment tab - PLN Electricity Products - Invalid telephone number
    Given I am on the bill paymnet tab
    When I select a PLN electricity product
    And I choose 1 type of electricity meter Prepaid or Postpaid
    And I input an invalid PLN ID meter number
    And I tap continue button
    Then I make sure the process cannot continue
    And I see appears message error

  Scenario: The user has logged in - Tap the buy voucher tab - Game voucher product - Invalid telephone number
    Given I am on the buy voucher tab
    When I select a game voucher product
    And I select 1 purchase item from one of the voucher or topup tabs
    And I enter an invalid phone number
    Then I make sure the process cannot continue
    And I make sure the message appears "The cellphone number is overdone. Maximum 13 digits, OK?"

  Scenario: The user has logged in - Tap the finance tab - Electronic money products - Invalid telephone number
    Given I am on the finance tab
    When I choose an emoney product
    And I select 1 purchase item
    And I enter an invalid phone number
    Then I make sure the process cannot continue
    And I make sure the message appears "The cellphone number is overdone. Maximum 13 digits, OK?"

  Scenario: The user has logged in - Tap the social funds tab - Sepulsa Berkah product - Invalid phone number
    Given I am on the social funds tab
    When I choose a sepulsa berkah product
    And I choose 1 donation item
    And I enter a valid donation form
    And I tap the 'continue' button
    Then I make sure the process cannot continue
    And I make sure the message appears "The cellphone number is overdone. Maximum 13 digits, OK?"