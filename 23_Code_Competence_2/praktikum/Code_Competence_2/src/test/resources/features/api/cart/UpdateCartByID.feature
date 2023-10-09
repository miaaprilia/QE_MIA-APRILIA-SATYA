Feature: Update Cart By ID
  As a user
  I want to update cart data
  So that I can be update cart data

  #Scenario Positive
  Scenario: As a user I can update a single cart data with a valid ID
    Given I set API endpoint valid for update a single cart data
    When I send request to update a single cart data
    Then I received status code 200 OK update cart by ID
    And I received id update cart data response

  #Scenario Negative
  Scenario: As a user I can't update cart data without path
    Given I set API endpoint invalid for update cart data without the path
    When I send request to update cart data no path
    Then I received status code 404 Not Found in request to update cart by ID
    And I received error message "Cannot PUT" format HTML response

  Scenario: As a user I cannot update cart data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for update a single cart data the path
    When I send request to update a single cart data invalid ID
    Then I received status code 400 Bad Request in request to update a single cart data by ID
    And I received error message "something went wrong! check your sent data" response in request to update cart data by ID
