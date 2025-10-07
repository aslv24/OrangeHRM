package com.orangeHRM.test;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.base.Constants;

public class SampleTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setDriver(Constants.FIREFOX);
		
		getDriver().manage().window().maximize();
		
		getDriver().get(Constants.PAGE_URL);
		
	}

}
