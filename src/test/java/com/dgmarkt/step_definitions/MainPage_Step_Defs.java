package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPage_Step_Defs {
    MainPage mainPage = new MainPage();
    @When("The User navigates to the currency selector dropdown on the home page")
    public void the_user_navigates_to_the_currency_selector_dropdown_on_the_home_page() {
    mainPage.currencyButton.click();
    }
    @Then("The user should be see the currency options\\(Euro-Pound-Dolar).")
    public void the_user_should_be_see_the_currency_options_euro_pound_dolar() {

    }
    @Then("User selects Euro as the currency")
    public void user_selects_euro_as_the_currency() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sees that Euro have been selected")
    public void sees_that_euro_have_been_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}