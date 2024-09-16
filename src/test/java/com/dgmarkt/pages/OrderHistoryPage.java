package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage{

    @FindBy(id = "content")
    public WebElement orderHistoryContainer;
    @FindBy(xpath = "//p[.='You have not made any previous orders!']")
    public WebElement orderHistoryMessage;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement viewOrderButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement alertMessage;

    @FindBy(xpath = "//input[@name='product']")
    public WebElement productName;

    @FindBy(xpath = "//input[@type='radio' and @value='3']")
    public WebElement orderErrorRadioButton;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[contains(text(), 'Thank you for submitting your return request')]")
    public WebElement productReturnMessage1;

    public void verifyAlertMessage(String alertMessage) {
        this.alertMessage.getText().contains(alertMessage);
    }

    public WebElement reOrderButton() {
       return Driver.getDriver().findElement(By.xpath("(//a[@data-original-title='Reorder'])[2]"));
    }

    public WebElement returnButton() {
        return Driver.getDriver().findElement(By.xpath("(//a[@data-original-title='Return'])[2]"));
    }

}
