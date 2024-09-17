package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
        Actions move = new Actions(Driver.getDriver());
        //int width = healthAndBeautyPage.priceSliderHealthAndBeauty.getSize().getWidth();
        // System.out.println("width = " + width);
        move.dragAndDropBy(healthAndBeautyPage.minSliderHandle, 330 / 3, 0).perform();
        BrowserUtils.waitFor(5);
        move.dragAndDropBy(healthAndBeautyPage.maxSliderHandle, -330 / 2, 0);
    }


    @Then("I should see products priced between {int} and {int}")
    public void i_should_see_products_priced_between_and(int minPrice, int maxPrice) {
        System.out.println("healthAndBeautyPage.productPrices = " + healthAndBeautyPage.pricesOfProducts);
        System.out.println("healthAndBeautyPage.productPrices.size() = " + healthAndBeautyPage.pricesOfProducts.size());
        System.out.println("healthAndBeautyPage.pricesOfProducts.size() = " + healthAndBeautyPage.pricesOfProducts.size());
    }

    @When("I adjust the PRICE slider minimum to {int}")
    public void iAdjustThePRICESliderMinimumTo(int price) {
        Actions move = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(5);
        BrowserUtils.executeJScommand("document.getElementById('price-from').value = '100';");
        BrowserUtils.executeJScommand("document.getElementById('price-to').value = '300';");

        // Sayfayı kaydırarak slider'ı görünür hale getirme
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", healthAndBeautyPage.priceSliderHandleHealthAndBeauty);

        // Slider'ı hareket ettirme
        Actions move2 = new Actions(Driver.getDriver());
        move2.dragAndDropBy(healthAndBeautyPage.minSliderHandle, healthAndBeautyPage.getSliderOffsetForPrice(price), 0);
    }

    @Then("I should see products priced from {int} onwards")
    public void i_should_see_products_priced_from_onwards(int string) {

    }

    @Then("the URL should update to reflect the selected minimum price")
    public void the_url_should_update_to_reflect_the_selected_minimum_price(int minPrice) {
        healthAndBeautyPage.getAllProductPrices(minPrice);
    }


    @When("I adjust the PRICE slider maximum to {int}")
    public void i_adjust_the_price_slider_maximum_to(int maxPrice) {
        Actions move = new Actions(Driver.getDriver());

       // move.dragAndDropBy(healthAndBeautyPage.maxSliderHandle, Integer.parseInt(maxPrice), 0).perform();
    }

    @Then("I should see products priced up to {int}")
    public void i_should_see_products_priced_up_to(int maxPrice) {


    }

    @Then("the URL should update to reflect the selected maximum price")
    public void the_url_should_update_to_reflect_the_selected_maximum_price() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        //Assert.assertTrue("URL does not reflect the selected maximum price!", currentUrl.contains("max-price="));
    }

    @Then("I should see no products displayed")
    public void iShouldSeeNoProductsDisplayed() {

    }

    @And("a message should be shown saying {string}")
    public void aMessageShouldBeShownSaying(String arg0) {
    }

    @When("I reset the PRICE slider to its default values")
    public void i_reset_the_price_slider_to_its_default_values() {

    }

    @Then("I should see all products on the Sub-Category Page")
    public void i_should_see_all_products_on_the_sub_category_page() {

    }

}
