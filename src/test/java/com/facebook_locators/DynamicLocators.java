package com.facebook_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class DynamicLocators extends BaseTest{
	             //how do you handle dynamic xpath?
	// there are two methods i used in my current application/project/current sprint  to handle dynamic xpath
	// number one method/ most important one is starts-with function
	//* //tag[starts-with (@attrubute,'value')]
	// second important one is contains
	////tagName[contains(@attribute,'value')]
	
	
	/*
	 * //tag[starts-with (@attrubute,'value')]
		//*[contains(@attribute_name,'attribute_value')]
		findElement(By.xpath("(//input[@type='text'])[position()=2]"))
		or
		findElement(By.xpath("(//input[@type='text'])[2]"))
	 */
	//@Test
	public void startWith() {
		//if any attribute has dynamic vaule
		//tag[starts-with (@attrubute,'value')]
		// normally we do not put dynamic value of the attributes
		
		driver.findElement(By.xpath("//button[starts-with (@id,'u_0_5')]")).click();
	}
	
	@Test 
	public void containFunction() {
		//tag[contains(@attribute_name,'attribute_value')]
		// if some attributes has long value
		// if any attributes has dynamic value
		
		//tagName[contains(@attribute,'value')]
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
		//WebElement connectFriend=driver.findElement(By.xpath("//h2[contains(@class,'_8eso')]"));
		//System.out.println(connectFriend.getText());

		
	}

}
