Feature: Cart
  As a user
  I want to add item to the cart
  So that I can buy the item

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button

  Scenario: As a user I can add item to the cart
    Given I am on the product page
    When I add item to the cart
    Then Item is added to the cart
