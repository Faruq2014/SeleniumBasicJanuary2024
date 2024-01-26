package com.facebook_pageObjectModelWithPageFactory;

import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class RegistrationTestWithPFI extends BaseTest{
	@Test
	public void registrationTest() {
		RegistrationPageWithPFI rpp= new RegistrationPageWithPFI(driver);
		rpp.createNewAccount();
		rpp.firstName("Tilottoma");
		rpp.lastName("hjhjh");
		rpp.mobleNumber("877989879");
		rpp.newPassword("kjkj");
		rpp.birthMonth("Feb");
		rpp.birthDay("14");
		rpp.birthYear("1980");
		rpp.selectGender("female");
		
	}

}
