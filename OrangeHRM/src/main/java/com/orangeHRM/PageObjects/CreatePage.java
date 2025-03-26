package com.orangeHRM.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.TestBase.BaseClass;
import com.orangeHRM.TestUtility.DriverHelper;

public class CreatePage extends BaseClass {

	public CreatePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstNameField;//global variable
	
	@FindBy(id = "year")
	private WebElement yearDropdownField;//global variable
	
	public void enterFirstNameField(String value)
	{
		DriverHelper.sendKeys(firstNameField, value);
	}
	
	public void enterYearDropDown(String visibleText)
	{
		DriverHelper.selectByVisibleText(yearDropdownField, visibleText);
	}
	
	public List<WebElement> getYearDropDown()
	{
		return DriverHelper.getOptions(yearDropdownField);
	}
}
