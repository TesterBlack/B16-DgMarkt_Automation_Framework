package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
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

    @When("user cliks My Account from Dropdown menu")
    public void user_cliks_my_account_from_dropdown_menu() {
        mainPage.myAccount2Button.click();
    }
}
