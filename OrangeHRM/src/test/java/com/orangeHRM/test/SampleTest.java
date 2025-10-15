package com.orangeHRM.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.utilities.DriverUtility;
import com.orangeHRM.utilities.ListenersUtility;

@Listeners(ListenersUtility.class)
public class SampleTest extends BaseClass {
	
	LoginPage loginPage;
	SoftAssert softAssert;

	@BeforeTest
	public void setup() {
		
		setDriver(BrowserType.CHROME);

		DriverUtility.maximize();

		DriverUtility.setImplicitlywait(2);

		DriverUtility.openPageUrl(Constants.PAGE_URL);
		
		loginPage=new LoginPage();

	}
	
	@Test(priority = 0)
	public void verifyTitle()
	{
		String expectedTitle="OrangeHRM";
		String pageTitle = DriverUtility.getPageTitle();
		softAssert=new SoftAssert();
		softAssert.assertEquals(pageTitle,expectedTitle);
		System.out.println(pageTitle);
		softAssert.assertAll();
	}
	
	@Test(priority = 1)
	public void verifyUrl()
	{
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String pageUrl = DriverUtility.getPageUrl();
		softAssert=new SoftAssert();
		softAssert.assertEquals(pageUrl,expectedUrl);
		System.out.println(pageUrl);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void verifyCreateAccount() {
		loginPage.verifyLogin("admin", "admin123");
		
	}
	
//	@Test(priority = 3)
//	public void verifyLinksCount()
//	{
//		List<WebElement> links = getDriver().findElements(By.tagName("a"));
//		System.out.println(links.size());
//	}

}
