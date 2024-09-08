package com.dgmarkt.pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount2Button;












}
