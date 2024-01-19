package com.facebook_findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class FindElements extends BaseTest{
	/*what is find elements method
	 *    if you have more than one web element in the list then we use find elements method
	 *       data type = List<WebElement>  (java.util.List;)
	 *       we use loop to iterate the list and preferable loop is for each
	 *       webElement.getText() to get the string value
	 * 
	 */
	@Test
	public void listOfElements() {
		List<WebElement> listOfLanguage = driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
		System.out.println("there are " + listOfLanguage.size() + " elements");
		for (WebElement webElement : listOfLanguage) {
			System.out.println(webElement.getText());

		}

	}

	
	@Test
	public void listOfLinks() {
		List<WebElement> listOfLanguage = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println("there are " + listOfLanguage.size() + " links");
		for (WebElement webElement : listOfLanguage) {
			System.out.println(webElement.getText());

		}

	}
}
