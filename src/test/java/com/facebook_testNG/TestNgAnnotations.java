package com.facebook_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
/*
	BeforeSuite
	BeforeTest
	BeforeClass
	BeforeMethod
	Test 
	AfterMethod
	AfterClass
	AfterTest
	AfterSuite

 */ 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("suites starts");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test starts");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Class starts");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Method starts");
	}
	
	
	//////
	@Test 
	public void loginTest() {
		System.out.println("this is login test");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("suites Finish");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Test Finish");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Class Finish");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Method Finish");
	}
}
