package com.qa.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static java.time.Duration.*;

public class baseClass {
    public static WebDriver driver;
    public static Properties prop;
    protected ExtentReports extent;
    protected ExtentTest test;
    public baseClass() {
        try {
            prop = new Properties();
            FileInputStream ip = null;
            ip = new FileInputStream("C:\\Users\\abhil\\IdeaProjects\\perfume\\src\\main\\java\\org\\qa\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void initialization(){

        String browserName = prop.getProperty("browser");
        // Initialize ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        if(browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(ofSeconds(TestUtil.IMPLICIT_WAIT));

        driver.get(prop.getProperty("url"));

    }
    public void eWait(WebElement el, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    public void advClk(WebElement el) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
    }

        @AfterClass
        public void tearDown(){
            if (driver!=null){
            // driver.close();
            }
            extent.flush();
        }

}
