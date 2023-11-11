Feature: Get User By ID
  As a user
  I want to get single user
  So that I can read single user data

#Scenario Positive
  Scenario: As a user I can get user by ID data with a valid path
    Given I set API endpoint valid for get user by ID
    When I send request to get user with valid ID
    Then I received status code of 200 OK for a get user by ID
    And I received data get user by ID response

#Scenario Negative
  Scenario: As a user I cannot get user data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single user data the path character
    When I send request to get a single user data invalid ID character
    Then I received status code 404 Not Request in request to get user by ID

  Scenario: As a user I cannot get user data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single user data the path exist in the database
    When I send request to get a single user data invalid ID exist in the database
    Then I received status code 404 Not Request in request to get user by ID