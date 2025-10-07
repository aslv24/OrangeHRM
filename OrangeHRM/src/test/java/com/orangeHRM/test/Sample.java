package com.orangeHRM.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pro=new Properties();
		
		pro.load(new FileInputStream("src/main/resources/properties/config.properties"));
		
		String aValue = pro.getProperty("a");
		
		String bValue = pro.getProperty("b");
		
		System.out.println(aValue+bValue);

	}

}
