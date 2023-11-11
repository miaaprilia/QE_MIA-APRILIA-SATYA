Feature: Update User
  As a user
  I want to update user data
  So that the user data is updated

#Scenario Positive
  Scenario: As a user I can update user data with a valid path
    Given I set API endpoint valid for update user
    When I send request to update user with valid path
    Then I received status code 200 OK for a update user

#Scenario Negative
  Scenario: As a user I can't update user data with an invalid path
    Given I set API endpoint for update user with an invalid path
    When I send request to update user with invalid path
    Then I received status code 404 Not Found for a update user