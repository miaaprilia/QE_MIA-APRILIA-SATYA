package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By title() {
        return By.className("title");
    }

    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartCounter() {
        return By.className("shopping_cart_badge");
    }

    @Step
    public boolean validateOnHomePage() {
        return $(title()).isDisplayed();
    }

    @Step
    public boolean addToCartButtonIsDisplayed() {
        return $(addToCartButton()).isDisplayed();
    }

    @Step
    public void clickAddToCartButton() {
        $(addToCartButton()).click();
    }

    @Step
    public boolean validateCartCounterIsDisplayed() {
        return $(cartCounter()).isDisplayed();
    }

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }
}
