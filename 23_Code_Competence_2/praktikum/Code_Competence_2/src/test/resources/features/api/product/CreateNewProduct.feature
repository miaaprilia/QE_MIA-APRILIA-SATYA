Feature: Create New Product Data
  As a user
  I want to create new product data
  So that I can create new product data

  #Scenario Positive
  Scenario: As a user I can create a new product data
    Given I set API endpoint for create new product data
    When I send request to create new product data
    Then I received status code 200 OK
    And I received id for new product data

  #Scenario Negative
  Scenario: As a user I can't create new product data without path
    Given I set API endpoint for create new product data without the path
    When I send request to create new product data no path
    Then I received status code 404 Not Found in request to create new product
    And I received error message "Cannot POST" format HTML response