package com.facebook_pageObjectModel;

import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLoginTest() {
		System.out.println("page object model");
		LoginPage lp = new LoginPage(driver);
		lp.userName();
		lp.passWord();
		lp.loginButton();
		
	}
	
	@Test
	public void invalidLoginTest() {
		System.out.println("page object model");
		LoginPage lp = new LoginPage(driver);
		lp.userName();
		lp.passWord();
		lp.loginButton();
		
	}

}
