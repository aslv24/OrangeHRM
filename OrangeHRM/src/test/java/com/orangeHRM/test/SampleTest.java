package com.orangeHRM.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;
import com.orangeHRM.pages.CreateNewAccountPage;
import com.orangeHRM.utilities.DriverUtility;
import com.orangeHRM.utilities.ListenersUtility;

@Listeners(ListenersUtility.class)
public class SampleTest extends BaseClass {
	
	CreateNewAccountPage createNewAccountPage;

	@BeforeTest
	public void setup() {
		
		setDriver(BrowserType.CHROME);

		DriverUtility.maximize();

		DriverUtility.setImplicitlywait(2);

		DriverUtility.openPageUrl(Constants.PAGE_URL);
		
		createNewAccountPage=new CreateNewAccountPage();

	}
	
	@Test(priority = 0)
	public void verifyTitle()
	{
		String pageTitle = DriverUtility.getPageTitle();
		System.out.println(pageTitle);
	}
	
	@Test(priority = 1)
	public void verifyUrl()
	{
		String pageUrl = DriverUtility.getPageUrl();
		System.out.println(pageUrl);
	}

	@Test(priority = 2)
	public void verifyCreateAccount() {
		createNewAccountPage.verifyAccountCreation("logeshwaran", "sivasamy", 29, 4, "1992");
		
	}

}
