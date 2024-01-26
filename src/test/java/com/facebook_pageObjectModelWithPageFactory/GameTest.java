package com.facebook_pageObjectModelWithPageFactory;

import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class GameTest extends BaseTest{

	@Test
	public void  CharmGameTest() {
		GamePage gp = new GamePage(driver);
		gp.gamePageLink();
		gp.loduClubLink();
	}
}
