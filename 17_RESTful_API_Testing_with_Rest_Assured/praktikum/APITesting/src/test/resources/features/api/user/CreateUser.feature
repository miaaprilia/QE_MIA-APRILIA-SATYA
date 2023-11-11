Feature: Create User
  As a user
  I want to create a new user
  So that the user data is saved

#Scenario Positive
  Scenario: As a user I can create new user data with a valid path
    Given I set API endpoint valid for create user
    When I send request to create user with valid path
    Then I received status code 201 Created for a create new user

#Scenario Negative
  Scenario: As a user I can't create new user data with an invalid path
    Given I set API endpoint for create new user with an invalid path
    When I send request to create user with invalid path
    Then I received status code 404 Not Found for a create new user