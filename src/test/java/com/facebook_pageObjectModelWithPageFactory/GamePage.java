package com.facebook_pageObjectModelWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePage {
	
public WebDriver driver;



public GamePage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
	  
}

@FindBy(linkText="Games") public WebElement gamePage;
public void gamePageLink() {
	gamePage.click();
}


@FindBy(xpath="//span[contains(text(),'Ludo Club')]") public WebElement ludoClub;
public void loduClubLink() {
	ludoClub.click();
}

}
