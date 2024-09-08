package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import io.cucumber.java.en.When;

public class AccountPage_Step_Defs {

    AccountPage accountPage = new AccountPage();

    @When("user clicks Edit Account")
    public void user_clicks_edit_account() {
        accountPage.editAccount.click();

    }


}
