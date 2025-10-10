package com.orangeHRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class BaseClass {

	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
	public static void setDriver(String browserName)
	{
		WebDriver driverInstance=null;
		
		switch(browserName.toLowerCase())
		{
		case BrowserType.CHROME:
			System.setProperty(Constants.CHROME_KEY, Constants.CHROME_VALUE);
			driverInstance=new ChromeDriver();
			break;
		
		case BrowserType.EDGE:
			System.setProperty(Constants.EDGE_KEY, Constants.EDGE_VALUE);
			driverInstance=new EdgeDriver();
			break;
		
		case BrowserType.FIREFOX:
			System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_VALUE);
			driverInstance=new FirefoxDriver();
			break;
		}
		
		driver.set(driverInstance);
	}
}
