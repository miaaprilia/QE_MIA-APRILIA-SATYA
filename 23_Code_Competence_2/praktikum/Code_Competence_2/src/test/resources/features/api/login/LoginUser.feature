Feature: Login User
  As a user
  I want to login
  So that I can be access

  Background:
    Given I set API endpoint valid for login user

  #Scenario Positive
  Scenario: As a user I can login with a valid credentials
    When I enter a valid email
    And I enter a valid password
    And I send request to login user
    Then I received status code 200 OK login user
    And I received token login user data response

  #Scenario Negative
  Scenario: As a user I can't login without path
    Given I set API endpoint invalid for login user without the path
    When I send request to login user no path
    Then I received status code 404 Not Found in request to login user
    And I received error message "Cannot POST" format HTML response

  Scenario: As a user I can't login if I don't fill in the login request
    When I am not to fill in the login request
    And I sent a request to the login user to fill in the username & password
    Then I received status code 400 Bad Request in request to login user
    And I received error message "username and password are not provided in JSON format" response

  Scenario: As a user I can't login with an invalid username
    When I fill in an invalid username
    And I filled in a valid password
    And I sent a request the login user
    Then I received status code 401 Unauthorized in request login user
    And I received an error message "username or password is incorrect" response

  Scenario: As a user I can't login with an invalid password
    When I filled in a valid username
    And I filled in an invalid password
    And I sent a request the login user
    Then I received status code 401 Unauthorized in request login user
    And I received an error message "username or password is incorrect" response