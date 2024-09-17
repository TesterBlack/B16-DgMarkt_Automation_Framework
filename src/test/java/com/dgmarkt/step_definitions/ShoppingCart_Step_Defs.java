package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCart_Step_Defs {

    MainPage mainPage = new MainPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @When("The user clicks on the product")
    public void the_user_clicks_on_the_product() {
        shoppingCartPage.productSelection();
    }

    @When("The user clicks on input limit filter")
    public void the_user_clicks_on_input_limit_filter() {
        shoppingCartPage.inputLimitFilter.click();
    }

    @When("The user selects size")
    public void the_user_selects_size (){
        shoppingCartPage.inputLimitSize.click();
    }

    @When("The user clicks on add to cart button")
    public void the_user_clicks_on_add_to_cart_button() {

    }

    @Then("The user should be able to see the added product")
    public void the_user_should_be_able_to_see_the_added_product() {
        shoppingCartPage.productSelection();



    }


}
