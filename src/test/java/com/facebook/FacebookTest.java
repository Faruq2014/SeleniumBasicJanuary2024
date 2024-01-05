package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
	@Test
	public void m1Test() {
		System.out.println("hello selenium tester");
		
		//boni garicia  this is exe file
		WebDriverManager.chromedriver().setup();
		//this is our browser version, always updated one from chorme/default
		driver= new ChromeDriver();
		//face book url
		driver.get("https://www.facebook.com/");
		
		
	}
}
