package org.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class PojoMain {
	 
	public  static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(3000);
      WebElement loginName=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));  
      loginName.sendKeys("Admin");
     // Thread.sleep(3000);
      WebElement passWord=  driver.findElement(By.xpath("//		*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));  
      passWord.sendKeys("admin123");
    // Thread.sleep(3000);
      WebElement loginButton=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));  
      //Thread.sleep(1000);
      loginButton.click();
      
      
      
      
			/*//2. private WebElements
				  @CacheLookup
				  @ FindBy(xpath="//input[@name='username']")
				  private WebElement loginName;
				  
				  @CacheLookup
				  @FindBy(xpath="//input[@name='password']")
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
							    
		}*/
		
	}

}
