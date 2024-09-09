package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//h2[text()='Address Book Entries']")
    public WebElement addressBookEnties;

    @FindBy(xpath = "//h2[text()='Address Book Entries']")
    public WebElement newAddressButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;






}
