package com.facebook_login;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.facebook_base.BaseTest;
import com.facebook_screenShot.ScreenShot;

public class LoginTest  extends BaseTest{
	
	@Test
	public void validLoginTest() {
		System.out.println(" valid login test ");
		driver.findElement(By.id("email")).sendKeys("nj@vmail.com");
		driver.findElement(By.id("pass")).sendKeys("kjlkjl");
		driver.findElement(By.name("login")).click();
		ScreenShot sc= new ScreenShot();
		sc.screenShot();
		sc.rollUpScreenShot();
		sc.dynamicRollUpScreenShot("loginOne");
		
	}
	
	//@Test
	public void invalidLoginTest() {
		System.out.println(" invalid login test ");
		driver.findElement(By.id("email")).sendKeys("nj@vmail.com");
		driver.findElement(By.id("pass")).sendKeys("kjlkjl");
		driver.findElement(By.name("login")).click();
	}

	
}
