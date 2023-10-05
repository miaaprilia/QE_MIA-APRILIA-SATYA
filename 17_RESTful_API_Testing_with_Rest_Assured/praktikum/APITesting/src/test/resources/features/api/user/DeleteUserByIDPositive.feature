Feature: Delete User
  As a user
  I want to delete user data
  So that the user data can be removed

  Background:
    Given I set API endpoint for delete user

#Scenario Positive
  Scenario: As a user I can delete user with valid ID
    When I send request to delete user with valid ID
    Then I receive status code 204

#Scenario Negative
  Scenario: As a user I cannot delete user with invalid ID
    When I changed the invalid API endpoint path by leaving the id blank
    And I sent a request to delete user with invalid ID
    Then I received status code 404
    And I received the API not found response