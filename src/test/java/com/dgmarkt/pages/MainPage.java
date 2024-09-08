package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;





    @FindBy(xpath = "//span[text()='Currency']")  //div[@class='btn-group']
    public WebElement currencyButton;

    @FindBy(xpath = "//button[@name='EUR']") //div[@class='btn-group open'])[1]
    public WebElement currencyEuroButton;

    @FindBy(xpath = "//button[@name='GBP']")
    public WebElement currencyPoundsButton;

    @FindBy(xpath = "//button[@name='USD']")
    public WebElement currencyDolarButton;

    //TC04
    @FindBy(xpath = "//button[@name='USD']")
    public WebElement checkoutButton;

}
