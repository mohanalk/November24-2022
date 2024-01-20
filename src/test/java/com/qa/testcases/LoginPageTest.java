package com.qa.testcases;
import com.qa.base.baseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends baseClass {

    LoginPage loginpage;
    HomePage homePage;
    public LoginPageTest() {

        super();
    }

    @BeforeMethod
    public void setUp(){


        //We need to create an object of LoginPage.class (constructor)
        loginpage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(priority=1)
    public void loginPageTitleTest()
    {
        test = extent.createTest("Validate Title","Validating title is Perfume");
        String title = loginpage.validateLoginPageTitle();
        if(title.toLowerCase().equals("perfum"))
            test.pass("Login Page Title TestCase - Passed");
        else
            test.fail("Test validation failed");

    }

    @Test(dependsOnMethods = "loginPageTitleTest")
    public void loginValidationTest() {
        test = extent.createTest("Validate Login","Validating LoginPage");
        loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
        boolean isLoggedIn = homePage.islogoutVisible();
        if(isLoggedIn)
            test.pass("Login successful TestCase - Passed");
        else
            test.fail("Login unsuccessful TestCase - Failed");
        //Assert.assertTrue();

    }
    @Test(dependsOnMethods = "loginValidationTest")
    public void ValidateProdLinkTest() throws InterruptedException {

        test.info("Clicking all product links from the submenu");
        homePage.validateProdLink();
        String currentUrl = driver.getCurrentUrl();
        test.info("currentUrl is "+ currentUrl);
        if(currentUrl.contains("all-products")) {
            homePage.getProdInfo();
        }
        //homePage.ValidateclickAddCart();
    }

   @Test(dependsOnMethods = "ValidateProdLinkTest")
    public void clkAddCartTest() throws InterruptedException {
         homePage.ValidateclickAddCart();
    }


}
