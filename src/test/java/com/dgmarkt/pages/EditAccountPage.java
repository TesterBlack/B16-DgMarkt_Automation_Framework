package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='E-Mail']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Telephone']")
    private WebElement telephoneInput;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;





}
