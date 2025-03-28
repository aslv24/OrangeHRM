package com.orangeHRM.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	
	File file;
	
	FileInputStream inputStream;
	
	Properties properties;
	
	public PropertyReader() {
		
		try {

		file=new File(".\\src\\main\\resources\\Config.properties");
		
		inputStream=new FileInputStream(file);
		
		properties=new Properties();
		
		properties.load(inputStream);
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
	
	public String getValue(String key)
	{
		return properties.getProperty(key);
	}
}
