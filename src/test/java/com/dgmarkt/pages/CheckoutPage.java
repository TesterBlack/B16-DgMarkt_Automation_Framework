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

    public void verifyAmount() {
        if (verifyAmount.getText().contains("€")) {
            Assert.assertTrue(verifyAmount.getText().contains("€"));
        } else if (verifyAmount.getText().contains("£")) {
            Assert.assertTrue(verifyAmount.getText().contains("£"));
        } else if (verifyAmount.getText().contains("$")) {
            Assert.assertTrue(verifyAmount.getText().contains("$"));
        }
    }

    public void existingAdressBillingDetails() {
         continueButton(1).click();
         continueButton(2).click();
         continueButton(3).click();
         BrowserUtils.clickWithJS(termsConditionsAgreeBtn);
         BrowserUtils.clickWithJS( continueButton(4));
         verifyAmount();
         BrowserUtils.clickWithJS(confirmOrderBtn);
         lastContinue.click();
    }

    public void newAdressBillingDetails() {
        newAdress.click();
        firstName.sendKeys("firstname");
        lastName.sendKeys("lastname");
        company.sendKeys("company");
        adress1.sendKeys("adress1");
        adress2.sendKeys("adress2");
        city.sendKeys("city");
        postCode.sendKeys("postcode");
        WebElement country = Driver.getDriver().findElement(By.xpath("//select[@id='input-country']"));
        Select select = new Select(country);
        select.selectByVisibleText("Venezuela");
        WebElement regionState = Driver.getDriver().findElement(By.xpath("//select[@id='input-zone']"));
        Select select2 = new Select(regionState);
        select2.selectByVisibleText("Bolivar");
        continueButton(1).click();
        continueButton(2).click();
        continueButton(3).click();
        termsConditionsAgreeBtn.click();
        continueButton(4).click();
        verifyAmount();
        confirmOrderBtn.click();
        lastContinue.click();

    }
    public  WebElement continueButton(int index){
        return Driver.getDriver().findElement(By.xpath("(//input[@value='Continue'])["+index+"]"));
    }
}