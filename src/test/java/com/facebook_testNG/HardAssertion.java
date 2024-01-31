package com.facebook_testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	public WebDriver driver;
	@Test
	public void additionTest() {
		Assert.assertEquals(2, 2);
		Assert.assertNotEquals(2, 4);
		
		
	}
	@Test
	public void equalTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedTitle=driver.getTitle();
		String actualTitle="Facebook - log in or sign up";
		Assert.assertEquals(expectedTitle, actualTitle ,"<<<<they are not equal>>>>");
		Assert.assertNotEquals(expectedTitle, actualTitle ,"<<<<they are equal>>>>");
		
	}
	
	@Test
	public void assertTrueTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedTitle=driver.getTitle();
		String actualTitle="Facebook - log in or sign up11";
		Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
		Assert.assertFalse(expectedTitle.equalsIgnoreCase(actualTitle));
		
		
	}
	
	@Test
	public void assertSameTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedTitle=driver.getTitle();
		String actualTitle="Facebook - log in or sign up11";
		Assert.assertNotSame(actualTitle, expectedTitle, "<<<<They are Same");
		Assert.assertSame(actualTitle, expectedTitle,"<<<They are not same>>>");
		
		
		
		
	}

}
