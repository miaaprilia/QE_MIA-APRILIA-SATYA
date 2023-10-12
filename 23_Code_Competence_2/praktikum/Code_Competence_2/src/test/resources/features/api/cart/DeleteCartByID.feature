Feature: Delete Cart By ID
  As a user
  I want to delete cart data
  So that I can be delete cart data

  #Scenario Positive
  Scenario: As a user I can delete a single cart data with a valid ID
    Given I set API endpoint valid for delete a single cart data
    When I send request to delete a single cart data
    Then I received status code 200 OK delete cart by ID
    And I received detail cart delete data response

  #Scenario Negative
  Scenario: As a user I can't delete cart data without path
    Given I set API endpoint invalid for delete cart data without the path
    When I send request to delete cart data no path
    Then I received status code 404 Not Found in request to delete cart by ID
    And I received error message "Cannot DELETE" format HTML response

  Scenario: As a user I cannot delete cart data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for delete a single cart data the path
    When I send request to delete a single cart data invalid ID
    Then I received status code 400 Bad Request in request to delete a single cart data by ID
    And I received error message "cart id should be provided" response in request to delete cart data by ID

  Scenario: As a user I cannot delete cart data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for delete cart data the path
    When I send request to delete cart data invalid ID
    Then I received status code 200 OK in request to delete cart data by ID
    And I received message "null" response in request to delete cart data by ID
