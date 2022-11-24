package org.stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeStepDef extends BaseClass1{
	WebDriver driver;
	PojoOrange p;
	@Given("Goto login webpage")
	public void goto_login_webpage() throws InterruptedException {
		
		browserLaunch("chrome");
		Thread.sleep(2000);
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() throws InterruptedException {
		p=new PojoOrange();
		Thread.sleep(2000);
		sendkeys(p.getLoginName(),"Admin");
		Thread.sleep(2000);
		sendkeys(p.getPasswordTxt(),"admin123");
		Thread.sleep(2000);
	}

	@When("click login button")
	public void click_login_button() throws InterruptedException {
		p=new PojoOrange();
		Thread.sleep(2000);
		clickButton(p.getLoginBtn());
		Thread.sleep(2000);
	}

	@Then("user should be navigated to homepage of Orange HRM")
	public void user_should_be_navigated_to_homepage_of_Orange_HRM() {
	boolean status=	p.getDashBoardPage().isDisplayed();
	System.out.println("user is in dashboard page: "+ status);
	}
}
