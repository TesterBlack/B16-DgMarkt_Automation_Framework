package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {
    String currency;
    MainPage mainPage=new MainPage();
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@name='address_1']")
    public WebElement adress1;

    @FindBy(xpath = "//input[@name='address_2']")
    public WebElement adress2;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postCode;

    @FindBy(xpath = "//select[@name='country_id']")
    public WebElement country;

    @FindBy(xpath = "//select[@name='zone_id']")
    public WebElement region;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement termsConditionsAgreeBtn;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmOrderBtn;

    @FindBy(xpath = "//div[@class='container-inner']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement lastContinue;

    @FindBy(xpath = "(//h4[@class='panel-title'])[1]")
    public WebElement checkoutOptionsArea;

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

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement newAdress;

    @FindBy(css = "#button-payment-address")
    public WebElement continueBtnAddress;

    @FindBy(css = "#button-shipping-address")
    public WebElement continueBtnDeliveryDetails;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement continueBtnDeliveryMethod;

    @FindBy(css = "#button-confirm")
    public WebElement confirmOrder;

    @FindBy(id = "button-payment-method")
    public WebElement paymentMethod;

    @FindBy(xpath = "//tfoot[1]//td[2]")
    public WebElement subTotal;

    public void productAddToCart(){
        HealthAndBeautyPage healthAndBeautyPage=new HealthAndBeautyPage();
        Driver.getDriver().navigate().refresh();
        BrowserUtils.scrollToElement(healthAndBeautyPage.product_FitBit);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(healthAndBeautyPage.product_FitBit);
        BrowserUtils.clickWithJS(healthAndBeautyPage.product_AddToCart);
    }

    public void verifyAmount(String currency) {
        if(currency.equals("€")){
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

    public void verifySelectedCurrency(String selectedCurrency){
            if(selectedCurrency.equals("Euro")){
            BrowserUtils.clickWithJS(mainPage.currencyEuroButton);
            currency="€";
        } else if (selectedCurrency.equals("Pounds")) {
            BrowserUtils.clickWithJS(mainPage.currencyPoundsButton);
            currency="£";
        } else if (selectedCurrency.equals("Dollar")) {
            BrowserUtils.clickWithJS(mainPage.currencyDolarButton);
            currency="$";
        }
    }

}