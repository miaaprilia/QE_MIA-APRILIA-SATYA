Feature: Get All Users Data
  As a user
  I want to get all data user
  So that I can read all user data

  #Scenario Positive
  Scenario: As a user I can get all user data with valid path
    Given I set API endpoint valid for get all user data
    When I send request to get all user data
    Then I received status code 200 OK
    And I received list valid data for all data user response

  #Scenario Negative
  Scenario: As a user I can't get all user data without path
    Given I set API endpoint for get all user data without the path
    When I send request to get all user data no path
    Then I received status code 200 OK in request to get all user data
    And I received format HTML response
