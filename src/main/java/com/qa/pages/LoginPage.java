package com.qa.pages;

import com.qa.base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends baseClass {
    //private WebDriver driver;
    //PageFactory - OR
     public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    WebElement Usrname;

    @FindBy(xpath = "//input[@id='email']/following::input")
    WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement login_Btn;

    @FindBy(xpath = "//a[@class='header-link p-r-0']")
    WebElement logout;

    //Actions :
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    private void setUsername(String un) {
        Usrname.isDisplayed();
        Usrname.isEnabled();
        Usrname.sendKeys(un);
    }

    private void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    private void click_Login() {
        login_Btn.click();
    }

    public void doLogin(String un, String pwd){
        setUsername(un);
        setPassword(pwd);
        click_Login();
        //return new HomePage();
    }

}
