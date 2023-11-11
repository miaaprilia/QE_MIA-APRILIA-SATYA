Feature: Get All Users
  As a user
  I want to get all data user
  So that I can read all user data

#Scenario Positive
  Scenario: As a user I can get all user data with valid path
    Given I set API endpoint valid for get all users
    When I send request to get all user with valid path
    Then I received status code of 200 OK for a get all users
    And I received list data get all users response

#Scenario Negative
  Scenario: As a user I can't get all users with an invalid path
    Given I set API endpoint for get all users with an invalid path
    When I send request to get all users with an invalid path
    Then I received status code 404 Not Found in request to get all users