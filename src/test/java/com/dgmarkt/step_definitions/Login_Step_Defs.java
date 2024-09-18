package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_Step_Defs {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("The user is on the first login page")
    public void the_user_is_on_the_first_login_page() {
        Driver.getDriver().get(ConfigReader.get("url"));

    }
    @Then("The user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.get("url"));
        loginPage.login();
        loginPage.accountLogin();
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/", currentUrl);
    }


    @Given("The new user is on the login page")
    public void the_new_user_is_on_the_login_page() throws InterruptedException {
        loginPage.login();
        loginPage.myAccountButton.click();
        loginPage.accountLoginButton.click();
        loginPage.accountEmailBox.sendKeys("test@mail.com");
        loginPage.accountPasswordBox.sendKeys("test123");
        loginPage.accountLoginClickButton.click();
    }


    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() throws InterruptedException {
        loginPage.login();
    }
    @Then("The user should be able to see main page")
    public void the_user_should_be_able_to_see_main_page() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/",currentUrl);
    }
    @When("The user enters own login information")
    public void the_user_enters_own_login_information() throws InterruptedException {
        loginPage.accountLogin();
    }
    @When("The user should be able to logged in")
    public void the_user_successfully_logged_in() {
        String actualMessage = loginPage.successLoginMessage.getText();
        String expectedMessage = "Congratulation! Login Successfully\n" +
                "×";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("The user clicks on My Account menu")
    public void the_user_clicks_on_My_Account_menu() {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(loginPage.myAccountButton);
    }
    @Then("The user clicks on Logout button")
    public void the_user_clicks_on_Logout_button() {
        loginPage.logoutButton.click();
    }
    @Then("The user should be able to logout")
    public void the_user_should_be_able_to_logout() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/",currentUrl);
        BrowserUtils.waitForClickablility(loginPage.continueButton,1000);
    }
    @Then("The user clicks on Continue button")
    public void the_user_clicks_on_continue_button() {
        loginPage.continueButton.click();
    }
    @Then("The user closes the newsletter popup")
    public void the_user_closes_the_newsletter_popup() {
        loginPage.poupClose.click();
    }
    @Then("The user should be able to see login main page")
    public void the_user_should_be_able_to_see_login_main_page() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/",currentUrl);
    }
    @Then("The user clicks my account button")
    public void the_user_clicks_my_account_button() {
        loginPage.myAccountButton.click();
    }
    @Then("The user clicks account login button")
    public void the_user_clicks_account_login_button() {
        loginPage.accountLoginButton.click();
    }
    @When("The user enters {string} accountEmail")
    public void the_user_enters_account_username(String accountEmail)  {
        loginPage.accountEmailBox.sendKeys(accountEmail);
    }
    @When("The user enters {string} accountPassword")
    public void the_user_enters_account_password(String accountPassword) {
        loginPage.accountPasswordBox.sendKeys(accountPassword);
    }
    @When("The user clicks account login click button")
    public void the_user_clicks_account_login_click_button() {
        loginPage.accountLoginClickButton.click();
    }
  
    @When("The user enters {string} wrong accountEmail")
    public void the_user_enters_wrong_account_email(String wrongAccountEmail) {
       loginPage.accountEmailBox.sendKeys(wrongAccountEmail);
    }

    @Then("The user should not be able to logged in with wrong email")
    public void the_user_should_not_be_able_to_logged_in_with_wrong_email() {
        String  actualFailedLoginMessage= loginPage.failedLoginMessage.getText();
        String  expectedFailedLoginMessage= "Warning: No match for E-Mail Address and/or Password." +
                "×";
        Assert.assertEquals(expectedFailedLoginMessage,actualFailedLoginMessage);
        Driver.closeDriver();
    }

    @Then("The user should be able to see {string} for five invalid login attempts")
    public void the_user_should_be_able_to_see_for_five_invalid_login_attempts(String string) {

    }
    @When("The user enters {string} as wrong accountEmail")
    public void the_user_enters_as_wrong_account_email(String wrongAccountEmail) {
        loginPage.accountEmailBox.sendKeys(wrongAccountEmail);

    }
    @When("The user enters {string} as accountPassword")
    public void the_user_enters_as_account_password(String wrongAccountPassword) {
        loginPage.accountPasswordBox.sendKeys(wrongAccountPassword);

    }
  @When("The user clicks on Back button")
    public void the_user_clicks_on_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("The user should able to see login button by clicking on My Account menu")
    public void the_user_should_able_to_see_login_button_by_clicking_on_my_account_menu() {
        loginPage.myAccountButton.click();
        String expectedAccountLoginButton = "Login";
        String actualAccountLoginButton = loginPage.accountLoginButton.getText();
        Assert.assertEquals(expectedAccountLoginButton,actualAccountLoginButton);
    }
    @Then("The user should be able to see the password as bullet signs")
    public void the_user_should_be_able_to_see_the_password_as_bullet_signs() {
        Assert.assertEquals("password",loginPage.accountPasswordBox.getAttribute("type"));
    }
    @When("The user clicks Forgotten Password button")
    public void the_user_clicks_forgotten_password_button() {
        loginPage.forgottenPasswordButton.click();
    }
    @When("The user clicks Continue button")
    public void the_user_clicks_continue_button() {
        loginPage.continueButton2.click();
    }
    @Then("The user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String expectedMessage) {
        String actualMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

}






