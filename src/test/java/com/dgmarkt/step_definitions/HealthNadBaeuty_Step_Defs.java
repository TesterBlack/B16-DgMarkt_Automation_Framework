package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthNadBaeuty_Step_Defs {

    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();

    @When("The user add the product {string} to the wish list")
    public void the_user_add_the_product_to_the_wish_list(String productName) {
        healthAndBeautyPage.productAddToWishList(productName);
    }
    @Then("The user should able to see the message {string}")
    public void the_user_should_able_to_see_the_message(String alertMessage) {
        healthAndBeautyPage.verifyAlertMessage(alertMessage);
    }


}
