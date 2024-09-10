package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishList_Step_Defs {

    WishListPage wishListPage = new WishListPage();

    @When("The user clicks wish list icon")
    public void the_user_clicks_wish_list_icon() {
        BrowserUtils.waitForVisibility(wishListPage.wishListIcon, 5);
        wishListPage.wishListIcon.click();
    }
    @Then("The user should be able to see the products on the wish list page")
    public void the_user_should_be_able_to_see_the_products_on_the_wish_list_page() {
        String expectedProduct1 = "BaByliss 3663U - Hair rollers";
        String expectedProduct2 = "Capsule Plate 6pcs";
        Assert.assertEquals(expectedProduct1,wishListPage.firstProduct.getText());
        Assert.assertEquals(expectedProduct2,wishListPage.secondProduct.getText());
    }

}
