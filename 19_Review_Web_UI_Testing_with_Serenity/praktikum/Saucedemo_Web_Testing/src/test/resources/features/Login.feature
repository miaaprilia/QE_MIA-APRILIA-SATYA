Feature: Login
  As a user
  I want to login
  So that I can access product page

  Background:
    Given I am on the login page

  #Scenario Positive
  Scenario: As a user I can login with valid credentials
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the product page

  #Scenario Negative
  Scenario: As a user I cannot login with blank fill in the login form
    When I dont fill in username field
    And I dont fill in password field
    And I click login button
    Then I see validation message error "Username & Password is required"

  Scenario: As a user I cannot login with invalid credentials
    When I input invalid username
    And I input invalid password
    And I click login button
    Then I see validation message error "Username & Password do not match any user in this service"

  Scenario: As a user I cannot login with invalid username
    When I input invalid username
    And I input valid password
    And I click login button
    Then I see validation message error "Username & Password do not match any user in this service"

  Scenario: As a user I cannot login with invalid password
    When I input valid username
    And I input invalid password
    And I click login button
    Then I see validation message error "Username & Password do not match any user in this service"
