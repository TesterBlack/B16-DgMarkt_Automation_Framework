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





}
