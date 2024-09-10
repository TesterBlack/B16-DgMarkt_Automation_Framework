package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AddressBookPage;
import com.dgmarkt.utilities.Driver;
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

    @When("The user clicks on Edit button")
    public void the_user_clicks_on_edit_button() {
        addressBookPage.editButton.click();
    }

    @When("The user enters valid credential address1 field")
    public void the_user_enters_valid_credential_address1_field() {
       addressBookPage.address1Input.clear();
       addressBookPage.address1Input.sendKeys("233535");
    }

    @When("The user clicks on Continue button on edit address page")
    public void the_user_clicks_on_continue_button_on_edit_address_page() {
        addressBookPage.continueButton.click();
    }

    @When("The user enters valid credentials without required address1 field on add address page")
    public void the_user_enters_valid_credentials_without_required_address1_field_on_add_address_page() {
       addressBookPage.fillnewAdresswithoutrequiredAddress1();
    }

    @Then("The user should receive a message {string}")
    public void the_user_should_receive_a_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, addressBookPage.errorMessageForwithoutAddress1.getText());
    }

    @When("The user enters valid credentials with default address yes on add address page")
    public void the_user_enters_valid_credentials_with_default_address_yes_on_add_address_page() {
        addressBookPage.fillnewAdresswithdefaultAddressYes();
    }

    @When("The user clicks on Continue button on add address page")
    public void the_user_clicks_on_continue_button_on_add_address_page() {
        addressBookPage.continueButton.click();
    }

    @When("The user clicks on first Delete button for first address book")
    public void the_user_clicks_on_first_delete_button_for_first_address_book() {
        addressBookPage.deletedAddress();
    }

    @When("The user clicks ok for alert message")
    public void the_user_clicks_ok_for_alert_message() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("The user should receive a success message for Delete {string}")
    public void the_user_should_receive_a_success_message_for_delete(String successMessageForDeleted) {
        Assert.assertEquals(successMessageForDeleted, addressBookPage.actualMessageForDeleted.getText());
    }

    @When("The user select as default address Yes")
    public void the_user_select_as_default_address_yes() {
        addressBookPage.defaultAddressYes.click();
    }

    @Then("The user should be see default address Yes")
    public void the_user_should_be_see_default_address_yes() {
        Assert.assertTrue(addressBookPage.defaultAddressYes.isDisplayed());
    }



}
