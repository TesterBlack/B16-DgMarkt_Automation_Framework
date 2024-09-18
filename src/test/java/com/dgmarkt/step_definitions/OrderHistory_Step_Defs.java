package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.OrderHistoryPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderHistory_Step_Defs {

    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    @Then("The user should be able to see completed purchase on the Order History page")
    public void the_user_should_be_able_to_see_completed_purchase_on_the_order_history_page() {
        Assert.assertTrue(orderHistoryPage.orderHistoryTable.isDisplayed());
    }

    @Then("The user should be able to see a message on the Order History page {string}")
    public void the_user_should_be_able_to_see_a_message_on_the_order_history_page(String expectedMessage) {
        Assert.assertEquals(expectedMessage, orderHistoryPage.orderHistoryMessage.getText());
    }

    @When("The user clicks on view button")
    public void the_user_clicks_on_view_button() {
        orderHistoryPage.viewOrderButton.click();
    }

    @Then("The user should be able to see the order information page")
    public void the_user_should_be_able_to_see_the_order_information_page() {
        String expectedUrl = "https://dgmarkt.com/index.php?route=account/order/info&order_id=2093";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("The user clicks on Re-order button")
    public void the_user_clicks_on_re_order_button() {
        //BrowserUtils.waitFor(1);
        orderHistoryPage.reOrderButton().click();
    }

    @Then("The user should be able to see the following message {string}")
    public void the_user_should_be_able_to_see_the_following_message(String alertMessage) {
        orderHistoryPage.verifyAlertMessage(alertMessage);
    }

    @When("The user clicks on Return button")
    public void the_user_clicks_on_return_button() {
        //BrowserUtils.waitFor(1);
        orderHistoryPage.returnButton().click();
    }

    @Then("The user should be able to see the Product Returns page")
    public void the_user_should_be_able_to_see_the_product_returns_page() {
        String actualPage = Driver.getDriver().findElement(By.xpath("//li[a=' Product Returns']")).getText();
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Product Returns", actualPage);
    }

    @Then("The user checks the Product Information for correct product name")
    public void the_user_checks_the_product_information_for_correct_product_name() {
        BrowserUtils.scrollToElement(orderHistoryPage.productName);
        orderHistoryPage.productName.getAttribute("value");
        //BrowserUtils.waitFor(1);
        Assert.assertEquals("ASUS ROG STRIX GS-AX3000", orderHistoryPage.productName.getAttribute("value"));
    }

    @Then("The user clicks Order Error radio button")
    public void the_user_clicks_order_error_radio_button() {
        orderHistoryPage.orderErrorRadioButton.click();
    }

    @Then("The user should be able to see the Order Error button is clicked")
    public void the_user_should_be_able_to_see_the_order_error_button_is_clicked() {
        //BrowserUtils.waitFor(1);
        Assert.assertTrue(orderHistoryPage.orderErrorRadioButton.isSelected());
    }

    @Then("The user clicks Submit button")
    public void the_user_clicks_submit_button() {
        orderHistoryPage.submitButton.click();
        //BrowserUtils.waitFor(1);
    }

    @Then("The user should be able to see a message {string}")
    public void the_user_should_be_able_to_see_a_message(String message) {
        Assert.assertEquals(message, orderHistoryPage.productReturnMessage1.getText());
        //BrowserUtils.waitFor(1);
    }
}
