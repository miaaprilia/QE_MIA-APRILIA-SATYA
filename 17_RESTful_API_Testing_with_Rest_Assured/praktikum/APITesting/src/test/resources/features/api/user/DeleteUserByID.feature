Feature: Delete User By ID
  As a user
  I want to delete user data by ID
  So that I can remove single user by ID

#Scenario Positive
  Scenario: As a user I can delete user by ID data with a valid path
    Given I set API endpoint valid for delete user by ID
    When I send request to delete user with valid ID
    Then I received status code of 200 OK for a delete user

#Scenario Negative
  Scenario: As a user I can't delete user by ID with an invalid path
    Given I set API endpoint for delete user by ID with an invalid path
    When I send request to delete user by ID with an invalid path
    Then I received status code of 404 Not Found for a delete user