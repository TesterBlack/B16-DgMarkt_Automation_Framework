package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.SearchPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage_Step_Defs {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @When("The user clicks on search icon on the main page")
    public void the_user_clicks_on_search_icon_on_the_main_page() {
        BrowserUtils.waitFor(2);
        mainPage.searchIcon.click();

    }

    @When("The user enters any {string} name")
    public void the_user_enters_any_name(String product) {
        BrowserUtils.waitFor(1);
        mainPage.searchField.sendKeys(product);

    }

    @When("The user clicks on search icon on search field")
    public void the_user_clicks_on_search_icon_on_search_field() {
        BrowserUtils.waitFor(1);
        mainPage.searchButtonClick.click();

    }

    @Then("The user should be able to see the list of products with the {string} name")
    public void the_user_should_be_able_to_see_the_list_of_products_with_the_name(String product) {

        List<WebElement> productList = Driver.getDriver().findElements(By.xpath("//div[@class='caption']/div/h4/a[contains(text(), '" + product + "')]"));
        System.out.println("productList.size() = " + productList.size());
        for (WebElement productElement : productList) {
            System.out.println("productElement.getText() = " + productElement.getText().toLowerCase());
            String productTitel = productElement.getText().toLowerCase();
            Assert.assertTrue(productTitel.contains(product.toLowerCase()));
        }
    }

    @Then("The user should be able to see the negative {string} message")
    public void the_user_should_be_able_to_see_the_negative_message(String noProductMessage) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(noProductMessage));
        //System.out.println(Driver.getDriver().getPageSource());
        //System.out.println("searchPage.noProductMessage.getText() = " + searchPage.noProductMessage.getText());
        //String expectedNoProductMessage = "There are no products to list in this category.";
        //Assert.assertEquals(expectedNoProductMessage, searchPage.noProductMessage.getText());


    }

}
