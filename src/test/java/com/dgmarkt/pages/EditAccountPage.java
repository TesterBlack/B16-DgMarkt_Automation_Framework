package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='E-Mail']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Telephone']")
    public WebElement telephoneInput;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    public WebElement messageForFirstName;

    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    public WebElement messageForLastName;

    @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
    public WebElement messageForTelephone;

    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    public WebElement messageForEmptyEmail;

    @FindBy(xpath = "//*[text()= ' Warning: E-Mail address is already registered!']")
    public WebElement messageForRegisteredEmail;

    @FindBy(xpath= "//div[@class='alert alert-danger']")
    public WebElement warningMessage;










}
