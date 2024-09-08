package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;





    @FindBy(xpath = "//div[@class='btn-group open']")  //div[@class='btn-group']
    public WebElement currencyButton;

    @FindBy(xpath = "//button[@name='EUR']") //div[@class='btn-group open'])[1]
    public WebElement currencyEuroButton;



}
