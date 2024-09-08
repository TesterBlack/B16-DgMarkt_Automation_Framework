package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPage_Step_Defs {

    MainPage mainPage = new MainPage();

    @When("user clicks My Account on the main page")
    public void user_clicks_my_account_on_the_main_page() throws InterruptedException {
        Thread.sleep(2000);
        BrowserUtils.clickWithJS(mainPage.myAccountButton);

    }

    @When("user clicks Register on My Account")
    public void user_clicks_register_on_my_account() {
        mainPage.accountRegisterButton.click();

    }







    @When("The User navigates to the currency selector dropdown on the home page")
    public void the_user_navigates_to_the_currency_selector_dropdown_on_the_home_page() {
        BrowserUtils.waitFor(4);
        mainPage.currencyButton.click();
    }
    @Then("The user should be see the currency options\\(Euro-Pound-Dolar).")
    public void the_user_should_be_see_the_currency_options_euro_pound_euro() throws InterruptedException{
        Assert.assertTrue(mainPage.currencyEuroButton.isDisplayed());
        Assert.assertTrue(mainPage.currencyPoundsButton.isDisplayed());
        Assert.assertTrue(mainPage.currencyDolarButton.isDisplayed());
    }
    @Then("User selects Euro as the currency")
    public void user_selects_euro_as_the_currency() {
        mainPage.currencyEuroButton.click();
    }
    @Then("sees that Euro have been selected")
    public void sees_that_euro_have_been_selected() {
        Assert.assertTrue(mainPage.currencyButton.getText().contains("Euro"));
    }
    @When("The user should be see the currency options\\(Euro-Pound-Dolar)")
    public void the_user_should_be_see_the_currency_options_euro_pound_pounds() {
        Assert.assertTrue(mainPage.currencyEuroButton.isDisplayed());
        Assert.assertTrue(mainPage.currencyPoundsButton.isDisplayed());
        Assert.assertTrue(mainPage.currencyDolarButton.isDisplayed());
    }
    @Then("User selects pounds as the currency")
    public void user_selects_pounds_as_the_currency() {
        mainPage.currencyPoundsButton.click();
    }
    @Then("sees that pounds have been selected")
    public void sees_that_pounds_have_been_selected() {
        Assert.assertTrue(mainPage.currencyButton.getText().contains("Pound"));
    }

    @Then("User selects dolar as the currency")
    public void user_selects_dolar_as_the_currency() {
        mainPage.currencyDolarButton.click();
    }
    @Then("sees that dolar have been selected")
    public void sees_that_dolar_have_been_selected() {
        Assert.assertTrue(mainPage.currencyButton.getText().contains("$"));
    }


/*


    @When("The user proceeds to the Checkout page")
    public void the_user_proceeds_to_the_checkout_page() {

    }
    @Then("Verify that the total amount is displayed in the selected currency.")
    public void verify_that_the_total_amount_is_displayed_in_the_selected_currency() {

    }
    @Then("The user completes the purchase process \\(choose payment method, enter details, confirm payment).")
    public void the_user_completes_the_purchase_process_choose_payment_method_enter_details_confirm_payment() {

    }
    @Then("The purchase should be successfully completed and the order confirmation should show the total amount in the selected currency.")
    public void the_purchase_should_be_successfully_completed_and_the_order_confirmation_should_show_the_total_amount_in_the_selected_currency() {

    }





    @When("The user click on the shopping cart.")
    public void the_user_click_on_the_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that the user sees the checkout page.")
    public void verify_that_the_user_sees_the_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user clicks on the Checkout button.")
    public void the_user_clicks_on_the_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that the user see that the checkout page reflects the selected currency.")
    public void verify_that_the_user_see_that_the_checkout_page_reflects_the_selected_currency() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that the user sees the total amount is displayed in the selected currency.")
    public void verify_that_the_user_sees_the_total_amount_is_displayed_in_the_selected_currency() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user sees the Shopping Cart Page in the currency they selected")
    public void the_user_sees_the_shopping_cart_page_in_the_currency_they_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user clicks the Checkout button to complete the purchase process")
    public void the_user_clicks_the_checkout_button_to_complete_the_purchase_process() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user should be see the Checkout Options")
    public void the_user_should_be_see_the_checkout_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the User fills in the checkout options and click the confirm order button")
    public void the_user_fills_in_the_checkout_options_and_click_the_confirm_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be see the message on the page that {string}")
    public void user_should_be_see_the_message_on_the_page_that(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @When("The user proceeds to the checkout page")
    public void the_user_proceeds_to_the_checkout_pages() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that the total amount is displayed in the selected currency.")
    public void verify_that_the_total_amount_is_displayed_in_the_selected_currencyy() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user completes the purchase process \\(choose payment method, enter details, confirm payment).")
    public void the_user_completes_the_purchase_process_choose_payment_method_enter_details_confirm_paymentt() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The purchase should be successfully completed and the order confirmation should show the total amount in the selected currency.")
    public void the_purchase_should_be_successfully_completed_and_the_order_confirmation_should_show_the_total_amount_in_the_selected_currencyy() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



 */







}
