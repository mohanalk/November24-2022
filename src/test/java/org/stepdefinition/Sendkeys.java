package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement eMail=driver.findElement(By.id("email"));
		WebElement passWord= driver.findElement(By.id("pass"));
		eMail.sendKeys("selenium@gmail.com");
		passWord.sendKeys("abcdef");
	}

}
