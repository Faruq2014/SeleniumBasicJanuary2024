package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class WebElementCommand extends BaseTest {

	 @Test
	public void inputBox() {
		// how many ways can you manage input box/ send button/
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("jjj@yymail.com");

	}

	@Test
	public void inputBoxWithVariable() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys("jkkj@bamail.com");

	}
	
	@Test
	public void button() {
		WebElement loginButton=driver.findElement(By.name("login"));
		//how many ways can you click in a button?
		//loginButton.click();
		//2nd way of click
		//loginButton.submit();
		//3rd way of click
		loginButton.sendKeys(Keys.ENTER);
		
		/*
		 * WebElement is the data type
		 * loginButton is the variable name
		 * driver.findElement(By.name("login")); is the vlaue
		 */
	}
	
	@Test
	public void linkButton() {
		/*
		 * <a href="https://www.facebook.com/recover/initiate/
		 * ?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA0ODQ0NjE4LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;
		 * ars=facebook_login">Forgot password?<   /a>
		 * 
		 * link starts with <a href /a>==a tag
		 * link text= >Forgot password?<
		 * 
		 */
		
		WebElement linkText=driver.findElement(By.linkText("Forgot password?"));
		linkText.click();
	}
	
	@Test
	public void partialLinkText() {
		WebElement contact=driver.findElement(By.partialLinkText("Contact"));
		contact.click();
		/*
		why do you use partialLinkText?
		 partialLinkText :
		 avoid compound values
		 what is compound values= 
			 values are too big, 
			 space in the middle, 
			 number in the middle, 
			 special character in the middle
		*/
	}
	

}
