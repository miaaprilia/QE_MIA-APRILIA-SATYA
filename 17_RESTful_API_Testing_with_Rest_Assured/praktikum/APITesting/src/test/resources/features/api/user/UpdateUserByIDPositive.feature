Feature: Update User
  As a user
  I want to update user data
  So that the user data is updated

  Background:
    Given I set API endpoint for update user

#Scenario Positive
  Scenario: As a user I can update user with valid ID
    When I send request to update user with valid inputs
    Then I receive status code 200
    And I receive valid data for updated user

#Scenario Positive
  Scenario: As a user I cannot update user with invalid inputs
    When I changed the invalid API endpoint path by leaving the id blank
    And I sent a request to update user with invalid ID
    Then I received status code 404
    And I received the API not found response