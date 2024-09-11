package com.dgmarkt.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "(//strong)[4]")
    public WebElement checkOutBtn;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement verifySubTotalAmount;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement currencyValue;



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
