package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @FindBy(css = "[name='email']")
    public WebElement emailBox;

    @FindBy(css = "[name='password']")
    public WebElement passwordBox;

    @FindBy(css = "[name='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Close']")
    public WebElement popupClose;
    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public WebElement poupClose;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-login-link']")
    public WebElement accountLoginButton;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement accountEmailBox;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement accountPasswordBox;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement accountLoginClickButton;

    @FindBy(id = "pt-logout-link")
    public WebElement logoutButton;

    @FindBy(xpath = "(//span[text()='Continue'])[2]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement successLoginMessage;

    @FindBy(xpath = "//div[text()=' Warning: No match for E-Mail Address and/or Password.']")
    public WebElement failedLoginMessage;

    @FindBy(xpath = "//div[contains(text(), ' Warning')]")
    public WebElement warningMessage;

    @FindBy(xpath = "//a[text()='Forgotten Password']")
    public WebElement forgottenPasswordButton;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton2;


    public void login() throws InterruptedException {
        emailBox.sendKeys(ConfigReader.get("username"));
        passwordBox.sendKeys(ConfigReader.get("password"));
        loginButton.click();
        BrowserUtils.waitFor(2);
        popupClose.click();

    }
    public void accountLogin() throws InterruptedException {
        myAccountButton.click();
        accountLoginButton.click();
        accountEmailBox.sendKeys(ConfigReader.get("accountUsername"));
        accountPasswordBox.sendKeys(ConfigReader.get("accountPassword"));
        accountLoginClickButton.click();


    }


    /**
     *After the user password is changed, you can log in with this login
     */
    public void afterChangePasswordLogin(String password){
        myAccountButton.click();
        accountLoginButton.click();
        accountEmailBox.sendKeys(ConfigReader.get("accountUsername"));
        accountPasswordBox.sendKeys(password);
        accountLoginClickButton.click();
    }
}