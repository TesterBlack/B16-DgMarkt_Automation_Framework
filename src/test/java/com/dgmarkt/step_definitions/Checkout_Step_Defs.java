package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Checkout_Step_Defs {
    CheckoutPage checkoutPage = new CheckoutPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Then("The user clicks Checkout button")
    public void the_user_clicks_checkout_button() {
        checkoutPage.checkoutButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be able to see alert message that the product not available or not in stock")
    public void the_user_should_be_able_to_see_alert_message_that_the_product_not_available_or_not_in_stock() {
        String expectedAlertMessage = "products marked with *** are not available in the desired quantity or not in stock!";
        String actualAlertMessage = checkoutPage.alertNotInStock.getText().substring(0, checkoutPage.alertNotInStock.getText().length() - 1);
        System.out.println("actualAlertMessage = " + actualAlertMessage);
        Assert.assertEquals(expectedAlertMessage.toLowerCase(),actualAlertMessage.trim().toLowerCase());
    }
    @Then("The user select an existing address for billing and clicks continue")
    public void the_user_select_an_existing_address_for_billing_and_clicks_continue() {
        checkoutPage.existingAdress.click();
        checkoutPage.continueBtnBilling.click();
        BrowserUtils.waitFor(1);
    }
    @Then("The user enters {string} first name")
    public void the_user_enters_first_name(String firstName) {
        checkoutPage.newDeliveryAddressButton.click();
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
        BrowserUtils.waitFor(1);
    }
    @Then("The user selects region-state and clicks continue button")
    public void the_user_selects_region_state_and_clicks_continue_button() {
        Select select = new Select(checkoutPage.region);
        select.selectByVisibleText("Berlin");
        BrowserUtils.waitFor(1);
    }
    @Then("The user clicks continue button")
    public void the_user_clicks_continue_button() {
        checkoutPage.continueBtnDeliveryDetails.click();
        checkoutPage.continueBtnDeliveryMethod.click();
        BrowserUtils.waitFor(1);
    }
    @Then("The user accept Terms & Conditions and clicks continue")
    public void the_user_accept_terms_conditions_and_clicks_continue() {
        checkoutPage.termsConditionsAgreeBtn.click();
        BrowserUtils.waitFor(1);
        checkoutPage.continueBtnPaymentMethod.click();
    }
    @Then("The user clicks Confirm Order Button")
    public void the_user_clicks_confirm_order_button() {
        checkoutPage.confirmOrder.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be able to see the order confirmation page")
    public void the_user_should_be_able_to_see_the_order_confirmation_page() {
        String expectedSuccessMessage = "Your order has been placed!";
        String actualSuccessMessage = checkoutPage.successMessage.getText();
        System.out.println("actualSuccessMessage = " + actualSuccessMessage);
        Assert.assertEquals(expectedSuccessMessage.toLowerCase(),actualSuccessMessage.toLowerCase());
    }
    @When("The user clicks continue button in empty cart")
    public void the_user_clicks_continue_button_in_empty_cart() {
        shoppingCartPage.removeProductInShoppingCart.click();
        BrowserUtils.waitFor(1);
        checkoutPage.continueBtnEmptyCart.click();
    }



}
