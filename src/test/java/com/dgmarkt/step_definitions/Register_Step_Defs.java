package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.RegisterPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static org.bouncycastle.cms.RecipientId.password;

public class Register_Step_Defs {

    RegisterPage registerPage = new RegisterPage();


    @When("user enters {string} firstname")
    public void user_enters_firstname(String firstname) {
        registerPage.firstnameInput.sendKeys(firstname);
    }

    @When("user enters {string} lastname")
    public void user_enters_lastname(String lastname) {
        registerPage.lastnameInput.sendKeys(lastname);
    }

    @When("user enters {string} email")
    public void user_enters_email(String email) {
        registerPage.emailInput.sendKeys(email);
    }

    @When("user enters {string} telephone")
    public void user_enters_telephone(String telephone) {
      registerPage.telephoneInput.sendKeys(telephone);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        registerPage.passwordInput.sendKeys(password);
    }

    @When("user enters {string} password Confirm")
    public void user_enters_password_confirm(String passwordConfirm) {
        registerPage.passwordConfirmInput.sendKeys(passwordConfirm);
    }

    @When("user clicks checkBox")
    public void user_clicks_check_box() {
        registerPage.checkBoxFürAgree.click();
    }

    @When("user clicks Continue")
    public void user_clicks_continue() throws InterruptedException {
       registerPage.continueButton.click();
    }

    @When("user clicks alert")
    public void user_clicks_alert() {
    }


    @Then("verify that user can see {string} message")
    public void verify_that_user_can_see_message(String message) {
        Assert.assertEquals(message,registerPage.actualMessage.getText());
    }

    @Then("verify that user can see error message for Email {string}")
    public void verify_that_user_can_see_error_message(String errorMessageForEmail){
        Assert.assertEquals(errorMessageForEmail,registerPage.actualErrorMessageForEmail.getText());
    }

    @Then("verify that user can see error message for Firstname {string}")
    public void verify_that_user_can_see_error_message_for_firstname(String errorMessageForFirstname) {
         Assert.assertEquals(errorMessageForFirstname,registerPage.actualErrorMessageForFirstname.getText());
    }

    @Then("verify that user can see error message for Lastname {string}")
    public void verify_that_user_can_see_error_message_for_lastname(String errorMessageForLastName) {
        Assert.assertEquals(errorMessageForLastName,registerPage.actualErrorMessageForLastname.getText());
    }

    @Then("verify that user can see error message for Telephone {string}")
    public void verify_that_user_can_see_error_message_for_telephone(String errorMessageForTelephone) {
        Assert.assertEquals(errorMessageForTelephone,registerPage.actualErrorMessageForTelephone.getText());
    }

    @Then("verify that user can see error message for Password {string}")
    public void verify_that_user_can_see_error_message_for_password(String errorMessageForPassword) {
      Assert.assertEquals(errorMessageForPassword,registerPage.actualErrorMessageForPassword.getText());
    }

    @Then("verify that user can see error message for checkbox {string}")
    public void verify_that_user_can_see_error_message_for_checkbox(String errorMessageForCheckbox) {
       Assert.assertEquals(errorMessageForCheckbox,registerPage.actualErrorMessageForCheckbox.getText());
    }

    @Then("verify that user can see error message for beide Password {string}")
    public void verify_that_user_can_see_error_message_for_beide_password(String errorMessageForBeidePassword) {
       Assert.assertEquals(errorMessageForBeidePassword,registerPage.actualErrorMessageForBeidePassword.getText());
    }


    @Then("verify that user can see error message for Register Email {string}")
    public void verify_that_user_can_see_error_message_for_register_email(String errorMessageForRegisterEmail) {
        Assert.assertEquals(errorMessageForRegisterEmail,registerPage.actualErrorMessageForRegisterEmail.getText());
    }

    @Then("verify that user can see message for invalid Telephone {string}")
    public void verify_that_user_can_see_message_for_invalid_telephone(String messageForInvalidTelephone) {
        Assert.assertEquals(messageForInvalidTelephone,registerPage.actualmessageForInvalidTelephone.getText());
    }







}
