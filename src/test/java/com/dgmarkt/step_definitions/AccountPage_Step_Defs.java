package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class AccountPage_Step_Defs {

    AccountPage accountPage = new AccountPage();

    @When("user clicks Edit Account")
    public void user_clicks_edit_account() {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(accountPage.editAccount,10);
        accountPage.editAccount.click();
    }

    @When("The user clicks on Address Book from Account Page")
    public void the_user_clicks_on_address_book_from_account_page() {
        accountPage.addressBook.click();
    }


}
