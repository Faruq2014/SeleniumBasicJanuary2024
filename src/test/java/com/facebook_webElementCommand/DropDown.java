package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class DropDown extends BaseTest {
     //how do you manage drop down in selenium== select method 
	// = Select select = new Select(nested WebElment);
	//how many ways can you select a value from drop down
	//@Test
	public void selectByVisibleText() {
	
		WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		newAccount.click();
		// this is webElement
		WebElement month = driver.findElement(By.id("month"));

		Select select = new Select(month);
		// Select(month);= this is nested WebElement
		select.selectByVisibleText("Mar");

		System.out.println(select.getFirstSelectedOption());

	}

	//@Test
	public void selectByVisibleIndex() {
		WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		newAccount.click();
		
		WebElement day=driver.findElement(By.id("day"));		
		Select daySelect = new Select(day);
		daySelect.selectByIndex(0);
	}
	
	@Test
	public void selectByVisibleValue() {
		WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		newAccount.click();
		
		WebElement day=driver.findElement(By.id("year"));
		Select daySelect= new Select(day);
		daySelect.selectByValue("2018");
		
	}
	
}
