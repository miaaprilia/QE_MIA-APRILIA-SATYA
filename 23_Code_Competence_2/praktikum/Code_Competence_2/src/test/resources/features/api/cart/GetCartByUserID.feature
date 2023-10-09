Feature: Get Cart By User ID
  As a user
  I want to get cart data by user id
  So that I can be get cart data by user id

  #Scenario Positive
  Scenario: As a user I can get cart specific data with a valid User ID
    Given I set API endpoint valid for get cart specific data
    When I send request to get cart specific data
    Then I received status code 200 OK get cart by user ID
    And I received detail list cart in specific user id data response

  #Scenario Negative
  Scenario: As a user I cannot get cart specific data with an invalid User ID (by entering the User ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get cart specific data the path
    When I send request to get cart specific data invalid User ID
    Then I received status code 400 Bad Request in request to get cart specific data by User ID
    And I received error message "cart id should be provided" response in request to get cart data by User ID

  Scenario: As a user I cannot get cart specific data with an invalid User ID (by entering an User ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get cart specific data the path
    When I send request to get cart specific data invalid User ID
    Then I received status code 200 OK in request to get cart specific data by User ID
    And I received message "null" response
