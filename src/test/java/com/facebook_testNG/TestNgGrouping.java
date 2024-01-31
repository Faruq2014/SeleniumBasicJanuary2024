package com.facebook_testNG;

import org.testng.annotations.Test;

public class TestNgGrouping {
	//smoke test== as soon as build come to you
	     //main functionalities, critical functionalities
	/*
	 * functional test
	 *    all the functionalities working
	 *    specially on that sprint
	 */
	
	/*
	 * regression test
	 * because new functionalities, make sure old functionalities does not break
	 */
	
	
	
	
	
	@Test(groups={"smoke","regression"})
	public void videoTest() {
		
	}
	
	
	@Test(groups="regression")
	public void placesTest() {
		
	}

	
	@Test(groups="regression")
	public void marketPlaceTest() {
		
	}
	@Test(groups={"smoke"})
	public void metaPayTest() {
		
	}

}
