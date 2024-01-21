package com.facebook_pageObjectModelWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageWithPFI {
	
	WebDriver driver;

	public RegistrationPageWithPFI(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@id,'u_0_0_')]") public WebElement newAcct;
	public void createNewAccount() {
		newAcct.click();
	}
	
	@FindBy(name="firstname") private WebElement fName;
	
	public WebElement firstName(String enterFirstName) {
		fName.sendKeys(enterFirstName);
		return fName;
	}
	
@FindBy(name="lastname") private WebElement lName;

public WebElement lastName(String enterLastName) {
	lName.sendKeys(enterLastName);
	return fName;
}

@FindBy(name="reg_email__") public WebElement mobile;
public WebElement mobleNumber(String enterMobileNumber) {
	mobile.sendKeys(enterMobileNumber);
	return fName;
}

@FindBy(id="password_step_input") public WebElement password;
public WebElement newPassword(String enterNewPassword) {
	password.sendKeys(enterNewPassword);
	return password;	
}

@FindBy(id="month") public WebElement month;
public WebElement birthMonth(String enterBirthMonth) {
	Select monthSelect = new Select(month);
	monthSelect.selectByVisibleText(enterBirthMonth);
	return month;
}

	
	
	

}
