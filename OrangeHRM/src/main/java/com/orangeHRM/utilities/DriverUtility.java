package com.orangeHRM.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;

public class DriverUtility extends BaseClass{

	
	public static void maximize()
	{
		getDriver().manage().window().maximize();
	}
	
	public static void setImplicitlywait()
	{
		getDriver().manage().timeouts().implicitlyWait(Constants.LONG_WAIT, TimeUnit.SECONDS);
	}
	
	public static void openPageUrl(String pageUrl)
	{
		getDriver().get(pageUrl);
	}
	
	public static String getPageTitle()
	{
		return getDriver().getTitle();
	}
	
	public static String getPageUrl()
	{
		return getDriver().getCurrentUrl();
	}
	
	public static void fill(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static void clickElement(WebElement element)
	{
		element.click();
	}
}
