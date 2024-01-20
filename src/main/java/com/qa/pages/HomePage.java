package com.qa.pages;

import com.qa.base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends baseClass{

    @FindBy(xpath = "//a[contains(@href,'all-products')]")
    public WebElement clkProdBtn;

    @FindBy(xpath = "//span[contains(@class,'dis')]//parent::*//preceding-sibling::a")
    List<WebElement> productTab;

    @FindBy(xpath = "//span[contains(@class,'dis')]//parent::*//span[@class='discount-price font-weight-bold float-sm-right']")
    List<WebElement> productTabPrice;

    @FindBy(xpath = "//button[@name='buyNow']")
    List<WebElement> clkAddCart;

    @FindBy(xpath = "//a[@class='header-link p-r-0']")
    WebElement logout;

    //Initialize all the webElements(PageObjects) to the driver using PageFactory.InitElement
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void getProdInfo() throws InterruptedException {
        LinkedHashMap<Integer, String[]> prodmap = new LinkedHashMap();
        for (int n=0; n< productTab.size();n++) {
            prodmap.put(n, new String[]{productTab.get(n).getText(), productTabPrice.get(n).getText()});
        }
        for(int m=0;m<prodmap.size();m++){
            System.out.println("Product detail:"+ Arrays.toString(prodmap.get(m)));
        }
        TimeUnit.SECONDS.sleep(10);
    }

    public void validateProdLink() {
        advClk(clkProdBtn);
    }


    public void ValidateclickAddCart() throws InterruptedException {
        //System.out.println("Number of products in the cart are: " +clkAddCart.size());
        for (WebElement cart:clkAddCart){
            eWait(cart, 30);
            cart.click();
            TimeUnit.SECONDS.sleep(10);
            int s = clkAddCart.size();
            System.out.println("Number of products in the cart are: " +s);
        }
    }

    public boolean islogoutVisible() {
        boolean b = false;
        if(logout.isDisplayed()) {
            b = logout.isEnabled();
        }
        return b;
    }

}