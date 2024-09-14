package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WishList_Step_Defs {

    WishListPage wishListPage = new WishListPage();
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();

    @When("The user clicks wish list icon")
    public void the_user_clicks_wish_list_icon() {
        BrowserUtils.waitFor(2);
        System.out.println("wishlist is clicked");
        BrowserUtils.clickWithJS(wishListPage.wishListIcon);
    }

    @Then("The user should be able to see the products on the wish list page")
    public void the_user_should_be_able_to_see_the_products_on_the_wish_list_page() {
        BrowserUtils.waitForVisibility(wishListPage.firstProduct.get(wishListPage.firstProduct.size() - 1), 5);
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(wishListPage.secondProduct.get(wishListPage.secondProduct.size() - 1));
        BrowserUtils.waitForVisibility(wishListPage.secondProduct.get(wishListPage.secondProduct.size() - 1), 5);
        String expectedProduct1 = "BaByliss 3663U - Hair rollers";
        String expectedProduct2 = "Capsule Plate 6pcs";
        String actualProduct1 = wishListPage.firstProduct.get(wishListPage.firstProduct.size() - 1).getText();
        String actualProduct2 = wishListPage.secondProduct.get(wishListPage.secondProduct.size() - 1).getText();
        Assert.assertEquals(expectedProduct1, actualProduct1);
        Assert.assertEquals(expectedProduct2, actualProduct2);
    }

    @When("The user clicks the delete icon for the first product in the My Wish List table")
    public void the_user_clicks_the_delete_icon_for_the_first_product_in_the_my_wish_list_table() {
        BrowserUtils.waitForVisibility(wishListPage.deleteButton, 4);
        wishListPage.deleteButton.click();
    }

    @Then("The user should no longer see the first product in the wish list and get the message")
    public void the_user_should_no_longer_see_the_first_product_in_the_wish_list_and_get_the_message() {
        String actualMessage = wishListPage.successMessage.getText();
        String expectedMessage = "Success: You have modified your wish list!\n" +
                "×";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("The user clicks the delete icon for the second product in the My Wish List table")
    public void the_user_clicks_the_delete_icon_for_the_second_product_in_the_my_wish_list_table() {
        BrowserUtils.waitForVisibility(wishListPage.deleteButton, 5);
        wishListPage.deleteButton.click();
    }
    @Then("The user should no longer see the second product in the wish list and  get the message")
    public void the_user_should_no_longer_see_the_second_product_in_the_wish_list_and_get_the_message() {
        String actualMessage = wishListPage.successMessage.getText();
        String expectedMessage = "Success: You have modified your wish list!\n" +
                "×";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Then("The user should be able to see the empty message")
    public void the_user_should_be_able_to_see_the_empty_message() {
        String actualMessage = wishListPage.emptyWishListMessage.getText();
        String expectedMessage = "Your wish list is empty.";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @When("The user clicks the add to cart icon for the first product in the My Wish List table")
    public void the_user_clicks_the_add_to_cart_icon_for_the_first_product_in_the_my_wish_list_table() {
        BrowserUtils.waitForVisibility(wishListPage.addToCartButton, 5);
        wishListPage.addToCartButton.click();
    }
    @When("The user clicks the add to cart icon for the second product in the My Wish List table")
    public void the_user_clicks_the_add_to_cart_icon_for_the_second_product_in_the_my_wish_list_table() {
        wishListPage.addToCartButton2.click();
    }
    @Then("The user should be able to see the message {string}")
    public void the_user_should_be_able_to_see_the_message(String alertMessage) {
        healthAndBeautyPage.verifyAlertMessage(alertMessage);
    }

    @Then("The user clicks the add to cart icon")
    public void the_user_clicks_the_add_to_cart_icon() {
        BrowserUtils.waitForVisibility(wishListPage.addToCartButton, 5);
        wishListPage.cartIcon.click();
    }
    @Then("The user should be able to see a dropdown menu for the shopping cart that the products have been added to the cart.")
    public void the_user_should_be_able_to_see_a_dropdown_menu_for_the_shopping_cart_that_the_products_have_been_added_to_the_cart() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(wishListPage.dropdownMenu.isDisplayed());
    }
}
