Feature: Get All Users
  As a user
  I want to get all data user
  So that I can read all user data

  Background:
    Given I set API endpoint for get all users negative

#Scenario Negative
  Scenario: As a user I cannot get all user data with blank field
    When I send request to get all user with blank field
    Then I receive status code 200 OK
    And I receive valid data for all user data