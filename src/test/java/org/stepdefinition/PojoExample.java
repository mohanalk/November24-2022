package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoExample extends BaseClass1 {
	
	//1. Non Parametrized Constructor
	
	  public PojoExample() {
		  //pagefactory
		 PageFactory.initElements(driver, this);
		  
	  }
	  
//2. private WebElements
	  //@CacheLookup
	  @ FindBy(id="email")
	  private WebElement emailTxt;
	  
	 // @CacheLookup
	  @FindBy(name="pass")
	  private WebElement passwordTxt;
	  
	  //@CacheLookup
	  @FindBy(name="login")
	  private WebElement loginBtn;

	  /*@CacheLookup
	  	  @FindBys({ //Acts like OR operator
		  @FindBy(xpath="//button[text()='Log in']"),
		  @FindBy(xpath="//button[@name='login']"),
		  @FindBy(xpath="//button[@id='u_0_b_Di']"),
		  @FindBy(xpath="//button[@type='submit']")
	  }) 
	  private WebElement loginFindBys;
	  
	  @CacheLookup
  	  @FindAll({ //Acts like And Operator
	  @FindBy(xpath="//button[text()='Log in']"),
	  @FindBy(xpath="//button[@name='login']"),
	  @FindBy(xpath="//button[@id='u_0_b_Di']"),
	  @FindBy(xpath="//button[@type='submit']")
  }) 
	  private WebElement loginFindAll;
	  
	  public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}*/

	//3 getters to access
	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	  
	  
}
