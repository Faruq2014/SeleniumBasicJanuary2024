package com.facebook_login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTestTwo extends BaseTest{
	
	@Test
	public void validLoginTest() {
		System.out.println(" valid login test ");
		driver.findElement(By.id("email")).sendKeys("nj@vmail.com");
		driver.findElement(By.id("pass")).sendKeys("kjlkjl");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	public void invalidLoginTest() {
		System.out.println(" invalid login test ");
		driver.findElement(By.id("email")).sendKeys("nj@vmail.com");
		driver.findElement(By.id("pass")).sendKeys("kjlkjl");
		driver.findElement(By.name("login")).click();
	}

	
}
