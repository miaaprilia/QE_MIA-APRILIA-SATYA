Feature: Get All Categories
  As a user
  I want to get all categories
  So that I can read all categories

  #Scenario Positive
  Scenario: As a user I can get all category with valid path
    Given I set API endpoint valid for get all category
    When I send request to get all category
    Then I received status code 200 OK
    And I received list valid data for all category response

  #Scenario Negative
  Scenario: As a user I can't get all category without path
    Given I set API endpoint for get all category without the path
    When I send request to get all category no path
    Then I received status code 200 OK in request to get all category
    And I received format HTML response

