package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseApp {
	WebDriver driver;
	/*how do you open browser?
	 * how do you open Application?
	 */
//Functional testing
	@BeforeTest
	public void openApplication() {
	//how do you open browser?
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//how do you maximize application
	driver.manage().window().maximize();
	
	//what is implicit wait== wait until find the elements
	//it is implemented on find element method
	// only write one time in the class it will be implemented on all the find elements
	//Duration.ofSeconds(10)==wait maximum 10 seconds
	//if you find before 10 seconds then do not wait any more go to next line
	//if you can not find it in 10 seconds then fail the application== Not found exception
	//industry standard is 12 seconds to load an elements
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	//test
	@Test
	public void userNameTest() {
		System.out.println("this is user name");
		driver.findElement(By.id("email")).sendKeys("Faruq");
	}
	
	//test
	@Test
	public void PasswordTest() {
		System.out.println("this is password");
		driver.findElement(By.id("pass")).sendKeys("kljklj");
	}
	
	//test
	@Test
	public void loginButtonTest() {
		System.out.println("this is login button");
		driver.findElement(By.name("login")).click();
	}
	
	
	//how to closeApp?
	@AfterTest
	public void closeApplication() {
		driver.quit();
		//driver.close();
	}
	
	
}
