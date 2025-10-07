package com.orangeHRM.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	static Properties properties;
	
	static
	{
		try {
		properties=new Properties();
		properties.load(new FileInputStream("src/main/resources/properties/config.properties"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		return properties.getProperty(key);
	}
}
