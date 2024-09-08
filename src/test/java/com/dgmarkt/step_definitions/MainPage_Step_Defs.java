package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    public void the_user_navigates_to_the_currency_selector_dropdown_on_the_home_page()throws InterruptedException {
        Thread.sleep(2000);
        mainPage.currencyButton.click();
    }
    @Then("The user should be see the currency options\\(Euro-Pound-Dolar).")
    public void the_user_should_be_see_the_currency_options_euro_pound_euro() throws InterruptedException{
        Thread.sleep(2000);
        BrowserUtils.clickWithJS(mainPage.currenyEuroButton);
    }
    @Then("User selects Euro as the currency")
    public void user_selects_euro_as_the_currency() {


    }
    @Then("sees that Euro have been selected")
    public void sees_that_euro_have_been_selected() {

    }


    @When("The user should be see the currency options\\(Euro-Pound-Dolar)")
    public void the_user_should_be_see_the_currency_options_euro_pound_pounds() {

    }
    @Then("User selects pounds as the currency")
    public void user_selects_pounds_as_the_currency() {

    }
    @Then("sees that pounds have been selected")
    public void sees_that_pounds_have_been_selected() {

    }

    @Then("User selects dolar as the currency")
    public void user_selects_dolar_as_the_currency() {

    }
    @Then("sees that dolar have been selected")
    public void sees_that_dolar_have_been_selected() {

    }



}
