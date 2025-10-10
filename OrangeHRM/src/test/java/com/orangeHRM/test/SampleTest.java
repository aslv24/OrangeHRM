package com.orangeHRM.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;
import com.orangeHRM.utilities.DriverUtility;

public class SampleTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setDriver(BrowserType.CHROME);
		
		DriverUtility.maximize();
		
		DriverUtility.setImplicitlywait();
		
		DriverUtility.openPageUrl(Constants.PAGE_URL);
		
		WebElement emailField = getDriver().findElement(By.id("email"));
		
		WebElement passwordField = getDriver().findElement(By.id("pass"));
		
		WebElement loginButton = getDriver().findElement(By.name("login"));
		
		DriverUtility.fill(emailField, "email@mail.com");
		
		DriverUtility.fill(passwordField, "Email@123");
		
		DriverUtility.clickElement(loginButton);
		
	}

}
