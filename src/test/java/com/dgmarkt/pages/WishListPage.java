package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{

    @FindBy(id = "wishlist-total")
    public WebElement wishListIcon;
    public void checkWishList(String productName){
        String productsInWishList = "//a[.='"+productName+"']";
        //Driver.getDriver().findElement(By.xpath(productsInWishList));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(productsInWishList)).isDisplayed());
    }
}
