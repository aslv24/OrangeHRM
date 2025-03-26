package com.orangeHRM.TestBase;

public class Constants {

	
	static PropertyReader reader=new PropertyReader();
	
	final public static String pageURL=reader.getValue("pageURL");
	
	final public static String userName=reader.getValue("userName");
	
	final public static String password=reader.getValue("password");
	
	final public static String browserName=reader.getValue("browserName");
	
	final public static String warningMessage=reader.getValue("warningMessage");
	
	final public static String screenshotPath=reader.getValue("screenshotPath");
	
	final public static String reportPath=reader.getValue("reportPath");
	
	final public static String chromeBrowser="chrome";
	
	final public static String edgeBrowser="edge";
	
	final public static String firefoxBrowser="firefox";
	
	final public static int longWait=30;
	
	final public static int mediumWait=20;
	
	final public static int shortWait=10;
	
	
}
