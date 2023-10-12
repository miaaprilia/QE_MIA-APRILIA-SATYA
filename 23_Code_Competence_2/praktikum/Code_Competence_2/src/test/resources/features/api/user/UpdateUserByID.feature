Feature: Update User By ID
  As a user
  I want to update user data
  So that I can be update user data

  #Scenario Positive
  Scenario: As a user I can update user data with a valid ID
    Given I set API endpoint valid for update user data
    When I send request to update user data
    Then I received status code 200 OK update user by ID
    And I received empty data response

  #Scenario Negative
  Scenario: As a user I can't update user data without path
    Given I set API endpoint invalid for update user data without the path
    When I send request to update user data no path
    Then I received status code 404 Not Found in request to update user by ID
    And I received error message "Cannot PUT" format HTML response

  Scenario: As a user I cannot update user data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for update user data the path
    When I send request to update user data invalid ID
    Then I received status code 400 Bad Request in request to update user data by ID
    And I received error message "something went wrong! check your sent data" response

  Scenario: As a user I cannot update user data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for update user data the path
    When I send request to update user data invalid ID
    Then I received status code 200 OK in request to update user data by ID
    And I received empty data response