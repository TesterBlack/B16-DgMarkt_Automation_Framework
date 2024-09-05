package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{


    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstnameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastnameInput;

    @FindBy(xpath = "//input[@placeholder='E-Mail']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Telephone']")
    public WebElement telephoneInput;

    @FindBy(xpath = "(//input[@placeholder='Password'])[2]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@placeholder='Password Confirm']")
    public WebElement passwordConfirmInput;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement yesSubscribe;

    @FindBy(xpath = "//input[@name='agree']")  // for Yes
    public WebElement checkBoxFürAgree;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;


}
