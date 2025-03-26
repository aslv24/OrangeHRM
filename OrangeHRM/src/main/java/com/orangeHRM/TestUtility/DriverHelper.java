package com.orangeHRM.TestUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestBase.Constants;

public class DriverHelper extends BaseClass{

	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void implictWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.longWait));
	}
	
	public static void implictWait(int wait)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public static void get(String pageURL)
	{
		driver.get(pageURL);
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	public static String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public static boolean elementIsDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public static boolean elementIsEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	public static boolean elementIsSelected(WebElement element)
	{
		return element.isSelected();
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void clear(WebElement element)
	{
		element.clear();
	}
	
	public static void sendKeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public static String alertGetText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void alertOnAccept()
	{
		 driver.switchTo().alert().accept();
	}
	
	public static void alertOnDismiss()
	{
		 driver.switchTo().alert().dismiss();
	}
	
	public static void alertOnSendKeys(String value)
	{
		 driver.switchTo().alert().sendKeys(value);
	}
	
	public static void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element,String visibleText)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public static List<WebElement> getOptions(WebElement element)
	{
		Select select=new Select(element);
		return select.getOptions();
	}
	
	public static void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrame(String idOrName)
	{
		driver.switchTo().frame(idOrName);
	}
	
	public static void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void leaveFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void captureScreenShot(String fileName)
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File screenshotTo=new File(Constants.screenshotPath+"//"+fileName+System.currentTimeMillis()+".png");
		try {
		FileHandler.copy(screenshotAs, screenshotTo);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String captureScreenShotAsBASE64()
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		return screenshot.getScreenshotAs(OutputType.BASE64);
	}
}
