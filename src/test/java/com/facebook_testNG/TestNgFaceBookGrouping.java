package com.facebook_testNG;

import org.testng.annotations.Test;

public class TestNgFaceBookGrouping {
	
	
	@Test(groups={"smoke","regression"})
	public void loginTest() {
		
	}
	
	@Test(groups="regression")
	public void invalidLoginTest() {
		
	}
	
	@Test(groups={"regression","smoke"})
	public void gameLinkTest() {
		
	}
	@Test(groups={"functional","regression"})
	public void invalidGameLinkTest() {
		
	}
	
	@Test(groups={"functional","regression"})
	public void languageLinkTest() {
		
	}
	
	@Test(groups="functional")
	public void invalidLanguageLinkTest() {
		
	}
	
	@Test(groups="functional")
	public void messangerTest() {
		
	}
	@Test(groups="functional")
	public void invalidMessangerTest() {
		
	}

}
