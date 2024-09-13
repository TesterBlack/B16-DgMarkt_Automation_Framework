package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "//a[text()=\"Checkout\"]")
    public WebElement checkOutBtnStock;

    @FindBy(xpath = "//strong[text()=\" Checkout\"]")
    public WebElement checkOutBtn;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement verifySubTotalAmount;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement currencyValue;

    @FindBy(xpath = "//img[@class='img-responsive img-mod-471-7403979 ls-is-cached lazyloaded']")
    public WebElement celloLcdTV;

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement celloLcdTVAddToCartBtn;

    public void setverifySubTotalAmount(){
        System.out.println("currencyValue = " + currencyValue);
        if(currencyValue.getText().contains("€")){
            Assert.assertTrue(verifySubTotalAmount.getText().contains("€"));
        } else if (currencyValue.getText().contains("£")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("£"));
        } else if (currencyValue.getText().contains("$")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("$"));
        }
    }
}
