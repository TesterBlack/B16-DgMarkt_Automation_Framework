package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProductComparePage extends BasePage{

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement productComparisonText;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement alertCloseButton;

    @FindBy(xpath = "(//table//tr)[17]/td/input[@value='Add to Cart']")
    public List<WebElement> addToCartButton;

    @FindBy(xpath = "//div[@id='cart']/button")
    public WebElement basketButton;

    @FindBy(xpath = "(//tbody)[3]/tr//a/strong")
    public WebElement productOnComparePage;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement productMessage;

    @FindBy(xpath = "(//table[@class='table table-bordered']/tbody)[3]/tr/td/a")
    public List<WebElement> removeButton;


    public void getProductOnProductComparePage(String firstProductName,String secondProductName){
        if (productOnComparePage.getText().contains(firstProductName)) {
            Assert.assertTrue(productOnComparePage.getText().contains(firstProductName));
        } else if (productOnComparePage.getText().contains(secondProductName)) {
            Assert.assertTrue(productOnComparePage.getText().contains(secondProductName));
        }
    }

    public void addToCartProducts(){
        for (int i = 0; i <addToCartButton.size(); i++) {
            addToCartButton.get(i).click();
            alertCloseButton.click();
        }
    }

    public void verifyProductAddToCart(String firstProduct, String secondProduct){
        List<WebElement> productsName = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td[@class='text-left cart-info']/a"));
        for (int i = 0; i < productsName.size(); i++) {
            if (productsName.get(i).getText().contains(firstProduct)) {
                Assert.assertTrue(productsName.get(i).getText().contains(firstProduct));
            } else if (productsName.get(i).getText().contains(secondProduct)) {
               Assert.assertTrue(productsName.get(i).getText().contains(secondProduct));
            }
        }
    }

    public void removeToCartProducts(){
        for (int i = 0; i <removeButton.size(); i++) {
            removeButton.get(i).click();
            BrowserUtils.waitFor(1);
        }
    }

}
