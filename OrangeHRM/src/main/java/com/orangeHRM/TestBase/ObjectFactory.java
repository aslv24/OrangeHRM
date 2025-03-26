package com.orangeHRM.TestBase;

import com.orangeHRM.PageObjects.CreatePage;
import com.orangeHRM.PageObjects.LoginPage;

public class ObjectFactory {

	
	public CreatePage getInstanceOfCreatePage()
	{
		return new CreatePage();
	}
	
	public LoginPage getInstanceOfLoginPage()
	{
		return new LoginPage();
	}
}
