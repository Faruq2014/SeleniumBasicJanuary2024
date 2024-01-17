package com.facebook_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class IndexXpath extends BaseTest{
	
	
	@Test
	public void XpathXes() {
		// when we have list of elements sepcially ul (un-order list) and li (list)
		// node ==//div[@id='pageFooter']
		// exes   == /ul/li
	List<WebElement>	languageList=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li"));
	System.out.println(languageList.size());
	}
	@Test
	public void XpathIndexOrLoop() {
		//if you have more than one value for one attributes
		// class=inputtext _55r1 _6luy , it has two locators
		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[4]")).click();
	}

}
