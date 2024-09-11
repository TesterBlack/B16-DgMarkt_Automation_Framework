package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ProductComparePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductCompare_Step_Defs {

    ProductComparePage productComparePage =new ProductComparePage();

    @When("The user clicks Product Compare on this page")
    public void the_user_clicks_product_compare_on_this_page() {
        productComparePage.productCompareButton.click();
    }

    @Then("The user should be able to navigate the Product Compare Page")
    public void the_user_should_be_able_to_navigate_the_product_compare_page() {
        Assert.assertEquals(productComparePage.productComparisonText.getText(),"Product Comparison");
    }

    @When("The user clicks {string} on the other product they want to compare")
    public void the_user_clicks_on_the_other_product_they_want_to_compare(String productName) {
        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("//img[@title='"+productName+"']")));
        BrowserUtils.clickWithJS(Driver.getDriver().findElement(By.xpath("((//img[@title='"+productName+"']//parent::a//parent::div//div)[3]/button)[1]")));
    }

    @When("The user closes the received message")
    public void the_user_closes_the_received_message() {
        productComparePage.alertCloseButton.click();
    }

    @Then("The user should be able to see {string} and {string}")
    public void the_user_should_be_able_to_see_and(String firstProduct, String secondProduct) {
        productComparePage.getProductOnProductComparePage(firstProduct, secondProduct);
    }

}
