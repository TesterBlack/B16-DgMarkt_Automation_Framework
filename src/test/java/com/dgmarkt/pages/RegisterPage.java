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

    @FindBy (xpath = "//h2[.='Your Account Has Been Created!']")
    public WebElement actualMessage;

    @FindBy (xpath = "//div[@class='for-error error-email text-danger']")
    public WebElement actualErrorMessageForEmail;

    @FindBy (xpath = "//div[@class='for-error error-firstname text-danger']")
    public WebElement actualErrorMessageForFirstname;

    @FindBy (xpath = "//div[@class='for-error error-lastname text-danger']")
    public WebElement actualErrorMessageForLastname;

    @FindBy (xpath = "//div[@class='for-error error-telephone text-danger']")
    public WebElement actualErrorMessageForTelephone;

    @FindBy (xpath = "//div[@class='for-error error-password text-danger']")
    public WebElement actualErrorMessageForPassword;

    @FindBy (xpath = "//span[text()=' Warning: You must agree to the Privacy Policy!']")
    public WebElement actualErrorMessageForCheckbox;

    @FindBy (xpath = "//div[text()='Password confirmation does not match password!']")
    public WebElement actualErrorMessageForBeidePassword;

    @FindBy (xpath = "//*[text()=' Warning: E-Mail Address is already registered!']")
    public WebElement actualErrorMessageForRegisterEmail;

    @FindBy (xpath = "//h2")
    public WebElement actualmessageForInvalidTelephone;















}
