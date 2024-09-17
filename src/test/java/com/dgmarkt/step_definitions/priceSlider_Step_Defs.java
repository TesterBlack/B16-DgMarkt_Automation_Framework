package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class priceSlider_Step_Defs {
HealthAndBeautyPage healthAndBeautyPage=new HealthAndBeautyPage();

    @When("The user locates the PRICE slider on the page.")
    public void the_user_locates_the_price_slider_on_the_page() {
        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(healthAndBeautyPage.priceSliderHealthAndBeauty).perform();
    }

    @Then("I adjust the PRICE slider minimum to {int} and maximum to {int}")
    public void i_adjust_the_price_slider_minimum_to_and_maximum_to(int minPrice, int maxPrice) {
        Actions move = new Actions(Driver.getDriver());
        //int width = healthAndBeautyPage.priceSliderHealthAndBeauty.getSize().getWidth();
       // System.out.println("width = " + width);

        move.dragAndDropBy(healthAndBeautyPage.minSliderHandle, 330/3, 0).perform();
        move.dragAndDropBy(healthAndBeautyPage.maxSliderHandle, -330/2, 0).perform();
    }



    @Then("I should see products priced between {int} and {int}")
    public void i_should_see_products_priced_between_and(int minPrice, int maxPrice) {

        System.out.println("healthAndBeautyPage.productPrices = " + healthAndBeautyPage.productPrices);
        System.out.println("healthAndBeautyPage.productPrices.size() = " + healthAndBeautyPage.productPrices.size());
        System.out.println("healthAndBeautyPage.pricesOfProducts.size() = " + healthAndBeautyPage.pricesOfProducts.size());
    }

    @Then("the URL should update to reflect the selected price range")
    public void the_url_should_update_to_reflect_the_selected_price_range() {

    }

    @Then("the number of filtered products should be displayed")
    public void the_number_of_filtered_products_should_be_displayed() {

    }



    @When("I adjust the PRICE slider minimum to {string}")
    public void i_adjust_the_price_slider_minimum_to(String string) {

    }

    @Then("I should see products priced from {string} onwards")
    public void i_should_see_products_priced_from_onwards(String string) {

    }

    @Then("the URL should update to reflect the selected minimum price")
    public void the_url_should_update_to_reflect_the_selected_minimum_price() {

    }




    @When("I adjust the PRICE slider maximum to {string}")
    public void i_adjust_the_price_slider_maximum_to(String maxPrice) {
        Actions move = new Actions(Driver.getDriver());

        move.dragAndDropBy(healthAndBeautyPage.maxSliderHandle, Integer.parseInt(maxPrice), 0).perform();
    }

    @Then("I should see products priced up to {string}")
    public void i_should_see_products_priced_up_to(String maxPrice) {
        for (WebElement priceElement : healthAndBeautyPage.productPrices) {
            String priceText = priceElement.getText().replace("€", "").trim(); // Fiyat sembolünü kaldırıyoruz
            double price = Double.parseDouble(priceText);
            Assert.assertTrue("Product price exceeds the maximum price!", price <= Double.parseDouble(maxPrice));
    }
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
