package com.orangeHRM.base;

public class Constants {

	final public static int SHORT_WAIT = Integer.parseInt(PropertyReader.getProperty("timeout.short.wait"));
	final public static int MEDIUM_WAIT = Integer.parseInt(PropertyReader.getProperty("timeout.medium.wait"));
	final public static int LONG_WAIT = Integer.parseInt(PropertyReader.getProperty("timeout.long.wait"));

	final public static String PAGE_URL = PropertyReader.getProperty("base.app.url");

	final public static String CHROME_KEY = PropertyReader.getProperty("base.driver.chrome.key");
	final public static String CHROME_VALUE = PropertyReader.getProperty("base.driver.chrome.value");

	final public static String EDGE_KEY = PropertyReader.getProperty("base.driver.edge.key");
	final public static String EDGE_VALUE = PropertyReader.getProperty("base.driver.edge.value");

	final public static String FIREFOX_KEY = PropertyReader.getProperty("base.driver.firefox.key");
	final public static String FIREFOX_VALUE = PropertyReader.getProperty("base.driver.firefox.value");

}
