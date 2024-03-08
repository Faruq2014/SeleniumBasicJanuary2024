package com.facebook_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWait {
	/*
	 * implicitlyWait implemented on 
	 *    findElement
	 *    findElements
	 *  write only one time and it is implemented as many time you use findElement/findElements
	 *  duration of the time is same for every time
	 *  for an example if you duration of time is 10 seconds:
	 *       if it is find in 5 seconds-->it will not wait any more
	 *       if it can not find in 10 seconds-->it will fail
	 */
	public WebDriver driver;
	
	@Test
public void loginTest() {
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("email")).sendKeys("hello");
	driver.findElement(By.name("pass")).sendKeys("hello123");

}
}
