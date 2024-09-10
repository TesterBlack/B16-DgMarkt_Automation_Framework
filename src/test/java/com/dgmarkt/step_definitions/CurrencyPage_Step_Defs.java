package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyPage_Step_Defs {
    MainPage mainPage = new MainPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @When("user clicks My Account from Dropdown menu")
    public void user_clicks_my_account_from_dropdown_menu() {
        mainPage.myAccount2Button.click();
    }

    @When("The User navigates to the currency selector dropdown on the home page")
    public void the_user_navigates_to_the_currency_selector_dropdown_on_the_home_page() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(mainPage.currencies);
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




    @When("The user clicks on the shopping cart.")
    public void the_user_click_on_the_shopping_cart() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(shoppingCartPage.shoppingCartBtn);
    }
    @Then("Verify that the user sees the checkout page.")
    public void verify_that_the_user_sees_the_checkout_page() {
        shoppingCartPage.verifySubTotalAmount.isDisplayed();
    }
    @Then("The user clicks on the Checkout button.")
    public void the_user_clicks_on_the_checkout_button() {
        shoppingCartPage.checkOutBtn.click();
    }




    @Then("Verify that the user see that the checkout page reflects the selected currency.")
    public void verify_that_the_user_see_that_the_checkout_page_reflects_the_selected_currency() {
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("€"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("£"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("$"));
    }
    @Then("Verify that the user sees the total amount is displayed in the selected currency.")
    public void verify_that_the_user_sees_the_total_amount_is_displayed_in_the_selected_currency() {
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("€"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("£"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("$"));
    }
    @Then("The user sees the Shopping Cart Page in the currency they selected")
    public void the_user_sees_the_shopping_cart_page_in_the_currency_they_selected() {
        checkoutPage.productCategory("Televisions");
        checkoutPage.productToAdd("Cello C1920FS 19");
    }




    @Then("The user clicks the Checkout button to complete the purchase process")
    public void the_user_clicks_the_checkout_button_to_complete_the_purchase_process() {
        shoppingCartPage.checkOutBtn.click();
    }
    @Then("The user should be see the Checkout Options")
    public void the_user_should_be_see_the_checkout_options() {
        checkoutPage.checkoutOptionsArea.isDisplayed();
    }
    @Then("the User fills in the checkout options and click the confirm order button")
    public void the_user_fills_in_the_checkout_options_and_click_the_confirm_order_button(String firstname, String lastname, String company, String adress1, String adress2, String city, String postcode, String county, String region) {
        checkoutPage.firstName.sendKeys(firstname);
        checkoutPage.lastName.sendKeys(lastname);
        checkoutPage.company.sendKeys(company);
        checkoutPage.adress1.sendKeys(adress1);
        checkoutPage.adress2.sendKeys(adress2);
        checkoutPage.city.sendKeys(city);
        checkoutPage.postCode.sendKeys(postcode);
        checkoutPage.country.sendKeys(county);
        checkoutPage.region.sendKeys(region);
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.termsConditionsAgreeBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.confirmOrderBtn.click();
        checkoutPage.lastContinue.click();
        checkoutPage.confirmOrderBtn.click();
    }

    @Then("User should be see the message on the page that {string}")
    public void user_should_be_see_the_message_on_the_page_that(String string) {
        checkoutPage.successMessage.isDisplayed();
    }





    @When("The user proceeds to the Checkout page")
    public void the_user_proceeds_to_the_checkout_page() {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(shoppingCartPage.shoppingCartBtn);
        shoppingCartPage.checkOutBtn.click();
    }

    @Then("Verify that the total amount is displayed in the selected currency.")
    public void verify_that_the_total_amount_is_displayed_in_the_selected_currency() {
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("€"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("£"));
        Assert.assertTrue(shoppingCartPage.verifySubTotalAmount.getText().contains("$"));
    }
    @Then("The user completes the purchase process \\(choose payment method, enter details, confirm payment).")
    public void the_user_completes_the_purchase_process_choose_payment_method_enter_details_confirm_payment() {
        shoppingCartPage.shoppingCartBtn.click();
    }
    @Then("The purchase should be successfully completed and the order confirmation should show the total amount in the selected currency.")
    public void the_purchase_should_be_successfully_completed_and_the_order_confirmation_should_show_the_total_amount_in_the_selected_currency(String firstname, String lastname, String company, String adress1, String adress2, String city, String postcode, String county, String region) {

        checkoutPage.firstName.sendKeys(firstname);
        checkoutPage.lastName.sendKeys(lastname);
        checkoutPage.company.sendKeys(company);
        checkoutPage.adress1.sendKeys(adress1);
        checkoutPage.adress2.sendKeys(adress2);
        checkoutPage.city.sendKeys(city);
        checkoutPage.postCode.sendKeys(postcode);
        checkoutPage.country.sendKeys(county);
        checkoutPage.region.sendKeys(region);
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.termsConditionsAgreeBtn.click();
        checkoutPage.continueBtn.click();
        checkoutPage.confirmOrderBtn.click();
        checkoutPage.lastContinue.click();
        Assert.assertTrue(checkoutPage.verifyTotalAmount.getText().contains("€"));
        Assert.assertTrue(checkoutPage.verifyTotalAmount.getText().contains("£"));
        Assert.assertTrue(checkoutPage.verifyTotalAmount.getText().contains("$"));
    }


    @When("The user proceeds to the checkout page")
    public void theUserProceedsToTheCheckoutPage() {
    }

    @When("The user click on the shopping cart.")
    public void theUserClickOnTheShoppingCart() {
    }
}



