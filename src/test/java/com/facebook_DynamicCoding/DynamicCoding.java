package com.facebook_DynamicCoding;

import org.testng.annotations.Test;

import com.facebook_base.BaseTest;


public class DynamicCoding extends BaseTest{
	
	@Test
	public void taniaLoginTest() {
		DynamicLoginPage dlp = new DynamicLoginPage(driver);
		dlp.userName("tania");
		dlp.passWord("lkjl");
		dlp.loginButton();
	}
	
	@Test
	public void sadiaLoginTest() {
		DynamicLoginPage dlp = new DynamicLoginPage(driver);
		dlp.userName("sadia");
		dlp.passWord("lkjl");
		dlp.loginButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
