Feature: Get User By ID
  As a user
  I want to get single user
  So that I can read single user data

  Background:
    Given I set API endpoint valid for get user

#Scenario Positive
  Scenario: As a user I can get user data with valid ID
    When I send request to get user with valid ID
    Then I received status code 200
    And I received valid data for user
