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






}
