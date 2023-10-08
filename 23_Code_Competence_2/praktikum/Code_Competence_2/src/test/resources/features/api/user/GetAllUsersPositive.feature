Feature: Get All Users
  As a user
  I want to get all data user
  So that I can read all user data

  Background:
    Given I set API endpoint for get all users positive

#Scenario Positive
  Scenario: As a user I can get all user data with valid path
    When I send request to get all user with valid path
    Then I receive status code 200
    And I receive valid data for all data user
