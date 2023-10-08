Feature: Create New Cart Data
  As a user
  I want to create new cart data
  So that I can create new cart data

  #Scenario Positive
  Scenario: As a user I can create a new cart data
    Given I set API endpoint for create new cart data
    When I send request to create new cart data
    Then I received status code 200 OK
    And I received id for new cart data

  #Scenario Negative
  Scenario: As a user I can't create new cart data without path
    Given I set API endpoint for create new cart data without the path
    When I send request to create new cart data no path
    Then I received status code 404 Not Found in request to create new cart
    And I received error message "Cannot POST" format HTML response