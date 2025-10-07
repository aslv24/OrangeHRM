package com.orangeHRM.base;

public class Constants {

	
	final public static String CHROME="chrome";
	final public static String EDGE="edge";
	final public static String FIREFOX="firefox";
	
	final public static String PAGE_URL=PropertyReader.getProperty("base.app.url");
	
	final public static String CHROME_KEY=PropertyReader.getProperty("base.driver.chrome.key");
	final public static String CHROME_VALUE=PropertyReader.getProperty("base.driver.chrome.value");
	
	final public static String EDGE_KEY=PropertyReader.getProperty("base.driver.edge.key");
	final public static String EDGE_VALUE=PropertyReader.getProperty("base.driver.edge.value");
	
	final public static String FIREFOX_KEY=PropertyReader.getProperty("base.driver.firefox.key");
	final public static String FIREFOX_VALUE=PropertyReader.getProperty("base.driver.firefox.value");
	
}
