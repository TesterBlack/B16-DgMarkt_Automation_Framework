package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;

    public WebElement getHeader (String headerName){
        return Driver.getDriver().findElement(By.xpath("//a[@class='a-top-link']//span[contains(text(),'"+headerName+"')]"));
    }
    public WebElement getPage (){
        return Driver.getDriver().findElement(By.xpath(("//div[@class='breadcrumbs']//li[2]")));
    }
}
