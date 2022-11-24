package org.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTask extends BaseClass1 {

	WebDriver driver;
	PojoExample p;
	
	@Given("User has to launch the chrome browser and max the window")
	public void user_has_to_launch_the_chrome_browser_and_max_the_window() {
		
		browserLaunch("chrome");
	    /*WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();*/
	}



	@When("User has to launch the fb application in browser")
	public void user_has_to_launch_the_fb_application_in_browser() {
		launchUrl("https://www.facebook.com/");
	}
	
	/*@When("User has to pass invalid username in email field {string}")
	public void user_has_to_pass_invalid_username_in_email_field(String emailTxt) {
		driver.findElement(By.id("email")).sendKeys(emailTxt);
	    	}

	@When("User has to pass invalid password in password field {string}")
	public void user_has_to_pass_invalid_password_in_password_field(String passTxt) {
		driver.findElement(By.id("pass")).sendKeys(passTxt);
	}*/


	@When("User has to pass invalid username in email field")
	public void user_has_to_pass_invalid_username_in_email_field() {
		p=new PojoExample();
		sendkeys(p.getEmailTxt(),"mohana@gmail.com");
	}

	@When("User has to pass invalid password in password field")
	public void user_has_to_pass_invalid_password_in_password_field() {
		p=new PojoExample();
	   sendkeys(p.getPasswordTxt(), "234242");
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		p=new PojoExample();
		clickButton(p.getLoginBtn());
		
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		 //driver.close();
	}
}
