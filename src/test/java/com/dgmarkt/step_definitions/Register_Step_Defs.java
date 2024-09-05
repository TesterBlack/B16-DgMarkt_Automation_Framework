package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.bouncycastle.cms.RecipientId.password;

public class Register_Step_Defs {

    RegisterPage registerPage = new RegisterPage();


    @When("user enters {string} firstname")
    public void userEntersFirstname(String firstname) {
        registerPage.firstnameInput.sendKeys(firstname);
    }

    @When("user enters {string} lastname")
    public void userEntersLastname(String lastname) {
        registerPage.lastnameInput.sendKeys(lastname);
    }

    @When("user enters {string} email")
    public void userEntersEmail(String email) {
        registerPage.emailInput.sendKeys(email);
    }

    @When("user enters {string} telephone")
    public void userEntersTelephone(String telephone) {
        registerPage.telephoneInput.sendKeys(telephone);
    }

    @When("user enters {string} password")
    public void userEntersPassword(String password) {
        registerPage.passwordInput.sendKeys(password);
    }

    @When("user enters {string} password Confirm")
    public void userEntersPasswordConfirm(String passwordConfirm) {
        registerPage.passwordConfirmInput.sendKeys(passwordConfirm);
    }


    @And("user clicks checkBox")
    public void userClicksCheckBox() {
        registerPage.checkBoxFürAgree.click();
    }

    @And("user clicks Continue")
    public void userClicksContinue() {
        registerPage.continueButton.click();
    }

    @Then("verify that user can see {string} message")
    public void verifyThatUserCanSeeMessage(String message) {
        String actualMessage = "";
        Assert.assertEquals(message,actualMessage);

    }


}
