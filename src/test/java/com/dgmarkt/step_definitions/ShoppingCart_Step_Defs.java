package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.MainPage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCart_Step_Defs {

    MainPage mainPage = new MainPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    String expectedName;
    String expectedQuantity;

    @When("The user clicks on the product")
    public void the_user_clicks_on_the_product() {
        BrowserUtils.waitFor(1);
        shoppingCartPage.productSelect.click();
    }
    @When("The user enters {string} quantity")
    public void the_user_enters_quantity(String quantity) {
        shoppingCartPage.quantityInProductPage.sendKeys(quantity);
    }

    @When("The user clicks on add to cart button")
    public void the_user_clicks_on_add_to_cart_button() {
        shoppingCartPage.addToCartButton.click();
        BrowserUtils.waitFor(1);
    }
    @Then("The user should be able to see the added product")
    public void the_user_should_be_able_to_see_the_added_product() {
        expectedName = shoppingCartPage.productNameInProductPage.getText().toLowerCase();
        String actualName = shoppingCartPage.productNameInCart.getText().toLowerCase();
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
        Assert.assertEquals(expectedName, actualName);
        expectedQuantity= shoppingCartPage.quantityInProductPage.getAttribute("value");
        BrowserUtils.waitFor(2);
    }
    @When("The user clicks View Cart button")
    public void the_user_clicks_view_cart_button() {
        shoppingCartPage.viewCartBtn.click();
    }
    @Then("User should be able to see the products added to the cart with correct quantity in checkout page")
    public void user_should_be_able_to_see_the_products_added_to_the_cart_with_correct_quantity_in_checkout_page() {
        String actualNameInShoppingCart = shoppingCartPage.productNameInShoppingCart.getText().toLowerCase();
        Assert.assertEquals(expectedName, actualNameInShoppingCart);
        System.out.println("actualNameInShoppingCart = " + actualNameInShoppingCart);

        System.out.println("expectedQuantity = " + expectedQuantity);
        String actualQuantity = shoppingCartPage.quantityInShoppingCart.getAttribute("value");
        System.out.println("expectedQuantity = " + expectedQuantity);
        System.out.println("actualQuantity = " + actualQuantity);
        Assert.assertEquals(expectedQuantity, actualQuantity);
        //shoppingCartPage.removeProductInShoppingCart.click(); NOTE: Burasi B16DDM-185'de kapali, 111 ve 157'de acik olacak

    }


}
