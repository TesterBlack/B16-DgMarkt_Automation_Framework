package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import io.cucumber.java.en.When;

public class MainPage_Step_Defs {

    MainPage mainPage = new MainPage();

    @When("user clicks My Account on the main page")
    public void user_clicks_my_account_on_the_main_page() {
        mainPage.myAccountButton.click();
    }
    @When("user clicks Register on My Account")
    public void user_clicks_register_on_my_account() {
        mainPage.accountRegisterButton.click();

    }
}
