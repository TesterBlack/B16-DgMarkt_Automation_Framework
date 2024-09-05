package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.utilities.ConfigReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    }
    @Then("The user enters own login information")
    public void the_user_enters_own_login_information() throws InterruptedException {
        loginPage.accountLogin();


    }
}
