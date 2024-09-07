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
    public void verify_that_user_can_see_message(String message) throws InterruptedException {
        Assert.assertEquals(message,registerPage.actualMessage.getText());
    }





}
