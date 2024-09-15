package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath = "//*[text()='Edit Account']")
    public WebElement editAccount;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement messageForEdit;

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement addressBook;

    @FindBy(xpath = "//a[@class='list-group-item'][3]")
    public WebElement passwordBtnMyAccount;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='input-confirm']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(css= "div.alert.alert-success.alert-dismissible")//div[@class='alert alert-success alert-dismissible']   //i[@class='fa fa-check-circle']
    public WebElement successMessagePaswordChange;

    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement warningMessagePaswordNotChange;



}
