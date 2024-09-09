package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AddressBookPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddressBook_Step_Defs {

    AddressBookPage addressBookPage = new AddressBookPage();

    @When("The user should be successfully navigated to the Address Book page")
    public void the_user_should_be_successfully_navigated_to_the_address_book_page() {
        Assert.assertTrue(addressBookPage.addressBookEnties.isDisplayed());
    }
}
