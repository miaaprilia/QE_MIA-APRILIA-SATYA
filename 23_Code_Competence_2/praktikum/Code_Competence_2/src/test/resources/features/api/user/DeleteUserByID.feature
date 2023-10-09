Feature: Delete User By ID
  As a user
  I want to delete user data
  So that I can be delete user data

  #Scenario Positive
  Scenario: As a user I can delete user data with a valid ID
    Given I set API endpoint valid for delete user data
    When I send request to delete user data
    Then I received status code 200 OK delete user by ID
    And I received detail user data response

  #Scenario Negative
  Scenario: As a user I can't delete user data without path
    Given I set API endpoint invalid for delete user data without the path
    When I send request to delete user data no path
    Then I received status code 404 Not Found in request to delete user by ID
    And I received error message "Cannot DELETE" format HTML response

  Scenario: As a user I cannot delete user data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for delete user data the path
    When I send request to delete user data invalid ID
    Then I received status code 400 Bad Request in request to delete user data by ID
    And I received error message "user id should be provided" response in request to delete data by ID

  Scenario: As a user I cannot delete user data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for delete user data the path
    When I send request to delete user data invalid ID
    Then I received status code 200 OK in request to delete user data by ID
    And I received message "null" response in request to delete data by ID