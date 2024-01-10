package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class RadioButton extends BaseTest {

	@Test
	public void radioButtonTest() {
		WebElement newAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		newAccount.click();
		WebElement female = driver.findElement(By.xpath("//input[starts-with(@id, 'u_2_4')]"));
		female.click();

		boolean femaleSelected = female.isSelected();
		System.out.println(femaleSelected);

		// System.out.println(female.isSelected());
		if (femaleSelected) {
			System.out.println("user is female");
		} else {
			System.out.println("user is male");
		}

	}

}
