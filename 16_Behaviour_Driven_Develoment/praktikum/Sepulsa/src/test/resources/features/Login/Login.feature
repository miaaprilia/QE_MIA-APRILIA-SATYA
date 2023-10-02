Feature: Login Page
  As a user
  I want to login
  So that I can access dashboard page

#Scenario Negative
  Scenario: Login as a user but do not fill in the login form
    Given I am on the login page
    When I not to fill in the login form
    And I tap the login button
    Then I couldn't log in
    And I see login button is innactive

  Scenario: As logged in user with invalid credentials
    Given I am on the login page
    When I enter invalid email
    And I enter invalid password
    And I tap the login button
    Then I couldn't log in
    And I see the message "Try to remember your e-mail address mobile number and password again appears. Something is still wrong"
    And I see the input form displays a warning icon

  Scenario: As logged in user with invalid email
    Given I am on the login page
    When I enter a invalid email
    And I enter an valid password
    And I tap the login button
    Then I couldn't log in
    And I see the message "Try to remember your e-mail address mobile number and password again appears. Something is still wrong."
    And I see the input form displays a warning icon

  Scenario: As logged in user with invalid password
    Given I am on the login page
    When I enter a valid email
    And I enter an invalid password
    And I tap the login button
    Then I couldn't log in
    And I see the message "Try to remember your e-mail address mobile number and password again appears. Something is still wrong."
    And I see the input form displays a warning icon

#Scenario Positive
  Scenario: As logged in user with valid credentials
    Given I am on the login page
    When I enter a valid email
    And I enter n valid password
    And I tap the login button
    Then I successfully login
    And I successfully redirected to home page