Feature: Get User By ID
  As a user
  I want to get single user
  So that I can read single user data

  Background:
    Given I set API endpoint invalid for get user

#Scenario Negative
  Scenario: As a user I cannot get all user data with blank field
    When I send request to get all user with blank field
    Then I receive status code 200 OK
    And I receive valid data for all user data