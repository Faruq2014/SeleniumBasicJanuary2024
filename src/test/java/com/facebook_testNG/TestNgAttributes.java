package com.facebook_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAttributes {
	@Test(priority=2, description="this is user test",invocationTimeOut=4)
	public void userTest() {
		System.out.println("this is user test");
	}
	@Test(priority=0)
	public void loginTest() {
		System.out.println("this is login test");
		Assert.assertEquals(2, 3);
	}

	@Test(priority=3,invocationCount=3)
	public void artTest() {
		System.out.println("this is art test");
	}
	@Test(priority=1,dependsOnMethods="loginTest")
	public void registrationTest() {
		System.out.println("this is registration test");
	}

}
