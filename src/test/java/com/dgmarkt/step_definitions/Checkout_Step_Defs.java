package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.MainPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class Checkout_Step_Defs {
    CheckoutPage checkoutPage = new CheckoutPage();
    @Then("The user clicks Checkout button")
    public void the_user_clicks_checkout_button() {
        checkoutPage.checkoutButton.click();
    }
    @Then("The user select an existing address for billing")
    public void the_user_select_an_existing_address_for_billing() {
        checkoutPage.existingAdress.click();
    }
    @Then("The user enters {string} first name")
    public void the_user_enters_first_name(String firstName) {
        checkoutPage.firstName.sendKeys(firstName);
    }
    @Then("The user enters {string} last name")
    public void the_user_enters_last_name(String lastName) {
        checkoutPage.lastName.sendKeys(lastName);
    }
    @Then("The user enters {string} address")
    public void the_user_enters_address(String address) {
        checkoutPage.adress1.sendKeys(address);
    }
    @Then("The user enters {string} city")
    public void the_user_enters_city(String city) {
        checkoutPage.city.sendKeys(city);
    }
    @Then("The user enters {string} post code")
    public void the_user_enters_post_code(String postCode) {
        checkoutPage.postCode.sendKeys(postCode);
    }
    @Then("The user selects country")
    public void the_user_selects_country() {
        Select select = new Select(checkoutPage.country);
        select.selectByVisibleText("Germany");
    }
    @Then("The user selects region-state and clicks continue button")
    public void the_user_selects_region_state_and_clicks_continue_button() {

    }

    @Then("The user clicks continue button")
    public void the_user_clicks_continue_button() {

    }
    @Then("The user accept Terms & Conditions and clicks continue")
    public void the_user_accept_terms_conditions_and_clicks_continue() {

    }
    @Then("The user clicks Confirm Order Button")
    public void the_user_clicks_confirm_order_button() {

    }
    @Then("The user should be able to see the order confirmation page")
    public void the_user_should_be_able_to_see_the_order_confirmation_page() {

    }



}
