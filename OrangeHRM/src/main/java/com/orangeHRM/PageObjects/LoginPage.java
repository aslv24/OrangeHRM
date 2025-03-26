package com.orangeHRM.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestUtility.DriverHelper;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Crea")
	private WebElement createButton;//global variable
	
	
	public void clickCreateButton()
	{
		DriverHelper.click(createButton);
	}
	
	
	
}
