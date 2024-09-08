package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    @FindBy (css = "[name='email']")
    private WebElement emailBox;

    @FindBy (css = "[name='password']")
    private WebElement passwordBox;

    @FindBy (css = "[name='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public WebElement poupClose;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-login-link']")
    private WebElement accountLoginButton;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement accountEmailBox;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement accountPasswordBox;

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement accountLoginClickButton;

    @FindBy (id = "pt-logout-link")
    public WebElement logoutButton;

    @FindBy (xpath = "(//span[text()='Continue'])[2]")
    public WebElement continueButton;





    public void login() throws InterruptedException {
        emailBox.sendKeys(ConfigReader.get("username"));
        passwordBox.sendKeys(ConfigReader.get("password"));
        loginButton.click();
        poupClose.click();
    }


    public void accountLogin() throws InterruptedException {
        myAccountButton.click();
        accountLoginButton.click();
        accountEmailBox.sendKeys(ConfigReader.get("accountUsername"));
        accountPasswordBox.sendKeys(ConfigReader.get("accountPassword"));
        accountLoginClickButton.click();
        Thread.sleep(2000);
    }



}
