package com.orangeHRM.TestRunner;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangeHRM.Listeners.ListenersHelper;
import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestBase.Constants;
import com.orangeHRM.TestBase.ObjectFactory;
import com.orangeHRM.TestUtility.DriverHelper;


@Listeners(ListenersHelper.class)
public class SampleRun extends BaseClass{

	ObjectFactory instanceOf;
	
	String expectedTitle="Facebook � log in or sign up";
	
	String expectedURL="https://www.facebook.com/";
	
	int expectedYearSize=121;
	
	SoftAssert softAssert;
	@BeforeClass
	public void beforeSetUp() throws IOException
	{
		getDriver(Constants.browserName);
		DriverHelper.maximize();
		DriverHelper.implictWait(3);
		DriverHelper.get(Constants.pageURL);
		instanceOf=new ObjectFactory();
		
	}
	
	@Test(priority = 0)
	public void printTitle()
	{
		String actualTitle = DriverHelper.getTitle();
		softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle,expectedTitle);
		System.out.println(actualTitle);
		softAssert.assertAll();
	}
	
	@Test(priority = 1)
	public void printCurrentUrl()
	{
		String actualCurrentUrl = DriverHelper.getCurrentUrl();
		softAssert=new SoftAssert();
		softAssert.assertEquals(actualCurrentUrl,expectedURL);
		System.out.println(actualCurrentUrl);
		softAssert.assertAll();
	}
	
	@Test(priority = 3)
	public void verifyYearDropDown()
	{
		List<WebElement> yearDropDown = instanceOf.getInstanceOfCreatePage().getYearDropDown();
		int actualSize = yearDropDown.size();
		softAssert=new SoftAssert();
		softAssert.assertEquals(actualSize,expectedYearSize);
		System.out.println(actualSize);
		for (WebElement aa : yearDropDown) {
			System.out.println(aa.getText());
		}
		softAssert.assertAll();
	}
	
	@Test(priority = 2)
	public void verifyCreateAccount()
	{
		try {
		instanceOf.getInstanceOfLoginPage().clickCreateButton();
		instanceOf.getInstanceOfCreatePage().enterFirstNameField("admin");
		instanceOf.getInstanceOfCreatePage().enterYearDropDown("1992");//public method
		}
		catch(NoSuchElementException e)
		{
			Assert.fail("Please check the xpath...");
		}
	}
}
