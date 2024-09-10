package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{

    @FindBy(id = "wishlist-total")
    public WebElement wishListIcon;

    @FindBy(xpath = "//a[.='BaByliss 3663U - Hair rollers']")
    public WebElement firstProduct;

    @FindBy(xpath = "//a[.='Capsule Plate 6pcs']")
    public WebElement secondProduct;
}
