package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class priceSlider_Step_Defs {
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();
    Integer minValue;
    Integer maxValue;

    @When("The user locates the PRICE slider on the page.")
    public void the_user_locates_the_price_slider_on_the_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(healthAndBeautyPage.priceSliderHandleHealthAndBeauty).perform();
    }

    @Then("I adjust the PRICE slider minimum to {int} and maximum to {int}")
    public void i_adjust_the_price_slider_minimum_to_and_maximum_to(int minPrice, int maxPrice) {
        BrowserUtils.waitFor(3);
        healthAndBeautyPage.adjustPriceSlider2(minPrice, maxPrice);
        minValue = Integer.parseInt(healthAndBeautyPage.l_minPrice.getAttribute("value"));
        maxValue = Integer.parseInt(healthAndBeautyPage.l_maxPrice.getAttribute("value"));
    }

    @Then("I should see that the product prices are within desired range")
    public void iShouldSeeThatTheProductPricesAreWithinDesiredRange() {
        BrowserUtils.waitFor(2);
        List<Integer> prices = new ArrayList<>();
        for (WebElement pricesOfProduct : healthAndBeautyPage.pricesOfProducts) {
            int price = Integer.parseInt(pricesOfProduct.getText().substring(1, 4));
            prices.add(price);
        }

        Collections.sort(prices, Collections.reverseOrder());
        for (int price : prices) {
            if (price >= minValue && price <= maxValue) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
    }

    @And("a message should be shown saying {string}")
    public void aMessageShouldBeShownSaying(String arg0) {
        String actualMessage = healthAndBeautyPage.noProductsMessage.getText();
        BrowserUtils.waitForVisibility(healthAndBeautyPage.noProductsMessage, 10);
        BrowserUtils.waitFor(5);
        Assert.assertEquals("There are no products to list in this category.", actualMessage);
    }

}


