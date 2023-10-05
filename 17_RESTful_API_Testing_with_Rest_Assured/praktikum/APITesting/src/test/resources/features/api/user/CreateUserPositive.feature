Feature: Create User
  As a user
  I want to create a new user
  So that the user data is saved

  Background:
    Given I set API endpoint for create user

#Scenario Positive
  Scenario: As a user I can create new data with valid inputs
    When I send request to create user with valid inputs
    Then I received status code 201
    And I received valid data for created user

#Scenario Negative
  Scenario: As a user I cannot create new data with invalid path
    When I change the API endpoint path is invalid
    And I sent a request to create user with invalid path
    Then I received status code 404
    And I received the API not found response