package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoOrange extends BaseClass1 {
	 		
		//1. Non Parametrized Constructor
		
		  public PojoOrange() {
		
			 PageFactory.initElements(driver, this);
			  
		  	}
		  
	//2. private WebElements
		  @CacheLookup
		  @ FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
		  private WebElement loginName;
		  
		  @CacheLookup
		  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
		  private WebElement passwordTxt;
		  
		  @CacheLookup
		  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
		  private WebElement loginBtn;
		  
		  @CacheLookup
		  @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
		  private WebElement dashBoardPage;	  
		
		  
		//3 getters to access
			
		  public WebElement getLoginName() {
				return loginName;
			}
		  
			public WebElement getDashBoardPage() {
			return dashBoardPage;
		}

			public WebElement getPasswordTxt() {
				return passwordTxt;
			}

			public WebElement getLoginBtn() {
				return loginBtn;
			}
					    
}