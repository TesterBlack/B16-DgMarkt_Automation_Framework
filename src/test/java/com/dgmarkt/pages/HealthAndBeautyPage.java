package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HealthAndBeautyPage extends BasePage {
    
    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement alertMessage;

    public void productAddToWishList(String productName) {
        String product1 = "//a[text()='" + productName + "']/../../../..//button[2]";
        Driver.getDriver().findElement(By.xpath(product1)).click();
    }

    public void verifyAlertMessage(String alertMessage) {
        this.alertMessage.getText().contains(alertMessage);
    }

    @FindBy(css = "[alt='Fitbit Aria Air Smart Bathroom Scale']")
    public WebElement product_FitBit;

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement product_AddToCart;

    @FindBy(xpath = "//div[@class='ui-slider-range ui-widget-header ui-corner-all']")
    public WebElement priceSliderHandleHealthAndBeauty;

    @FindBy(xpath = "(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]")
    public WebElement minSliderHandle;

    @FindBy(xpath = "(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]")
    public WebElement maxSliderHandle;

    @FindBy(css = "div p.price")
    public List<WebElement> pricesOfProducts;

    @FindBy(xpath = "//div[@class='slider-values']//input[@id='price-from']")
    public WebElement l_minPrice;

    @FindBy(xpath = "//div[@class='slider-values']//input[@id='price-to']")
    public WebElement l_maxPrice;

    @FindBy(xpath = "//div[@class='custom-category']//p")
    public WebElement noProductsMessage;

    public void resetSliders() {
        minSliderHandle.sendKeys("200");
        maxSliderHandle.sendKeys("300");
    }

    public void adjustPriceSlider2(int minPrice, int maxPrice) {
        Actions moveSlider=new Actions(Driver.getDriver());
        int width = priceSliderHandleHealthAndBeauty.getSize().getWidth();
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDropBy(minSliderHandle, minPrice, 0).perform();
        BrowserUtils.waitFor(3);
        action.dragAndDropBy(maxSliderHandle, -maxPrice, 0).perform();
    }

}


