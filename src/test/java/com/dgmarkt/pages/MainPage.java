package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement accountRegisterButton;   

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount2Button;
  
    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle'])[1]")
    public WebElement currencies;

    @FindBy(xpath = "//button[@name='EUR']")
    public WebElement currencyEuroButton;

    @FindBy(xpath = "//button[@name='GBP']")
    public WebElement currencyPoundsButton;

    @FindBy(xpath = "//button[@name='USD']")
    public WebElement currencyDolarButton;

    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle']/span)[1]")
    public WebElement verifyEuro ;

    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle']/span)[1]")
    public WebElement verifyPounds ;
  
    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle']/span)[1]")
    public WebElement verifyDolar ;

    @FindBy(xpath = "//a[contains(text(), 'Health & Beauty')]")
    public WebElement healthAndBeauty;

    @FindBy(xpath = "(//div[@data-toggle='dropdown'])[1]")
    public WebElement searchIcon;

    @FindBy(id = "text-search")
    public WebElement searchField;

    @FindBy(id = "btn-search-category")
    public WebElement searchButtonClick;

    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryButtonOnMainPage;

    public WebElement getHeader (String headerName){
       BrowserUtils.waitFor(2);
        return Driver.getDriver().findElement(By.xpath("//a[@class='a-top-link']//span[contains(text(),'"+headerName+"')]"));
    }
    public WebElement getPage (){
        return Driver.getDriver().findElement(By.xpath(("//div[@class='breadcrumbs']//li[2]")));
    }

    public void getSubCategoryMenu(String subCategoryMenu) {
        Driver.getDriver().findElement(By.xpath("//h4//a[text()='"+subCategoryMenu+"']")).click();
    }

}
