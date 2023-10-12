Feature: Get Cart By ID
  As a user
  I want to get cart data
  So that I can be get cart data

  #Scenario Positive
  Scenario: As a user I can get a single cart data with a valid ID
    Given I set API endpoint valid for get a single cart data
    When I send request to get a single cart data
    Then I received status code 200 OK get cart by ID
    And I received detail single cart data response

  #Scenario Negative
  Scenario: As a user I cannot get cart data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single cart data the path
    When I send request to get a single cart data invalid ID
    Then I received status code 400 Bad Request in request to get a single cart data by ID
    And I received error message "cloudflare" format HTML response

  Scenario: As a user I cannot get cart data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single cart data the path
    When I send request to get a single cart data invalid ID
    Then I received status code 200 OK in request to get a single cart data by ID
    And I received message "null" response