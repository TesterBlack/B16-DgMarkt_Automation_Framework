package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HealthAndBeauty_Step_Defs {

    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();

    @When("The user add the product {string} to the wish list")
    public void the_user_add_the_product_to_the_wish_list(String productName) {
        healthAndBeautyPage.productAddToWishList(productName);
    }
    @Then("The user should able to see the message {string}")
    public void the_user_should_able_to_see_the_message(String alertMessage) {
        healthAndBeautyPage.verifyAlertMessage(alertMessage);
    }

    @When("The user clicks the option to display {int} products icon")
    public void the_user_clicks_the_option_to_display_products_icon(Integer number) {
        healthAndBeautyPage.getProductView(number).click();
    }

    @Then("The user should be able to see {string} products displayed side by side on the page")
    public void the_user_should_be_able_to_see_products_displayed_side_by_side_on_the_page(String getGrid) {
        BrowserUtils.scrollToElement(healthAndBeautyPage.webElementForScrollDown);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(healthAndBeautyPage.productLocation.getAttribute("class").contains(getGrid));
    }

    @When("The user clicks the option to display products in a list view icon")
    public void the_user_clicks_the_option_to_display_products_in_a_list_view_icon() {
        BrowserUtils.scrollToElement(healthAndBeautyPage.webElementForScrollDown);
        healthAndBeautyPage.getProductViewListIcon.click();
    }

    @Then("The user should be able to see all products displayed in a list view")
    public void the_user_should_be_able_to_see_all_products_displayed_in_a_list_view() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(healthAndBeautyPage.productLocation.getAttribute("class").contains("product-items"));
    }

}
