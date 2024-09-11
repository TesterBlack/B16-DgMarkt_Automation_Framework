package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends BasePage{

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement productComparisonText;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement alertCloseButton;

    public void getProductOnProductComparePage(String firstProductName,String secondProductName){
        WebElement products = Driver.getDriver().findElement(By.xpath("(//tbody)[3]/tr//a/strong"));
        if (products.getText().contains(firstProductName)) {
            Assert.assertTrue(products.getText().contains(firstProductName));
        } else if (products.getText().contains(secondProductName)) {
            Assert.assertTrue(products.getText().contains(secondProductName));
        }
    }



}
