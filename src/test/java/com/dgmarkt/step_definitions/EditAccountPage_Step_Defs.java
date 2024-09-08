package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.pages.EditAccountPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditAccountPage_Step_Defs {

    AccountPage accountPage = new AccountPage();
    EditAccountPage editAccountPage = new EditAccountPage();

    @When("The user updates the First Name field with valid information")
    public void the_user_updates_the_first_name_field_with_valid_information() {
       // editAccountPage.firstNameInput.click();
        editAccountPage.firstNameInput.clear();
        editAccountPage.firstNameInput.sendKeys("Hakan");
       // BrowserUtils.waitFor(4);
    }

    @When("The user clicks Continue button on Edit Account site")
    public void the_user_clicks_continue_button_on_edit_account_site() {
        editAccountPage.continueButton.click();
       // BrowserUtils.waitFor(4);
    }

    @Then("The user should receive a success message {string}")
    public void the_user_should_receive_a_success_message(String message) {
        Assert.assertEquals(message, accountPage.messageForEdit.getText());
    }

    @When("The user updates the Last Name field with valid information")
    public void the_user_updates_the_last_name_field_with_valid_information() {
       //editAccountPage.lastNameInput.click();
       editAccountPage.lastNameInput.clear();
       editAccountPage.lastNameInput.sendKeys("Kaya");
    }

    @When("The user updates the Telephone field with valid information")
    public void the_user_updates_the_telephone_field_with_valid_information() {
       // editAccountPage.telephoneInput.click();
        editAccountPage.telephoneInput.clear();
        editAccountPage.telephoneInput.sendKeys("987654321");
    }

    @When("The user updates the E-Mail field with valid information")
    public void the_user_updates_the_e_mail_field_with_valid_information() {
        editAccountPage.emailInput.clear();
        editAccountPage.emailInput.sendKeys("login15645@gmail.com");
    }

    @When("The user does not fill in the required First Name field")
    public void the_user_does_not_fill_in_the_required_first_name_field() {
        editAccountPage.firstNameInput.clear();
        editAccountPage.firstNameInput.sendKeys("");
    }

    @When("The user does not fill in the required Last Name field")
    public void the_user_does_not_fill_in_the_required_last_name_field() {
        editAccountPage.lastNameInput.clear();
        editAccountPage.lastNameInput.sendKeys("");
    }

    @When("The user does not fill in the required Telephone field")
    public void the_user_does_not_fill_in_the_required_telephone_field() {
       editAccountPage.telephoneInput.clear();
       editAccountPage.telephoneInput.sendKeys("");
    }

    @When("The user does not fill in the required E-Mail field")
    public void the_user_does_not_fill_in_the_required_e_mail_field() {
        editAccountPage.emailInput.clear();
        editAccountPage.emailInput.sendKeys("");
    }

    @When("The user attempted update with invalid E-Mail format {string}")
    public void the_user_attempted_update_with_invalid_e_mail_format(String invalidEmailFormat) {
        editAccountPage.emailInput.clear();
        editAccountPage.emailInput.sendKeys(invalidEmailFormat);
    }




    @When("updates user E-Mail details with an already registered E-Mail address")    // TC11
    public void updates_user_e_mail_details_with_an_already_registered_e_mail_address() {
        editAccountPage.emailInput.clear();
        editAccountPage.emailInput.sendKeys("sdet1607@gmail.com");
    }

    @When("User enters invalid characters in the Telephone field {string}")
    public void user_enters_invalid_characters_in_the_telephone_field(String telephoneFieldWithInvalidCharacters) {
        editAccountPage.telephoneInput.clear();
        editAccountPage.telephoneInput.sendKeys(telephoneFieldWithInvalidCharacters);
    }

    @When("The user attempted update with invalid Email format {string}")
    public void the_user_attempted_update_with_invalid_email_format(String invalidEmailFormat) {
        editAccountPage.emailInput.clear();
        editAccountPage.emailInput.sendKeys(invalidEmailFormat);

    }
    @Then("The user should receive a success message for Invalid Email Format {string}")
    public void the_user_should_receive_a_success_message_for_invalid_email_format(String errorMessage) {
        Assert.assertEquals(errorMessage, accountPage.messageForEdit.getText());

    }














}
