package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//h2[text()='Address Book Entries']")
    public WebElement addressBookEnties;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement newAddressButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Company']")
    public WebElement companyInput;

    @FindBy(xpath = "//input[@placeholder='Address 1']")
    public WebElement address1Input;

    @FindBy(xpath = "//input[@placeholder='Address 2']")
    public WebElement address2Input;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    public WebElement postCodeInput;

    @FindBy(xpath = "//select[@id='input-country']")
    public WebElement countryInput;

    @FindBy(xpath = "//select[@id='input-zone']")
    public WebElement regionStateInput;

    @FindBy(xpath = "(//label[@class='radio-inline'])[1]")
    public WebElement defaultAddressYes;

    @FindBy(xpath = "(//label[@class='radio-inline'])[2]")
    public WebElement defaultAddressNo;

    @FindBy(xpath = "//div[@class='pull-right']/input")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement actualMessageForNewAddress;

    public void fillnewAdress(){
        firstNameInput.sendKeys("Dominik");
        lastNameInput.sendKeys("Smith");
        companyInput.sendKeys("Amazon");
        address1Input.sendKeys("Frankfurt");
        address2Input.sendKeys("Klinikum str.");
        cityInput.sendKeys("Kronberg");
        postCodeInput.sendKeys("67424");
        WebElement country = Driver.getDriver().findElement(By.xpath("//select[@id='input-country']"));
        Select select = new Select(country);
        select.selectByVisibleText("Venezuela");
        WebElement regionState = Driver.getDriver().findElement(By.xpath("//select[@id='input-zone']"));
        Select select2 = new Select(regionState);
        select2.selectByVisibleText("Bolivar");
        continueButton.click();
    }

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement editButton;


    public void fillnewAdresswithoutrequiredAddress1(){
        firstNameInput.sendKeys("Stefan");
        lastNameInput.sendKeys("Smith");
        companyInput.sendKeys("Deutsche Bank");
        address1Input.clear();
        address1Input.sendKeys("");
        address2Input.sendKeys("Klinikum str. No:2");
        cityInput.sendKeys("Eschborn");
        postCodeInput.sendKeys("67414");
        WebElement country = Driver.getDriver().findElement(By.xpath("//select[@id='input-country']"));
        Select select = new Select(country);
        select.selectByVisibleText("Venezuela");
        WebElement regionState = Driver.getDriver().findElement(By.xpath("//select[@id='input-zone']"));
        Select select2 = new Select(regionState);
        select2.selectByVisibleText("Bolivar");
        continueButton.click();
    }

    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement errorMessageForwithoutAddress1;

    public void filleditAdresswithoutrequiredAddress1(){
        firstNameInput.clear();
        firstNameInput.sendKeys("Stefan");
        lastNameInput.clear();
        lastNameInput.sendKeys("Smith");
        companyInput.clear();
        companyInput.sendKeys("Deutsche Bank");
        address1Input.clear();
        address1Input.sendKeys("");
        address2Input.clear();
        address2Input.sendKeys("Klinikum str. No:2");
        cityInput.clear();
        cityInput.sendKeys("Eschborn");
        postCodeInput.clear();
        postCodeInput.sendKeys("67414");
        WebElement country = Driver.getDriver().findElement(By.xpath("//select[@id='input-country']"));
        Select select = new Select(country);
        select.selectByVisibleText("Venezuela");
        WebElement regionState = Driver.getDriver().findElement(By.xpath("//select[@id='input-zone']"));
        Select select2 = new Select(regionState);
        select2.selectByVisibleText("Bolivar");
        continueButton.click();
    }

    public void fillnewAdresswithdefaultAddressYes(){
        firstNameInput.sendKeys("Mauro");
        lastNameInput.sendKeys("Icardi");
        companyInput.sendKeys("Gs");
        address1Input.sendKeys("Florya");
        address2Input.sendKeys("Florya");
        cityInput.sendKeys("istanbul");
        postCodeInput.sendKeys("34");
        WebElement country = Driver.getDriver().findElement(By.xpath("//select[@id='input-country']"));
        Select select = new Select(country);
        select.selectByVisibleText("Turkey");
        WebElement regionState = Driver.getDriver().findElement(By.xpath("//select[@id='input-zone']"));
        Select select2 = new Select(regionState);
        select2.selectByVisibleText("İstanbul");
        defaultAddressYes.click();

    }















}
