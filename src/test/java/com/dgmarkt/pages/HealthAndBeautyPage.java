package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthAndBeautyPage extends BasePage{


    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement alertMessage;

    @FindBy(xpath = "//a[@id='wishlist-total']")
    public WebElement wishListButton;


    public void productAddToWishList(String productName) {
        String product1 = "//a[text()='"+productName+"']/../../../..//button[2]";
        Driver.getDriver().findElement(By.xpath(product1)).click();
    }

    public void verifyAlertMessage(String alertMessage) {
        this.alertMessage.getText().contains(alertMessage);
    }

    @FindBy(css = "[alt='Fitbit Aria Air Smart Bathroom Scale']")
    public WebElement product_FitBit;
    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement product_AddToCart;

    @FindBy(xpath = "//div[@class='filter-price']")
    public WebElement priceSlider;



}
