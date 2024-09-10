package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
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

    @FindBy(xpath = "//input[@value='Confirm Order']")
    public WebElement confirmOrderBtn;

    @FindBy(xpath = "//div[@class='container-inner']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement lastContinue;

    @FindBy(xpath = "(//h4[@class='panel-title'])[1]")
    public WebElement checkoutOptionsArea;

    @FindBy(xpath = "(//td[@class='text-right'])[17]")
    public WebElement verifyTotalAmount;




}
