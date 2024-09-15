package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage{

    @FindBy(id = "wishlist-total")
    public WebElement wishListIcon;

    @FindBy(xpath = "(//a[.='BaByliss 3663U - Hair rollers'])")
    public List<WebElement> firstProduct;

    @FindBy(xpath = "(//a[.='Capsule Plate 6pcs'])")
    public List<WebElement> secondProduct;

    @FindBy(xpath = "//a[@class='btn btn-danger']")
    public WebElement deleteButton;

    @FindBy(css = "div.alert.alert-success.alert-dismissible")
    public WebElement successMessage;
    @FindBy(xpath = "//p[.='Your wish list is empty.']")
    public WebElement emptyWishListMessage;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement addToCartButton;

    @FindBy (xpath = "(//button[@class='btn btn-primary'])[2]")
    public WebElement addToCartButton2;

    @FindBy (id = "cart")
    public WebElement cartIcon;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']")
    public WebElement dropdownMenu;

    @FindBy(css = "div.list-group a.list-group-item[href*='wishlist']")
    public  WebElement  wishListBtnMyAccount;

    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement successAddedBablissToWishList;

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    public WebElement myWishListPageTitle;

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    public WebElement wishListOnTheSuccessMessage;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement cartBtnOnTheMyWishList;

    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement successMessageAddToCartOnTheMyWishList;


}
