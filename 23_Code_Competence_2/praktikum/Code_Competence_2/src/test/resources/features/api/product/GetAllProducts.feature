Feature: Get All Products
  As a user
  I want to get all products
  So that I can read all products

  #Scenario Positive
  Scenario: As a user I can get all product with valid path
    Given I set API endpoint valid for get all product
    When I send request to get all product
    Then I received status code 200 OK get all products
    And I received list valid data for all product response

  #Scenario Negative
  Scenario: As a user I can't get all product without path
    Given I set API endpoint for get all product without the path
    When I send request to get all product no path
    Then I received status code 200 OK in request to get all product
    And I received format HTML response get all products
