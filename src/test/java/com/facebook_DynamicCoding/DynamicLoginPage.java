package com.facebook_DynamicCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoginPage {
	WebDriver driver;

	public DynamicLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void userName(String enterUsername) {
		driver.findElement(By.id("email")).sendKeys(enterUsername);
	}
	
	public void passWord(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
	}
	
	public void loginButton() {
		driver.findElement(By.name("login")).click();
	}
	
}
