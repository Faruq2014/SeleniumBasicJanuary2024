package com.facebook_pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void userName() {
		driver.findElement(By.id("email")).sendKeys("klk");
	}
	
	public void passWord() {
		driver.findElement(By.id("pass")).sendKeys("jjj");
	}
	
	public void loginButton() {
		driver.findElement(By.name("login")).click();
	}
	
}
