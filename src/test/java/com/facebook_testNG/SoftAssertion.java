package com.facebook_testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	public WebDriver driver;
	@Test
	public void assertSameTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedTitle=driver.getTitle();
		String actualTitle="Facebook - log in or sign up";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertNotEquals(actualTitle, expectedTitle," <<<they are equals>>>");
		System.out.println("it run");
		softAssert.assertEquals(actualTitle, expectedTitle," <<<they are not equals>>>");
		System.out.println("it run agin");
		
		softAssert.assertNotSame(actualTitle, expectedTitle, "<<<<They are Same");
		softAssert.assertSame(actualTitle, expectedTitle,"<<<They are not same>>>");
		
		softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
		softAssert.assertFalse(expectedTitle.equalsIgnoreCase(actualTitle));
		
		softAssert.assertAll();
		
		
	}
}
