package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement editAccount;
}
