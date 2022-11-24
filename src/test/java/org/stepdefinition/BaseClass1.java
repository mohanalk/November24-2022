package org.stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1{

		
	public  static WebDriver driver;

		public static void browserLaunch(String browserName) {
						if(browserName.equals("chrome")) {
						WebDriverManager.chromedriver().setup();
						driver=new ChromeDriver();
		
						}
					else if(browserName.equals("edge"))
					{
							
					 WebDriverManager.edgedriver().setup();
					 driver=new EdgeDriver();
					}
				 driver.manage().window().maximize();
				
				}
		
		
		public static String jdbcConnection() {
			Connection con=null;
			
			String sfirstName= " ";
		try {
			
				// 1. load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "mohana");
			
					String query="select FIRST_NAME from employees where FIRST_NAME='Lex' ";

			PreparedStatement ps=con.prepareStatement(query);
			ResultSet ex=ps.executeQuery();
			while(ex.next()) {
				sfirstName=ex.getString("FIRST_NAME");
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
					
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
						}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
			
		return sfirstName;
}
		
	public static void launchUrl(String url) {
		  driver.get(url);
	
	}
	
	public static void getTheWebPageTitle() {
	String title = driver.getTitle();
    	System.out.println(title);
	
	}
	
	public static void getBtnPosition(WebElement e) {
	Point xyPoint = e.getLocation();
	int xValue = xyPoint.getX();
	int yValue = xyPoint.getY();
	System.out.println("X value is :  " + xValue + "  Y value is : " + yValue);
	}
	
	public static void getButtonSize(WebElement e) {
	int height = e.getSize().getHeight();
	int width = e.getSize().getWidth();
	System.out.println("Height of the button is : "+height+" Width of the button is : "+width);
	}
	
	public static void getWebCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
	
	} 
	
	public void sendkeys(WebElement w, String value) {
		w.sendKeys(value);
	}
	
	public void clickButton(WebElement e) {
		e.click();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	/*static	Actions a;
	public static void actions(WebElement target) {
	//needs webdriver access
		a=new Actions(driver);
	a.moveToElement(target).perform();
	
		}
	
	public static void doubleClick(WebElement target) {
		//needs webdriver access
			a=new Actions(driver);
		a.doubleClick(target).perform();
			}
	public static void dragAndDrop (WebElement source,WebElement target) {
		//needs webdriver access
			a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
			}
	public static void contextClick (WebElement target) {
		//needs webdriver access
			a=new Actions(driver);
		a.contextClick(target).perform();
			}
	
	static Select s;
	
	
	public static void selectByIndex(WebElement e, int index) {
		
		s= new Select(e);
		s.selectByIndex(index);*/
		
		//	}
}
