package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPage_Step_Defs {

    MainPage mainPage = new MainPage();

    @When("user clicks My Account on the main page")
    public void user_clicks_my_account_on_the_main_page() throws InterruptedException {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(mainPage.myAccountButton);
    }

    @When("user clicks Register on My Account")
    public void user_clicks_register_on_my_account() {
        mainPage.accountRegisterButton.click();
    }


    @When("The user clicks {string} header")
    public void the_user_clicks_header(String headerText) {
        mainPage.getHeader(headerText).click();
    }
    @Then("The user should be able to see the {string} page")
    public void the_user_should_be_able_to_see_the_page(String expectedPage) {
        String actualPage = mainPage.getPage().getText();
        BrowserUtils.waitForVisibility(mainPage.getPage(), 5);
        Assert.assertEquals(expectedPage,actualPage);
    }

}