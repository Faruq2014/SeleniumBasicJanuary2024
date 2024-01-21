package com.facebook_pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void userName(String enterUserName) {
		driver.findElement(By.id("email")).sendKeys(enterUserName);
	}
	
	public void passWord(String enterPassword) {
		driver.findElement(By.id("pass")).sendKeys(enterPassword);
	}
	
	public void loginButton() {
		driver.findElement(By.name("login")).click();
	}
	
	public WebElement userNameOne(String enterUserName ) {
		WebElement user= driver.findElement(By.id("email"));
		 user.sendKeys(enterUserName);
		return user;
		 
	}
	
}
