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

    @FindBy(xpath = "//strong[contains(.,'Checkout')]")
    public WebElement checkOutBtn;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement verifySubTotalAmount;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement currencyValue;

/*
    public void productAddToCart(String productName) {
        String product1 = "//a[text()='"+productName+"']/../../../..//button[2]";
        Driver.getDriver().findElement(By.xpath(product1)).click();
    }

 */
/*
    @FindBy(xpath = " (//span)[1]")
    public WebElement categoryTab;
    @FindBy(xpath = "(//div[@class='image'])[1]")
    public WebElement Televisions;

 */

    @FindBy(xpath = "//img[@class='img-responsive img-mod-471-7403979 ls-is-cached lazyloaded']")
    public WebElement celloLcdTV;

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement celloLcdTVAddToCartBtn;

/*
    public void verifyCurrency(String Euro, String Pounds, String Dolar){
        if(currencyValue.contains("€")){
            currencyValue=Euro;
        }
        else if(currencyValue.contains("£")){
            currencyValue=Pounds;
        }else if(currencyValue.contains("$")){
            currencyValue=Dolar;
        }
    }

 */

    public void setverifySubTotalAmount(){
        if(currencyValue.getText().contains("€")){
            Assert.assertTrue(verifySubTotalAmount.getText().contains("€"));
        } else if (currencyValue.getText().contains("£")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("£"));
        } else if (currencyValue.getText().contains("$")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("$"));
        }
    }



}
