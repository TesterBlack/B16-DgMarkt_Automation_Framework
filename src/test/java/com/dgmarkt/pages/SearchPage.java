package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(xpath = "//*[text()[contains(., ' Hair ' )]]")
    public WebElement searchHair;

    //@FindBy(xpath = "//*[text()[contains(., 'There' )]]")
    //public WebElement noProductMessage;

    @FindBy(xpath = "//p[contains(text(),'There is no product that matches the search criter')]")
    public WebElement noProductMessage;



}
