Feature: Delete Product By ID
  As a user
  I want to delete product data
  So that I can be delete product data

  #Scenario Positive
  Scenario: As a user I can delete a single product data with a valid ID
    Given I set API endpoint valid for delete a single product data
    When I send request to delete a single product data
    Then I received status code 200 OK delete product by ID
    And I received detail product delete data response

  #Scenario Negative
  Scenario: As a user I can't delete product data without path
    Given I set API endpoint invalid for delete product data without the path
    When I send request to delete product data no path
    Then I received status code 404 Not Found in request to delete product by ID
    And I received error message "Cannot DELETE" format HTML response

  Scenario: As a user I cannot delete product data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for delete a single product data the path
    When I send request to delete a single product data invalid ID
    Then I received status code 400 Bad Request in request to delete a single product data by ID
    And I received error message "product id should be provided" response in request to delete product data by ID
