package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;


    @FindBy(xpath = "//a[@id='pt-register-link']")
    private WebElement accountRegisterButton;



}
