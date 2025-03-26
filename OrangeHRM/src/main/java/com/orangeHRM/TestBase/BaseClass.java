package com.orangeHRM.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	
	protected static WebDriver driver;
	
	public void getDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase(Constants.chromeBrowser))
		{
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase(Constants.edgeBrowser))
		{
			driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase(Constants.firefoxBrowser))
		{
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.err.println(Constants.warningMessage);
			throw new IllegalArgumentException();
		}
	}
}
