Feature: Main Page
  As a logged-in user
  I want to see other people's posts
  So I can click on the main page menu

#Scenario Positive
  Scenario: As a logged-in user, I can click the 'like' button on someone else's post
    Given I'm on the main page
    When I can see other people's posts
    And I can click the 'like' button on other people's posts
    Then I saw an increase in the number of likes on the post

  Scenario: As a logged-in user, I can add comments to other people's posts
    Given I'm on the main page
    When I can see other people's posts
    And I can click the 'comment' button
    And I can write comments
    And I can click the 'post' button
    Then I successfully added a comment
    And I saw an increase in the number of comments on the post

  Scenario: As a logged-in user, I can repost other people's posts
    Given I'm on the main page
    When I can see other people's posts
    And I can click the 'repost' button
    Then I managed to repost someone else's post
    And I saw an increase in the number of reposts on that person's post
    And I can see the popup message "Shared successfully. View shared posts"

  Scenario: As a logged-in user, I can send other people's posts to friends
    Given I'm on the main page
    When I can see other people's posts
    And I can click the 'send' button
    And I choose the friends I want to send the post to
    And I can add messages to my friends
    And I can click the 'send' button
    Then I can to send other people's posts to my friends
    And I can see the popup message "Message sent successfully"

#Scenario Negative
  Scenario: As a logged-in user, I can cancel the 'like' button on someone else's post
    Given I'm on the main page
    When I can see other people's posts
    And I can undo posts I previously liked
    Then I noticed a decrease in the number of likes on the post