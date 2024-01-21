package com.facebook_pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindByLocator {
	WebDriver driver;
	
	public FindByLocator(WebDriver dirver) {
		super();
	    this.driver = dirver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (id="email") public WebElement userName;
	
	//WebElement user= driver.findElement(By.id("email"))
	
	//WebElement user= driver.findElement(By.id("email"));
	// user.sendKeys(enterUserName);
	
	public WebElement userNameMethod(String enterUserName) {
		userName.sendKeys(enterUserName);
		return userName;
	}
	
public WebElement userNameMethodOne(String enterUserName) {
	userName.sendKeys(enterUserName);
	return userName;
	}
}
