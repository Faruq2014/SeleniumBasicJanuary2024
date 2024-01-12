package com.facebook_locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class XpathLocators extends BaseTest{
	
	//@Test
	public void basicXpath() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("klklk");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("klklk");
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("klklk");
		
	}
	
	//@Test
	public void AndXpath() {
		//and condition both side has to be true
		driver.findElement(By.xpath("//input[@id='email'][@name='email']")).sendKeys("klklk");		
	}
	
	//@Test
	public void orXpath() {
		//or condition one of the side has to be true
		driver.findElement(By.xpath("//input[@id='email'or @name='email123']")).sendKeys("klklk");		
	}
	
	@Test
	public void linkXpath() {
		//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
	}

}
