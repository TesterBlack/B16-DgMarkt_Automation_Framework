package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class priceSlider_Step_Defs {
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();

    @When("The user locates the PRICE slider on the page.")
    public void the_user_locates_the_price_slider_on_the_page() {
        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(healthAndBeautyPage.priceSliderHandleHealthAndBeauty).perform();
    }

    @Then("I adjust the PRICE slider minimum to {int} and maximum to {int}")
    public void i_adjust_the_price_slider_minimum_to_and_maximum_to(int minPrice, int maxPrice) {
        healthAndBeautyPage.adjustPriceSlider(150, 300);
    }

    @Then("I should see products priced between {int} and {int}")
    public void i_should_see_products_priced_between_and(int minPrice, int maxPrice) {
        System.out.println("healthAndBeautyPage.productPrices = " + healthAndBeautyPage.pricesOfProducts);
        System.out.println("healthAndBeautyPage.productPrices.size() = " + healthAndBeautyPage.pricesOfProducts.size());
        System.out.println("healthAndBeautyPage.pricesOfProducts.size() = " + healthAndBeautyPage.pricesOfProducts.size());
    }

    @When("I adjust the PRICE slider minumum to {int}")
    public void iAdjustThePRICESliderMinumumTo(int minPrice) {
        healthAndBeautyPage.adjustPriceSlider(0, minPrice);
    }

    @Then("I should see products priced from {int}")
    public void iShouldSeeProductsPricedFrom(int minPrice) {
        healthAndBeautyPage.getAllProductPrices(minPrice);
    }


    @When("I adjust the PRICE slider maximum to {int}")
    public void i_adjust_the_price_slider_maximum_to(int maxPrice) {
        healthAndBeautyPage.adjustPriceSlider(0, maxPrice);
    }

    @Then("I should see products priced up to {int}")
    public void i_should_see_products_priced_up_to(int maxPrice) {
        healthAndBeautyPage.getAllProductPrices(maxPrice);

    }
    @When("I adjust the PRICE slider maximum to {int} and minimum to {int} and")
    public void iAdjustThePRICESliderMaximumToAndMinimumToAnd(int maxPrice, int minPrice) {
        healthAndBeautyPage.adjustPriceSlider(150,300);

    }
    @Then("I should see no products displayed")
    public void iShouldSeeNoProductsDisplayed() {
        healthAndBeautyPage.getAllProductPrices(0);
    }

    @And("a message should be shown saying {string}")
    public void aMessageShouldBeShownSaying(String arg0) {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("There are no products to list in this category.", healthAndBeautyPage.noProductsMessage.getText());
    }

    @When("I reset the PRICE slider to its default values")
    public void i_reset_the_price_slider_to_its_default_values() {
       healthAndBeautyPage.resetPriceSliderToDefault(102,485 );
    }

    @Then("I should see all products on the Sub-Category Page")
    public void i_should_see_all_products_on_the_sub_category_page() {
        healthAndBeautyPage.getAllProductPrices(102);
    }



}
