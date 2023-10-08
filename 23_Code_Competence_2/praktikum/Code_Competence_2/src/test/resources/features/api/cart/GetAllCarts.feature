Feature: Get All Carts Data
  As a user
  I want to get all carts data
  So that I can read all carts data

  #Scenario Positive
  Scenario: As a user I can get all cart data with valid path
    Given I set API endpoint valid for get all cart data
    When I send request to get all cart data
    Then I received status code 200 OK
    And I received list valid data for all data cart response

  #Scenario Negative
  Scenario: As a user I can't get all cart data without path
    Given I set API endpoint for get all cart data without the path
    When I send request to get all cart data no path
    Then I received status code 200 OK in request to get all cart data
    And I received format HTML response
