package org.stepdefinition;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityExample {
	
	public  static WebDriver driver;
	
	public static  void sendkeys(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static  void clickButton(WebElement e) {
		e.click();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	/*public static void browserLaunch(String browserName) {
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

} */



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
