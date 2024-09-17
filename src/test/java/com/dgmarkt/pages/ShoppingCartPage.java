package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.DriverManager;
import java.util.List;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "//a[text()=\"Checkout\"]")
    public WebElement checkOutBtnStock;

    @FindBy(xpath = "//strong[text()=\" Checkout\"]")
    public WebElement checkOutBtn;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement verifySubTotalAmount;

    @FindBy(xpath = "(//td[@class='text-right'])[2]")
    public WebElement currencyValue;

    @FindBy(xpath = "//img[@class='img-responsive img-mod-471-7403979 ls-is-cached lazyloaded']")
    public WebElement celloLcdTV;

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement celloLcdTVAddToCartBtn;

    public void setverifySubTotalAmount(){
        if(currencyValue.getText().contains("€")){
            Assert.assertTrue(verifySubTotalAmount.getText().contains("€"));
        } else if (currencyValue.getText().contains("£")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("£"));
        } else if (currencyValue.getText().contains("$")) {
            Assert.assertTrue(verifySubTotalAmount.getText().contains("$"));
        }
    }

    @FindBy (xpath = "//*[contains(text(), 'not in stock')]")
    public WebElement notInStockMessage;

    @FindBy (xpath = "//*[contains(@class, 'layout')]")
    public List<WebElement> productSelect;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//select[@id='input-limit']")
    public WebElement inputLimitFilter;

    @FindBy (xpath = "  //*[text()='100']")
    public WebElement inputLimitSize;

    @FindBy (xpath = "(//a[contains(@href, 'product_id')])[3]")
    public WebElement productNameInProductPage;

    @FindBy (xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[2]/a")
    public WebElement productNameInCart;

    @FindBy (xpath = "  (//*[@class='icon-rt-close-circle-outline'])[2]")
    public WebElement removeProduct;



    public void productSelection() {
        ProductComparePage productComparePage = new ProductComparePage();

        BrowserUtils.waitFor(1);
        for (int i = 0; i < productSelect.size() && i < 1; i++) {
            List<WebElement> products = productSelect;
            WebElement product = products.get(i);
            product.click();
            addToCartButton.click();
            productComparePage.alertCloseButton.click();
            productComparePage.basketButton.click();
            BrowserUtils.waitFor(2);
            String expectedProduct = productNameInProductPage.getText().toLowerCase();
            String actualProduct = productNameInCart.getText().toLowerCase();
            Assert.assertEquals(expectedProduct, actualProduct);
            removeProduct.click();
            Driver.getDriver().navigate().back();
            //Driver.getDriver().navigate().refresh();
            //inputLimitFilter.click();
            //inputLimitSize.click();
            BrowserUtils.waitFor(1);


        }

    }








}
