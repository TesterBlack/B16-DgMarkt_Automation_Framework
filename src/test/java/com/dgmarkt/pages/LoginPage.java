package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy (css = "[name='email']")
    private WebElement emailBox;

    @FindBy (css = "[name='password']")
    private WebElement passwordBox;

    @FindBy (css = "[name='login']")
    private WebElement loginButton;

    public void login(){

        emailBox.sendKeys(ConfigReader.get("username"));
        passwordBox.sendKeys(ConfigReader.get("password"));
        loginButton.click();

    }



}
