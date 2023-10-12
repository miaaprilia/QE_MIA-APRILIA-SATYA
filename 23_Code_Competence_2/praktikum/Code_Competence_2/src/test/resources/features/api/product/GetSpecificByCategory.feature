Feature: Get Specific By Category
  As a user
  I want to get product specific
  So that I can be get product specific by category

  #Scenario Positive
  Scenario: As a user I can get product specific data with a valid category
    Given I set API endpoint valid for get product specific data
    When I send request to get product specific data
    Then I received status code 200 OK get specific by category
    And I received detail list product in specific category data response

  #Scenario Negative
  Scenario: As a user I cannot get product specific data with an invalid category (by entering the category numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get product specific data the path
    When I send request to get product specific data invalid category
    Then I received status code 400 Bad Request in request to get product specific data by category
    And I received error message "cloudflare" format HTML response

  Scenario: As a user I cannot get product specific data with an invalid category (by entering an category number that does not yet exist in the database)
    Given I set API endpoint invalid for get product specific data the path
    When I send request to get product specific data invalid category
    Then I received status code 200 OK in request to get product specific data by category
    And I received empty data response