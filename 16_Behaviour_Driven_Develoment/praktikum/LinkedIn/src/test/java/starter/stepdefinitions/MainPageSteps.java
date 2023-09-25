package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageSteps {
    @Given("I'm on the main page")
    public void onTheMainPage() {
    }
    @When("I can see other people's posts")
    public void seeOtherPeoplePost() {
    }
    @And("I can click the 'like' button on other people's posts")
    public void clickButtonLike() {
    }
    @Then("I saw an increase in the number of likes on the post")
    public void seeSuccessfullyLikesPost() {
    }
    @And("I can click the 'comment' button")
    public void canClickCommentButton() {
    }
    @And("I can write comments")
    public void canWriteComment() {
    }
    @And("I can click the 'post' button")
    public void canClickPostButton() {
    }
    @Then("I successfully added a comment")
    public void seeSuccessfullyAddedComment() {
    }
    @And("I saw an increase in the number of comments on the post")
    public void seeIncreaseNumberComment(){
    }
    @And("I can click the 'repost' button")
    public void canClickRepostButton(){
    }
    @Then("I managed to repost someone else's post")
    public void canManagedToRepost(){
    }
    @And("I saw an increase in the number of reposts on that person's post")
    public void seeIncreaseNumberRepost(){
    }
    @And("I can see the popup message \"Shared successfully. View shared posts\"")
    public void seePopupMessageSuccessfully(){
    }
    @And("I can click the 'send' button")
    public void canClickSendButton(){
    }
    @And("I choose the friends I want to send the post to")
    public void canChooseFriends(){
    }
    @And("I can add messages to my friends")
    public void canAddMessage(){
    }
    @Then("I can to send other people's posts to my friends")
    public void canSendOtherPeoplePost(){
    }
    @And("I can see the popup message \"Message sent successfully\"")
    public void canSeePopupMessage(){
    }
    @And("I can undo posts I previously liked")
    public void canUndoPost(){
    }
    @Then("I noticed a decrease in the number of likes on the post")
    public void canSeeDecreaseNumberOfLikes(){
    }


}

