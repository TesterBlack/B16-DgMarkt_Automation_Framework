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

    @When("The user clicks on New Address button")
    public void the_user_clicks_on_new_address_button() {
        addressBookPage.newAddressButton.click();
    }
    @When("The user enters valid credentials on add address page")
    public void the_user_enters_valid_credentials_on_add_address_page() {
        addressBookPage.fillnewAdress();
    }
    @When("The user should receive a success message for new addresse {string}")
    public void the_user_should_receive_a_success_message_for_new_addresse(String successMessage) {
        Assert.assertEquals(addressBookPage.actualMessageForNewAddress.getText(), successMessage);
    }

}
