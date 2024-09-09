package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;





    @FindBy(xpath = "//span[text()='Currency']")
    public WebElement currencyButton;

    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle'])[1]")
    public WebElement currencies;

    @FindBy(xpath = "//button[@name='EUR']")
    public WebElement currencyEuroButton;

    @FindBy(xpath = "//button[@name='GBP']")
    public WebElement currencyPoundsButton;

    @FindBy(xpath = "//button[@name='USD']")
    public WebElement currencyDolarButton;

    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle']/span)[1]")
    public WebElement verifyEuro ;


    //TC04
    @FindBy(xpath = "//button[@name='USD']")
    public WebElement checkoutButton;

}
