package com.facebook_pageObjectModelWithPageFactory;

import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTestWithPageFactory extends BaseTest{
	
	@Test
	public void validLoginTest() {
		LoginPageWithPageFactory lpp= new LoginPageWithPageFactory(driver);
		lpp.userName("Tillottoma");
		lpp.password("Till123");
		lpp.loginButton();
	}

}
