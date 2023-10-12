Feature: Create New User Data
  As a user
  I want to create new user data
  So that I can create new user data

  #Scenario Positive
  Scenario: As a user I can create a new user data
    Given I set API endpoint for create new user data
    When I send request to create new user data
    Then I received status code 200 OK create user by ID
    And I received id for new user data

  #Scenario Negative
  Scenario: As a user I can't create new user data without path
    Given I set API endpoint for create new user data without the path
    When I send request to create new user data no path
    Then I received status code 404 Not Found in request to create new user
    And I received error message "Cannot POST" format HTML response