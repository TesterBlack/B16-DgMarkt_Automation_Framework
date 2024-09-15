package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class myWishList_Step_Defs {
    WishListPage wishListPage = new WishListPage();
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();




     @Then("The user should be see the pop-up Message “ Success: You have added BaByliss U - Hair rollers to your wish list! „")
    public void theUserShouldBeSeeThePopUpMessageSuccessYouHaveAddedBaBylissUHairRollersToYourWishList() {
        System.out.println("wishListPage.successAddedBablissToWishList.getText() = " + wishListPage.successAddedBablissToWishList.getText());

    }


    @When("The user clicks Add to Wisch List tab on the pop-up to reach wish list")
    public void the_user_clicks_add_to_wisch_list_tab_on_the_pop_up_to_reach_wish_list() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(wishListPage.wishListOnTheSuccessMessage);
    }
    @Then("The user should be see the My Wish List Page.")
    public void the_user_should_be_see_the_my_wish_list_page() {
        BrowserUtils.waitFor(4);
        wishListPage.myWishListPageTitle.isDisplayed();
    }
    @Then("The user should be able to reach wish list")
    public void the_user_should_be_able_to_reach_wish_list() {
        wishListPage.myWishListPageTitle.isDisplayed();
    }

    @When("The user clicks on the cart icon on the My Wish List to add products to the cart.")
    public void the_user_clicks_on_the_cart_icon_on_the_my_wish_list_to_add_products_to_the_cart() {
        BrowserUtils.waitFor(4);
        wishListPage.cartBtnOnTheMyWishList.click();
    }

    @Then("The user should see the success message that the products have been added to the cart")
    public void theUserShouldSeeTheSuccessMessageThatTheProductsHaveBeenAddedToTheCart() {
        wishListPage.successMessageAddToCartOnTheMyWishList.isDisplayed();
    }

    @Then("The user clicks Wish List under the My Account module.")
    public void the_user_clicks_wish_list_under_the_my_account_module() {
        BrowserUtils.waitFor(4);
        wishListPage.wishListBtnMyAccount.click();
    }

}