package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LoginWithDataStepDef {
	
	WebDriver driver;
	@Given("Goto Loginpage")
	public void goto_Loginpage() {
		ChromeDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("Enter valid Email {string} and {string}")
	public void enter_valid_Email_and(String feaUser, String feaPwd) {
	    WebElement webUserName=driver.findElement(By.id("email"));
	    webUserName.sendKeys(feaUser);
	    driver.findElement(By.id("pass")).sendKeys(feaPwd);
	}

	@When("press login button")
	public void press_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("sucessfully logged into facebook")
	public void sucessfully_logged_into_facebook() {
	   
	}

}
