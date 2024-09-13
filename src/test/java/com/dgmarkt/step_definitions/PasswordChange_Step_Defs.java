package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.pages.EditAccountPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PasswordChange_Step_Defs {
    AccountPage accountPage = new AccountPage();
    MainPage mainPage = new MainPage();


    @Then("user clicks Password button")
    public void user_clicks_password_button() {
       BrowserUtils.waitFor(3);
       accountPage.passwordBtnMyAccount.click();
    }

    @Then("the user enters the {inputPassword} in the blank in the password field.")
    public void the_user_enters_the_in_the_blank_in_the_password_field() {
       accountPage.inputPassword.sendKeys("");
    }

    @Then("the user enters the same {string} into the blank in the confirm password field.")
    public void the_user_enters_the_same_into_the_blank_in_the_confirm_password_field() {
        accountPage.confirmPassword.sendKeys("");
    }

    @Then("the user clicks the continue button.")
    public void the_user_clicks_the_continue_button(String string) {
        accountPage.continueButton.click();
    }

    @Then("User should be see the {string} {string}")
    public void user_should_be_see_the(String SuccessMessage) {
        accountPage.successMessagePaswordChange.isDisplayed();
        Assert.assertEquals(SuccessMessage,accountPage.successMessagePaswordChange.getText());
    }





/*

    @Then("the user enters the {string} in the blank in the password field.")
    public void the_user_enters_the_in_the_blank_in_the_password_field(String string) {

    }
    @Then("the user enters the same {string} into the blank in the confirm password field.")
    public void the_user_enters_the_same_into_the_blank_in_the_confirm_password_field(String string) {

    }
    @Then("the user clicks the continue button.")
    public void the_user_clicks_the_continue_button() {

    }
    @Then("User should be see the {string} {string}")
    public void user_should_be_see_the(String string, String string2) {

    }






    @Then("the user enters the {string} in the blank in the password field.")
    public void the_user_enters_the_in_the_blank_in_the_password_field(String string) {

    }
    @Then("the user enters the {string} into the blank in the confirm password field.")
    public void the_user_enters_the_into_the_blank_in_the_confirm_password_field(String string) {

    }
    @Then("the user clicks the continue button.")
    public void the_user_clicks_the_continue_button() {

    }
    @Then("User should be see the {string} {string}")
    public void user_should_be_see_the(String string, String string2) {

    }






    @Then("user clicks Password")
    public void user_clicks_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user enters the {string} in the blank in the password field.")
    public void the_user_enters_the_in_the_blank_in_the_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user enters the {string} into the blank in the confirm password field.")
    public void the_user_enters_the_into_the_blank_in_the_confirm_password_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user clicks the continue button.")
    public void the_user_clicks_the_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be see the {string} {string}")
    public void user_should_be_see_the(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


 */







}
