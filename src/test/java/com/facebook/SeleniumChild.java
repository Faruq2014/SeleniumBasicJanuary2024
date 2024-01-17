package com.facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumChild implements SearchContext {
	/*
	 * SearchContext is the super class for selenium it has two methods
	 * 
	 */

	@Test
	public void superClass() {

	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}
}
