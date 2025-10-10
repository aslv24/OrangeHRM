package com.orangeHRM.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;

public class DriverUtility extends BaseClass{

	static Select select;
	
	public static void maximize()
	{
		getDriver().manage().window().maximize();
	}
	
	public static void setImplicitlywait()
	{
		getDriver().manage().timeouts().implicitlyWait(Constants.LONG_WAIT, TimeUnit.SECONDS);
	}
	
	public static void setImplicitlywait(int wait)
	{
		getDriver().manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
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
	
	public static void dropdownByIndex(WebElement element,int index)
	{
		select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void dropdownByValue(WebElement element,String value)
	{
		select=new Select(element);
		select.selectByValue(value);
	}
	
	public static void dropdownByVisibleText(WebElement element,String visibleText)
	{
		select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public void switchToFrame(int index)
	{
		getDriver().switchTo().frame(index);
	}
	
	public void switchToFrame(String nameOrId)
	{
		getDriver().switchTo().frame(nameOrId);
	}
	
	public void switchToFrame(WebElement element)
	{
		getDriver().switchTo().frame(element);
	}
	
	public void leaveFrame()
	{
		getDriver().switchTo().defaultContent();
	}
	
}
