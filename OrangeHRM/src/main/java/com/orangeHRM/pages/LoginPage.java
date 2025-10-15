package com.orangeHRM.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.utilities.DriverUtility;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameField;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboardpageIcon;
	
	public void verifyDashboardPageIcon()
	{
		try {
		boolean isDisplayed = DriverUtility.elementIsDisplayed(dashboardpageIcon);
		if(isDisplayed)
		{
			System.out.println("Login Successful...");
		}
		else
		{
			System.err.println("Login Failed..");
		}
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Invalid credentials");
			Assert.fail("Please Check the username and password");
		}
	}
	
	
	public void verifyLogin(String username,String password)
	{
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
		verifyDashboardPageIcon();
	}

	public void clickLoginButton()
	{
		DriverUtility.clickElement(loginButton);
	}
	public void enterUsername(String username)
	{
		DriverUtility.fill(usernameField, username);
	}
	
	public void enterPassword(String password)
	{
		DriverUtility.fill(passwordField, password);
	}
	
	
	

}
