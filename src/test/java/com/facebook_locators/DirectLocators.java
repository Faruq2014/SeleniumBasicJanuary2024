package com.facebook_locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class DirectLocators extends BaseTest {

	 @Test
	public void idLocator() {
		driver.findElement(By.id("email")).sendKeys("llkj");
		driver.findElement(By.xpath("//*[@id='email']"));
	}

	// @Test
	public void nameLocator() {
		driver.findElement(By.name("pass")).sendKeys("llkj");
	}

	// @Test
	public void classLocator() {
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		;
	}

	// @Test
	public void linkLocator() {
		driver.findElement(By.linkText("Sign Up")).click();
	}

	//@Test
	public void partialLinkLocator() {
		driver.findElement(By.partialLinkText("Voting")).click();
	}

}
