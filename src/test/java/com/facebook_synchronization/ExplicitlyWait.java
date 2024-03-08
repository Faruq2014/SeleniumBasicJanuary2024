package com.facebook_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWait {
	/*
	 * explicitlyWait implemented on 
	 *    for some web element which takes more time than normal elements
	 *    
	 *  write on that special elements
	 *     make sure to write appropriate ExpectedConditions
	 *  set up duration of the time 
	 *  for an example if you duration of time is 20 seconds:
	 *       if it is find in 15 seconds-->it will not wait any more
	 *       if it can not find in 20 seconds-->it will fail
	 */
	public WebDriver driver;
	
	@Test
public void loginTest() {
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("email")).sendKeys("hjkj");
	driver.findElement(By.name("pass")).sendKeys("jny123");
	driver.findElement(By.name("login")).click();
	
	
	WebElement notYou=driver.findElement(By.xpath("//a[text()='Not you?']"));
	//explicit wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(notYou)).click();
	
	

}
}
