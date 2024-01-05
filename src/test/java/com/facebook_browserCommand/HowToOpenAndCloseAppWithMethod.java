package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseAppWithMethod {
	WebDriver driver;
	/*how do you open browser?
	 * how do you open Application?
	 */
 //regression testing/smoke test
	@BeforeMethod
	public void openApplication() {
	//how do you open browser?
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	//test
	@Test
	public void validLoginTest() {
		System.out.println("this is valid login");
		driver.findElement(By.id("email")).sendKeys("Faruq");
		driver.findElement(By.id("pass")).sendKeys("kljklj");
		driver.findElement(By.name("login")).click();


	}
	
	//test
	@Test
	public void invalidLoginTest() {
		System.out.println("this is invalid login");
		driver.findElement(By.id("email")).sendKeys("Faruq");
		driver.findElement(By.id("pass")).sendKeys("jjj");
		driver.findElement(By.name("login")).click();
	}
	
	
	//how to closeApp?
	@AfterMethod
	public void closeApplication() {
		driver.quit();
		//driver.close();
	}
	
	
}
