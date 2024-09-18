package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HealthAndBeautyPage extends BasePage {


    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement alertMessage;

    @FindBy(xpath = "//a[@id='wishlist-total']")
    public WebElement wishListButton;


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

    @FindBy(xpath = "//div[@class='slider-values']//span[1]")
    public WebElement minPriceOfSlider;

    @FindBy(xpath = "//div[@class='slider-values']//span[2]")
    public WebElement maxPriceOfSlider;

    @FindBy(css = "div p.price")
    public List<WebElement> pricesOfProducts;

    @FindBy(xpath = "//div[@class='slider-values']//input[@id='price-to']/@value")
    public WebElement minPrice;

    @FindBy(xpath = "//div[@class='slider-values']//input[@id='price-to']/@value")
    public WebElement maxPrice;

    @FindBy(xpath = "//div[@class='custom-category']//p")
    public WebElement noProductsMessage;

    public void resetSliders() {
        minSliderHandle.sendKeys("200");
        maxSliderHandle.sendKeys("300");
    }

    public void getAllProductPrices(int minPrice, int maxPrice) {
        for (WebElement productPriceElement : pricesOfProducts) {
            String priceText = productPriceElement.getText().replaceAll("[^0-9]", "");

            /*if (priceText.isEmpty()) {
                System.err.println("Price information is blank or invalid: " + productPriceElement.getText());
                continue;
            }*/

            try {
                int price = Integer.parseInt(priceText);
                Assert.assertTrue("Product price below the minimum price!", price >= minPrice);
                BrowserUtils.waitFor(3);
                Assert.assertTrue("Product price above the minimum price!", price <= maxPrice);

            } catch (NumberFormatException e) {
                System.err.println("Price data is not in number format: " + priceText);
            }
        }
    }

    @FindBy(id = "price-from")
    public WebElement priceFrom;

    @FindBy(id = "price-to")
    public WebElement priceTo;
    public void adjustPriceSlider(int minPrice, int maxPrice) {
       /* int sliderMinValue = 81;
        int sliderMaxValue = 381;
        int sliderWidth = priceSliderHandleHealthAndBeauty.getSize().getWidth();
        int minXOffset = getXOffsetForPrice(minPrice, sliderMinValue, sliderMaxValue, sliderWidth);
        int maxXOffset = getXOffsetForPrice(maxPrice, sliderMinValue, sliderMaxValue, sliderWidth);

        Actions move = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(5);*/
        BrowserUtils.scrollToElement(priceTo);
        BrowserUtils.executeJScommand(priceFrom,"arguments[0].setAttribute('value', '"+minPrice+"');");
        BrowserUtils.executeJScommand(priceTo,"arguments[0].setAttribute('value', '"+maxPrice+"');");
        BrowserUtils.waitFor(3);
        /*JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", priceSliderHandleHealthAndBeauty);*/

    }

    private int getXOffsetForPrice(int price, int sliderMinValue, int sliderMaxValue, int sliderWidth) {
        int sliderRange = sliderMaxValue - sliderMinValue;
        return (int) (((price - sliderMinValue) * 1.0 / sliderRange) * sliderWidth);
    }

    public void resetPriceSliderToDefault(int defaultMinPrice, int defaultMaxPrice) {
        int PriceSliderMinValue = 81;
        int PriceSliderMaxValue = 381;
        int sliderWidth2 = priceSliderHandleHealthAndBeauty.getSize().getWidth();
        int minXOffset = getXOffsetForPrice(defaultMinPrice, defaultMinPrice, defaultMaxPrice, sliderWidth2);
        int maxXOffset = getXOffsetForPrice(defaultMaxPrice, defaultMinPrice, defaultMaxPrice, sliderWidth2);
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDropBy(minSliderHandle, -minXOffset, 0).perform();
        BrowserUtils.waitFor(3);
        action.dragAndDropBy(maxSliderHandle, maxXOffset, 0).perform();
    }
     private int getXOffsetForPrice(int price, int sliderMinValue, int sliderMaxValue, int sliderWidth) {
        int sliderRange = sliderMaxValue - sliderMinValue;
        return (int) (((price - sliderMinValue) * 1.0 / sliderRange) * sliderWidth);
    }

