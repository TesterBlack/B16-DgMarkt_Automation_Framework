package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
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

    @Then("the user enters the {string} in the blank in the password field.")
    public void the_user_enters_the_in_the_blank_in_the_password_field(String newPassword) {
        BrowserUtils.waitFor(2);
        accountPage.inputPassword.sendKeys(newPassword);
    }

    @Then("the user enters the same {string} into the blank in the confirm password field.")
    public void the_user_enters_the_same_into_the_blank_in_the_confirm_password_field(String sameNewPassword) {
        BrowserUtils.waitFor(2);
        accountPage.confirmPassword.sendKeys(sameNewPassword);
    }

    @Then("the user clicks the continue button.")
    public void the_user_clicks_the_continue_button() {
        BrowserUtils.waitFor(2);
        accountPage.continueButton.click();
    }

    @Then("User should be see the {string} {string}")
    public void user_should_be_see_the(String successMessage, String expectedMessage) {
        BrowserUtils.waitFor(4);
        accountPage.successMessagePaswordChange.isDisplayed();
        BrowserUtils.waitFor(4);
        Assert.assertEquals(successMessage, accountPage.successMessagePaswordChange.getText());

    }

    @And("the user enters the {string} into the blank in the confirm password field.")
    public void theUserEntersTheIntoTheBlankInTheConfirmPasswordField(String differentNewPassword) {
        BrowserUtils.waitFor(2);
        accountPage.confirmPassword.sendKeys(differentNewPassword);
    }

    @Then("User should see the {string} {string}")
    public void user_should_see_the(String warningMessagePaswordNotChange, String expectedMessage) {
        BrowserUtils.waitFor(4);
        accountPage.warningMessagePaswordNotChange.isDisplayed();
        BrowserUtils.waitFor(4);
        Assert.assertEquals(warningMessagePaswordNotChange, accountPage.warningMessagePaswordNotChange.getText());

    }
}
