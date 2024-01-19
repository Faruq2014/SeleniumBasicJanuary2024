package com.facebook_locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class CSS extends BaseTest{

	//@Test
	public void basicCSS() {
		//                    [attribute_name='value']
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("lkjlkj");
		driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy _9npi']")).sendKeys("hay");
		driver.findElement(By.cssSelector("[name='login']")).click();
		
	}
	/*short form of CSS
	 *  Id=#
		Class=.
		For dynamic:
		Contain=tag:contains(value)
		Start with=^
		Ends with=$
		Sub string =*
		Unorder list ul=“nth-of-type()”

	 */
	
	//@Test
	public void shortCSS() {
		//[attribute_name='value']
		driver.findElement(By.cssSelector("#email")).sendKeys("lkjlkj");
		//driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy _9npi']")).sendKeys("hay");
		driver.findElement(By.cssSelector("[name='login']")).click();
		
	}
	
	
	@Test
	public void dynamicCSS() {
		//[id^='u_0_5_']
		//[attribute_name='value']
		driver.findElement(By.cssSelector("[id^='email']")).sendKeys("lkjlkj");
		driver.findElement(By.cssSelector("[class^='inputtext _55r1 _6luy _9npi']")).sendKeys("hay");
		driver.findElement(By.cssSelector("[id^='u_0_5']")).click();
		
	}
}
