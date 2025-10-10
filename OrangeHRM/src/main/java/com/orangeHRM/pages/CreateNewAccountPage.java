package com.orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.base.BaseClass;
import com.orangeHRM.utilities.DriverUtility;

public class CreateNewAccountPage extends BaseClass{
	
	public CreateNewAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[starts-with(text(),'Create')]")
	private WebElement createNewAccountButton;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameField;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnameField;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement dayDropdownField;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement monthDropdownField;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement yearDropdownField;
	
	
	public void verifyAccountCreation(String firstname,String lastname,int day,int month,String year)
	{
		clickCreateNewAccount();
		enterFirstnameField(firstname);
		enterlastnameField(lastname);
		chooseDayDropdownField(day);
		chooseMonthDropdownField(month);
		chooseyearDropdownField(year);
	}

	public void clickCreateNewAccount()
	{
		DriverUtility.clickElement(createNewAccountButton);
	}
	public void enterFirstnameField(String firstname)
	{
		DriverUtility.fill(firstnameField, firstname);
	}
	
	public void enterlastnameField(String lastname)
	{
		DriverUtility.fill(lastnameField, lastname);
	}
	
	public void chooseDayDropdownField(int day)
	{
		DriverUtility.dropdownByIndex(dayDropdownField, day);
	}
	
	public void chooseMonthDropdownField(int month)
	{
		DriverUtility.dropdownByIndex(monthDropdownField, month);
	}
	
	public void chooseyearDropdownField(String year)
	{
		DriverUtility.dropdownByVisibleText(yearDropdownField, year);
	}
	

}
