package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "(//div[@class='btn-group open']")
    public WebElement currencyButton;
    @FindBy(xpath = "(//div[@class='btn-group'])[1]")
    public WebElement currenyEuroButton;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;



}
