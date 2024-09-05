package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.utilities.ConfigReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Defs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the first login page")
    public void the_user_is_on_the_first_login_page() {
        Driver.getDriver().get(ConfigReader.get("url"));

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
    @Then("The user enters own login information")
    public void the_user_enters_own_login_information() throws InterruptedException {
        loginPage.accountLogin();

    }
    @Then("The user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.get("url"));
        loginPage.login();
        loginPage.accountLogin();
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/",currentUrl);
    }
    @When("The user clicks on My Account menu")
    public void the_user_clicks_on_My_Account_menu() {
        loginPage.myAccountButton.click();
    }
    @Then("The user clicks on Logout button")
    public void the_user_clicks_on_Logout_button() {
        loginPage.logoutButton.click();
    }
    @Then("The user should be able to logout")
    public void the_user_should_be_able_to_logout() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dgmarkt.com/",currentUrl);
    }
    @Then("The user clicks on Continue button")
    public void the_user_clicks_on_continue_button() throws InterruptedException {
        Thread.sleep(2000);
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
}
