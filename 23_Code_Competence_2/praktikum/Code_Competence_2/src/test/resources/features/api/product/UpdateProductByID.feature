Feature: Update Product By ID
  As a user
  I want to update product data
  So that I can be update product data

  #Scenario Positive
  Scenario: As a user I can update a single product data with a valid ID
    Given I set API endpoint valid for update a single product data
    When I send request to update a single product data
    Then I received status code 200 OK update product by ID
    And I received id update data product response

  #Scenario Negative
  Scenario: As a user I can't update product data without path
    Given I set API endpoint invalid for update product data without the path
    When I send request to update product data no path
    Then I received status code 404 Not Found in request to update product by ID
    And I received error message "Cannot PUT" format HTML response

  Scenario: As a user I cannot update product data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for update a single product data the path
    When I send request to update a single product data invalid ID
    Then I received status code 400 Bad Request in request to update a single product data by ID
    And I received error message "cloudflare" format HTML response
