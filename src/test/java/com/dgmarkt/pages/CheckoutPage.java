package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    String currency;
    MainPage mainPage = new MainPage();
    @FindBy(xpath = "(//input[@name='firstname'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@name='lastname'])[2]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;

    @FindBy(xpath = "(//input[@name='address_1'])[2]")
    public WebElement adress1;

    @FindBy(xpath = "(//input[@name='city'])[2]")
    public WebElement city;

    @FindBy(xpath = "(//input[@name='postcode'])[2]")
    public WebElement postCode;

    @FindBy(xpath = "//select[@id='input-shipping-country']")
    public WebElement country;

    @FindBy(xpath = "(//select[@name='zone_id'])[2]")
    public WebElement region;

    @FindBy(xpath = "//*[@id='button-payment-address']")
    public WebElement continueBtnBilling;
    @FindBy(xpath = "//*[@id='button-shipping-address']")
    public WebElement continueBtnDeliveryDetails;
    @FindBy(xpath = "//*[@id='button-shipping-method']")
    public WebElement continueBtnDeliveryMethod;
    @FindBy(xpath = "//*[@id='button-payment-method']")
    public WebElement continueBtnPaymentMethod;
    @FindBy(xpath = "//input[@name='agree']")
    public WebElement termsConditionsAgreeBtn;
    @FindBy(xpath = "//h1")
    public WebElement successMessage;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement lastContinue;
    @FindBy(xpath = "(//td[@class='text-right'])[8]")
    public WebElement verifyAmount;

    public void productCategory(String categoryName) {
        String productCategory = "//img[@alt='" + categoryName + "']";
        Driver.getDriver().findElement(By.xpath(productCategory)).click();
    }

    public void productToAdd(String productNamen) {
        String productWahlen = "//img[@alt='" + productNamen + "']";
        Driver.getDriver().findElement(By.xpath(productWahlen)).click();
    }

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement existingAdress;

    @FindBy(css = "#button-payment-address")
    public WebElement continueBtnAddress;

    @FindBy(css = "#button-confirm")
    public WebElement confirmOrder;

    @FindBy(id = "button-payment-method")
    public WebElement paymentMethod;


    public void productAddToCart() {
        HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();
        Driver.getDriver().navigate().refresh();
        BrowserUtils.scrollToElement(healthAndBeautyPage.product_FitBit);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(healthAndBeautyPage.product_FitBit);
        BrowserUtils.clickWithJS(healthAndBeautyPage.product_AddToCart);
    }

    public void verifyAmount(String currency) {
        if (currency.equals("€")) {
            Assert.assertTrue(verifyAmount.getAttribute("innerText").trim().contains("€"));
        } else if (currency.equals("£")) {
            Assert.assertTrue(verifyAmount.getAttribute("innerText").trim().contains("£"));
        } else if (currency.equals("$")) {
            Assert.assertTrue(verifyAmount.getAttribute("innerText").trim().contains("$"));
        }
    }

    public void existingAdressBillingDetails(String currency) {
        BrowserUtils.waitFor(4);
        BrowserUtils.clickWithJS(continueBtnAddress);
        BrowserUtils.clickWithJS(continueBtnDeliveryDetails);
        BrowserUtils.clickWithJS(continueBtnDeliveryMethod);
        BrowserUtils.clickWithJS(termsConditionsAgreeBtn);
        BrowserUtils.clickWithJS(paymentMethod);
        verifyAmount(currency);
        BrowserUtils.clickWithJS(confirmOrder);
    }

    public String verifySelectedCurrency(String selectedCurrency) {
        String currency="";
        if (selectedCurrency.equals("Euro")) {
            BrowserUtils.clickWithJS(mainPage.currencyEuroButton);
            currency = "€";
        } else if (selectedCurrency.equals("Pounds")) {
            BrowserUtils.clickWithJS(mainPage.currencyPoundsButton);
            currency = "£";
        } else if (selectedCurrency.equals("Dollar")) {
            BrowserUtils.clickWithJS(mainPage.currencyDolarButton);
            currency = "$";
        }
        return currency;
    }
    @FindBy(xpath = "//a[text()='Checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[@id='collapse-shipping-address']/div/form/div[3]/label/input")
    public WebElement newDeliveryAddressButton;

    @FindBy (xpath = "//*[@id='checkout-cart']/div[1]")
    public WebElement alertNotInStock;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueBtnEmptyCart;

}