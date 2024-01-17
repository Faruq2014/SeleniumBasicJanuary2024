package com.facebook_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class ContaninFunction extends BaseTest{
	
	//@Test
	public void basicContainFunction() {
		//tag[contains(@attribute_name,'attribute_value')]
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
	}

	
	
	@Test
	public void containTextFunction() {
		
		//what is contain text function
		// it is two function together such as text()  and contain()
		// when should we use them
		// for tag like p, h1,h2 
		// contain as much as needed from the text value
		
		
		
		
		
		//a[text()='Meta Pay']
		//h2[text()='Connect with friends and the world around you on Facebook.']
		
		
		//button[contains(@id,'u_0_5')]
	//	//h2[contains(@class,'_8eso')]
		
		//a[contains(text(),'Forgot account?')]
		
		//   //h2[contains(text(),'Connect with friends')]
		
		WebElement connectFriend=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends')]"));
		System.out.println(connectFriend.getText());
	}
}
