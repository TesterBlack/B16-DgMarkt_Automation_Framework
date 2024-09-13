package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Currency_Step_Defs {
    MainPage mainPage = new MainPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    String currency;

    @When("The User navigates to the currency selector dropdown on the home page")
    public void the_user_navigates_to_the_currency_selector_dropdown_on_the_home_page() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(mainPage.currencies);
    }

    @Then("The user should be see the currency options\\(Euro-Pound-Dolar).")
    public void the_user_should_be_see_the_currency_options_euro_pound_euro(){
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
        Assert.assertEquals("€", mainPage.verifyEuro.getText());
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
        Assert.assertTrue(mainPage.verifyPounds.getText().contains("£"));
    }

    @Then("User selects dolar as the currency")
    public void user_selects_dolar_as_the_currency() {
        mainPage.currencyDolarButton.click();
    }

    @Then("sees that dolar have been selected")
    public void sees_that_dolar_have_been_selected() {
        Assert.assertTrue(mainPage.verifyDolar.getText().contains("$"));
    }

    @Given("The user adds a product to the cart")
    public void theUserAddsAProductToTheCart() {
       checkoutPage.productAddToCart();
    }

    @When("The user clicks on the shopping cart")
    public void theUserClicksOnTheShoppingCart() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(shoppingCartPage.shoppingCartBtn);
    }

    @Then("The user clicks on the Checkout button.")
    public void the_user_clicks_on_the_checkout_button() {
        if (shoppingCartPage.checkOutBtn.isDisplayed()) {
            shoppingCartPage.checkOutBtn.click();
        }else
            shoppingCartPage.checkOutBtnStock.click();
    }

    @Then("Verify that the total amount is displayed in the selected currency.")
    public void verify_that_the_total_amount_is_displayed_in_the_selected_currency() {
        shoppingCartPage.setverifySubTotalAmount(currency);
    }

    @Then("The user completes the purchase process \\(choose payment method, enter details, confirm payment).")
    public void the_user_completes_the_purchase_process_choose_payment_method_enter_details_confirm_payment() {
        checkoutPage.existingAdressBillingDetails(currency);
    }

    @When("The user select the {string} from the Currency section")
    public void the_user_select_the_from_the_currency_section(String selectedCurrency) {
        BrowserUtils.clickWithJS(mainPage.currencies);
        checkoutPage.verifySelectedCurrency(selectedCurrency);
    }

}
