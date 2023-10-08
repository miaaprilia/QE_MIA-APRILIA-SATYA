Feature: Get User By ID
  As a user
  I want to get user data
  So that I can be get user data

  #Scenario Positive
  Scenario: As a user I can get a single user data with a valid ID
    Given I set API endpoint valid for get a single user data
    When I send request to get a single user data
    Then I received status code 200 OK
    And I received detail single user data response

  #Scenario Negative
  Scenario: As a user I cannot get user data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single user data the path
    When I send request to get a single user data invalid ID
    Then I received status code 400 Bad Request in request to get a single user data by ID
    And I received error message "user id should be provided" response

  Scenario: As a user I cannot get user data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single user data the path
    When I send request to get a single user data invalid ID
    Then I received status code 200 OK in request to get a single user data by ID
    And I received message "null" response