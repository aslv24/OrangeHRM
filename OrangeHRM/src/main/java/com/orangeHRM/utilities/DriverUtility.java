package com.orangeHRM.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
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
	
	public static void captureScreenshot(String fileName)
	{
		File screenshotTo=new File(Constants.SCREEN_PATH+fileName+Constants.SCREEN_TYPE);
		TakesScreenshot screen=(TakesScreenshot)getDriver();
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshotAs, screenshotTo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
