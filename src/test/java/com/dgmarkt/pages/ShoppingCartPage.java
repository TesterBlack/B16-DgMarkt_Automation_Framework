package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage {
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "(//a[@href=\"https://dgmarkt.com/index.php?route=checkout/checkout\"])/strong")
    public WebElement checkOutBtn;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement verifyTotalAmount;


}
